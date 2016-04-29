$.extend($.fn.datagrid.defaults.editors, {
	timespinner2 : {
		init : function(container, options) {
			var input = $('<input style="width:100%;"/>').appendTo(container);
			input.timespinner({
				required : true,
				showSeconds : true,
				editable : true,
				min: '00:00'
			});
			return input
		},
		getValue : function(target) {
			return $(target).timespinner('getValue');

		},
		setValue : function(target, value) {
			$(target).timespinner('setValue', value);
		},
		resize : function(target, width) {
			var input = $(target);
			if ($.boxModel == true) {
				input.resize('resize', width
						- (input.outerWidth() - input.width()));
			} else {
				input.resize('resize', width);
			}
		}
	}
});

$(function() {

	initTable1();
	initTable2();
});

function initTable1() {
	$('#table1')
			.edatagrid(
					{
						url : getUrl_table1_getAllByPages(),
						toolbar : [
								{
									iconCls : 'icon-add',
									text : "添加一行",
									handler : function() {
										$('#table1').edatagrid('addRow');
									}
								},
								{
									iconCls : 'icon-remove',
									text : "删除一行",
									handler : function() {
										var select = $('#table1').edatagrid(
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
																				url : url_table1_del,
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
																					table1_reload();
																				},
																				error : function(
																						e) {
																					$.messager
																							.alert(
																									'警告',
																									'删除失败');
																					table1_reload();
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
										$('#table1').edatagrid('saveRow');
									}
								}, {
									iconCls : 'icon-cancel',
									text : "放弃修改",
									handler : function() {
										$('#table1').edatagrid('cancelRow');
									}
								} ],
						onAfterEdit : function(rowIndex, rowData, changes) {
							$.ajax({
								type : "POST",
								url : rowData.isNewRecord ? url_table1_save
										: url_table1_update,
								data : rowData,
								cache : false,
								dataType : "text",
								success : function(data) {
									if (data && data.indexOf('失败') != -1) {
										$.messager.alert('警告', data);
									}
									table1_reload();
								},
								error : function(e) {
									$.messager.alert('警告',
											rowData.isNewRecord ? '添加失败'
													: '更新失败');
									table1_reload();
								}
							})
						}
					});

	$('#page1').pagination({
		total : roomPayMethodCount0,
		onBeforeRefresh : function(pageNumber, pageSize) {
			t1_pageNumber = pageNumber;
			t1_pageSize = pageSize;
			table1_reload();
		},
		onSelectPage : function(pageNumber, pageSize) {
			t1_pageNumber = pageNumber;
			t1_pageSize = pageSize;
			table1_reload();
		},
		onChangePageSize : function(pageSize) {
			t1_pageSize = pageSize;
			table1_reload();
		}
	});

}

function initTable2() {
	$('#table2')
			.edatagrid(
					{
						url : getUrl_table2_getAllByPages(),
						toolbar : [
								{
									iconCls : 'icon-add',
									text : "添加一行",
									handler : function() {
										$('#table2').edatagrid('addRow');
									}
								},
								{
									iconCls : 'icon-remove',
									text : "删除一行",
									handler : function() {
										var select = $('#table2').edatagrid(
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
																				url : url_table2_del,
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
																					table2_reload();
																				},
																				error : function(
																						e) {
																					$.messager
																							.alert(
																									'警告',
																									'删除失败');
																					table2_reload();
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
										$('#table2').edatagrid('saveRow');
									}
								}, {
									iconCls : 'icon-cancel',
									text : "放弃修改",
									handler : function() {
										$('#table2').edatagrid('cancelRow');
									}
								} ],
						onAfterEdit : function(rowIndex, rowData, changes) {
							if (rowData.group_id == null) {
								rowData.group_id = curr_groupId;
							}
							$.ajax({
								type : "POST",
								url : rowData.isNewRecord ? url_table2_save
										: url_table2_update,
								data : rowData,
								cache : false,
								dataType : "text",
								success : function(data) {
									if (data && data.indexOf('失败') != -1) {
										$.messager.alert('警告', data);
									}
									table2_reload();
								},
								error : function(e) {
									$.messager.alert('警告',
											rowData.isNewRecord ? '添加失败'
													: '更新失败');
									table2_reload();
								}
							})
						}
					});
	$('#page2').pagination({
		total : roomPayMethodCount1,
		onBeforeRefresh : function(pageNumber, pageSize) {
			t2_pageNumber = pageNumber;
			t2_pageSize = pageSize;
			table2_reload();
		},
		onSelectPage : function(pageNumber, pageSize) {
			t2_pageNumber = pageNumber;
			t2_pageSize = pageSize;
			table2_reload();
		},
		onChangePageSize : function(pageSize) {
			t2_pageSize = pageSize;
			table2_reload();
		}
	});
}
function getUrl_table1_getAllByPages() {
	return url_table1_getAllByPages + t1_pageNumber + '/' + t1_pageSize;
}
function getUrl_table2_getAllByPages() {
	return url_table2_getAllByPages + t2_pageNumber + '/' + t2_pageSize;
}
function table1_reload() {
	$('#table1').edatagrid({
		url : getUrl_table1_getAllByPages()
	});
	$('#table1').edatagrid("reload");
	$.ajax({
		type : "POST",
		url : url_table1_getCount,
		cache : false,
		dataType : "text",
		success : function(data) {
			$('#page1').pagination({
				total : data
			});
		}
	});
}
function table2_reload() {
	$('#table2').edatagrid({
		url : getUrl_table2_getAllByPages()
	});
	$('#table2').edatagrid("reload");
	$.ajax({
		type : "POST",
		url : url_table2_getCount,
		cache : false,
		dataType : "text",
		success : function(data) {
			$('#page2').pagination({
				total : data
			});
		}
	});
}