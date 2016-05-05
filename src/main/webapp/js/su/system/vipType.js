$(function() {
	initTable();
});

function initTable() {
	$('#table')
			.edatagrid(
					{
						url : getUrl_table_getAllByPages(),
						toolbar : [
								{
									iconCls : 'icon-add',
									text : "添加一行",
									handler : function() {
										$('#table').edatagrid('addRow');
									}
								},
								{
									iconCls : 'icon-remove',
									text : "删除一行",
									handler : function() {
										var select = $('#table').edatagrid(
												'getSelected');
										if (select) {
											$.messager
													.confirm(
															'删除',
															'您确认删除吗？',
															function(r) {
																if (r) {
																	$
																			.ajax({
																				type : "POST",
																				url : url_table_del,
																				data : select,
																				cache : false,
																				dataType : "text",
																				success : function(
																						data) {
																					if (data
																							&& data
																									.indexOf('失败') != -1) {
																						$.messager
																								.alert(
																										'警告',
																										data);
																					}
																					table_reload();
																				},
																				error : function(
																						e) {
																					$.messager
																							.alert(
																									'警告',
																									'删除失败');
																					table_reload();
																				}
																			});
																}
															});
										}
									}
								}, {
									iconCls : 'icon-save',
									text : "保存数据",
									handler : function() {
										$('#table').edatagrid('saveRow');
									}
								}, {
									iconCls : 'icon-cancel',
									text : "放弃修改",
									handler : function() {
										$('#table').edatagrid('cancelRow');
									}
								} ],
						onAfterEdit : function(rowIndex, rowData, changes) {
							$.ajax({
								type : "POST",
								url : rowData.isNewRecord ? url_table_save
										: url_table_update,
								data : rowData,
								cache : false,
								dataType : "text",
								success : function(data) {
									if (data && data.indexOf('失败') != -1) {
										$.messager.alert('警告', data);
									}
									table_reload();
								},
								error : function(e) {
									$.messager.alert('警告',
											rowData.isNewRecord ? '添加失败'
													: '更新失败');
									table_reload();
								}
							})
						}
					});

	$('#page').pagination({
		total : vipTypeCount,
		onBeforeRefresh : function(pageNumber, pageSize) {
			t_pageNumber = pageNumber;
			t_pageSize = pageSize;
			table_reload();
		},
		onSelectPage : function(pageNumber, pageSize) {
			t_pageNumber = pageNumber;
			t_pageSize = pageSize;
			table_reload();
		},
		onChangePageSize : function(pageSize) {
			t_pageSize = pageSize;
			table_reload();
		}
	});

}

function getUrl_table_getAllByPages() {
	return url_table_getAllByPages + t_pageNumber + '/' + t_pageSize;
}

function table_reload() {
	$('#table').edatagrid({
		url : getUrl_table_getAllByPages()
	});
	$('#table').edatagrid("reload");
	$.ajax({
		type : "POST",
		url : url_table_getCount,
		cache : false,
		dataType : "text",
		success : function(data) {
			$('#page').pagination({
				total : data
			});
		}
	});
}
