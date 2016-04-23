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
			// $('#t2').edatagrid('load');
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
			changeTitle(str);
		}
	});
	$('#tt').edatagrid({
		url : 'oper.json',
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
				$('#tt').edatagrid('destroyRow');
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
		} ]

	});
	$('#t2').edatagrid({
		url : 'oper.json',
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
				$('#t2').edatagrid('destroyRow');
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
		} ]

	});
	changeTitle("酒店");
});
function addRoom() {
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