var currNode;
$(function() {
	$('#t1').tree({
		animate : true,
		checkbox : false,
		onLoadError : function() {
			$.messager.alert('警告', '获取房间信息失败');
		},
		url : url_tree_getAll,
		dnd : false,
		onContextMenu : function(e, node) {
			e.preventDefault();
			// 查找节点
			currNode = node;
			$('#t1').tree('select', node.target);
			// 显示快捷菜单
			if (node.id == 0) {
				$('#mm2').menu('show', {
					left : e.pageX,
					top : e.pageY
				});
				return;
			}
			$('#mm').menu('show', {
				left : e.pageX,
				top : e.pageY
			});
		},
		onClick : function(node) {
			curr_groupId = node.id;
			table2_reload();
			var str = node.text;
			var parent = node;
			var pNode = node;
			while (1) {
				parent = $("#t1").tree("getParent", parent.target);
				if (parent == null) {
					break;
				}
				str = parent.text + " - " + str;
			}
			title = str;
			changeTitle(str);
		}
	});
	initTable1();
	initTable2();
	changeTitle("酒店");
});
var title;
function addRoom() {
	curr_groupId = currNode.id;
	table2_reload();
	var str = currNode.text;
	var parent = currNode;
	var pNode = currNode;
	while (1) {
		parent = $("#t1").tree("getParent", parent.target);
		if (parent == null) {
			break;
		}
		str = parent.text + " - " + str;
	}
	title = str;
	changeTitle(str);
	$('#t2').edatagrid('addRow');
}
function delAll() {
	$.messager.confirm('删除', '本操作会删除该节点下的所有分组和房间，您确认删除吗？', function(r) {
		if (r) {
			$.ajax({
				type : "POST",
				url : url_tree_del,
				data : {
					id : currNode.id,
				},
				cache : false,
				dataType : "text",
				success : function(data) {
					if (data == '删除失败') {
						$.messager.alert('警告', '删除失败');
					}
					$('#t1').tree("reload");
				},
				error : function() {
					$.messager.alert('警告', '删除失败');
					$('#t1').tree("reload");
				}
			});
		}
	});
}

function editName() {
	$.messager
			.prompt('修改分组名称', '请输入一个分组名称：',
					function(r) {
						if (r) {
							if (r.trim() != '') {
								var parent = $("#t1").tree("getParent",
										currNode.target);
								var childens = $("#t1").tree("getChildren",
										parent.target);
								for ( var i in childens) {
									if ($("#t1").tree("getParent",
											childens[i].target) != parent) {
										continue;
									}
									if (childens[i].text == r.trim()) {
										$.messager.alert('警告', '名称不能重复');
										return;
									}
								}
								$.ajax({
									type : "POST",
									url : url_tree_update,
									data : {
										id : currNode.id,
										text : r.trim()
									},
									cache : false,
									dataType : "text",
									success : function(data) {
										if (data == '更新失败') {
											$.messager.alert('警告', '更新失败');
										}
										$('#t1').tree("reload");
									},
									error : function() {
										$.messager.alert('警告', '更新失败');
										$('#t1').tree("reload");
									}
								});
							} else {
								$.messager.alert('警告', '名称不能为空');
							}
						}
					});
}
function addGroup() {
	$.messager
			.prompt('添加分组', '请输入一个分组名称：',
					function(r) {
						if (r) {
							if (r.trim() != '') {
								var childens = $("#t1").tree("getChildren",
										currNode.target);
								for ( var i in childens) {
									if ($("#t1").tree("getParent",
											childens[i].target) != currNode) {
										continue;
									}
									if (childens[i].text == r.trim()) {
										$.messager.alert('警告', '名称不能重复');
										return;
									}
								}
								$.ajax({
									type : "POST",
									url : url_tree_add,
									data : {
										pid : currNode.id,
										text : r.trim()
									},
									cache : false,
									dataType : "text",
									success : function(data) {
										if (data == '更新失败') {
											$.messager.alert('警告', '添加失败');
										}
										$('#t1').tree("reload");
									},
									error : function() {
										$.messager.alert('警告', '添加失败');
										$('#t1').tree("reload");
									}
								});
							} else {
								$.messager.alert('警告', '名称不能为空');
							}
						}
					});
}
function changeTitle(title) {
	$("#table2 .panel-title").html("当前房间：" + title);
}
function initTable1() {
	$('#tt').edatagrid(
			{
				url : getUrl_table1_getAllByPages(),
				toolbar : [ {
					iconCls : 'icon-add',
					text : "添加一行",
					handler : function() {
						$('#tt').edatagrid('addRow');
					}
				}, {
					iconCls : 'icon-remove',
					text : "删除一行",
					handler : function() {
						var select = $('#tt').edatagrid('getSelected');
						if(select){
							$.messager.confirm('删除', '您确认删除吗？', function(r) {
								if (r) {
									$.ajax({
										type : "POST",
										url : url_table1_del,
										data : select,
										cache : false,
										dataType : "text",
										success : function(data) {
											if (data&&data.indexOf('失败') != -1) {
												$.messager.alert('警告', data);
											}
											table1_reload();
										},
										error : function(e) {
											$.messager.alert('警告','删除失败');
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
						$('#tt').edatagrid('saveRow');
					}
				}, {
					iconCls : 'icon-cancel',
					text : "放弃修改",
					handler : function() {
						$('#tt').edatagrid('cancelRow');
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
							if (data&&data.indexOf('失败') != -1) {
								$.messager.alert('警告', data);
							}
							table1_reload();
						},
						error : function(e) {
							$.messager.alert('警告', rowData.isNewRecord ?'添加失败':'更新失败');
							table1_reload();
						}
					})
				}
			});

	$('#page1').pagination({
		total : roomTypeCount,
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

function initTable2(){
	$('#t2').edatagrid({
		url : getUrl_table2_getAllByPages(),
		toolbar : [ {
			iconCls : 'icon-add',
			text : "添加一行",
			handler : function() {
				$('#t2').edatagrid('addRow');
			}
		}, {
			iconCls : 'icon-remove',
			text : "删除一行",
			handler : function() {
				var select = $('#t2').edatagrid('getSelected');
				if(select){
					$.messager.confirm('删除', '您确认删除吗？', function(r) {
						if (r) {
							$.ajax({
								type : "POST",
								url : url_table2_del,
								data : select,
								cache : false,
								dataType : "text",
								success : function(data) {
									if (data&&data.indexOf('失败') != -1) {
										$.messager.alert('警告', data);
									}
									table2_reload();
								},
								error : function(e) {
									$.messager.alert('警告','删除失败');
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
				$('#t2').edatagrid('saveRow');
			}
		}, {
			iconCls : 'icon-cancel',
			text : "放弃修改",
			handler : function() {
				$('#t2').edatagrid('cancelRow');
			}
		} ],
		onAfterEdit : function(rowIndex, rowData, changes) {
			if(rowData.group_id==null){
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
					if (data&&data.indexOf('失败') != -1) {
						$.messager.alert('警告', data);
					}
					table2_reload();
				},
				error : function(e) {
					$.messager.alert('警告', rowData.isNewRecord ?'添加失败':'更新失败');
					table2_reload();
				}
			})
		}
	});
	$('#page2').pagination({
		total : roomCount,
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
	return url_table2_getAllByPages + curr_groupId + "/" + t2_pageNumber + '/' + t2_pageSize;
}
function table1_reload() {
	$('#tt').edatagrid({
		url : getUrl_table1_getAllByPages()
	});
	$('#tt').edatagrid("reload");
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
	$('#t2').edatagrid({
		url : getUrl_table2_getAllByPages()
	});
	$('#t2').edatagrid("reload");
	$.ajax({
		type : "POST",
		url : url_table2_getCount + curr_groupId,
		cache : false,
		dataType : "text",
		success : function(data) {
			$('#page2').pagination({
				total : data
			});
		}
	});
	changeTitle(title);
}