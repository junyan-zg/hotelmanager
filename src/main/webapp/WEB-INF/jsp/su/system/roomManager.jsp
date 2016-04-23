<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<%@include file="/include.jsp"%>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/system/basic.css">

<script>
	var currNode;
	$(function() {
		changeTitle("酒店");
		$('#t1')
				.tree(
						{
							animate : true,
							checkbox : false,
							onLoadError : function() {
								$.messager.alert('警告', '获取房间信息失败');
							},
							url : '${pageContext.request.contextPath}/su/system/getAllRoomGroup',
							//  updateUrl:'${pageContext.request.contextPath}/su/system/updateRoomGroup',   
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
								//   $('#t2').edatagrid('load');
								$(".panel-title").html(node.text);
							}
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
				iconCls : 'icon-no',
				text : "放弃修改",
				handler : function() {
					$('#t2').edatagrid('cancelRow');
				}
			} ]

		})
	});
	function addRoom() {
		$('#t2').edatagrid('addRow');
	}
	function delAll() {
		$.messager.confirm('删除','本操作会删除该节点下的所有分组和房间，您确认删除吗？',function(r){    
		    if (r){    
		    	$.ajax({
					type : "POST",
					url : '${pageContext.request.contextPath}/su/system/delRoomGroup',
					data : {
						id : currNode.id,
					},
					cache : false,
					dataType : "text",
					success : function(data) {
						if(data=='删除失败'){
							$.messager.alert('警告', '删除失败');
						}
						$('#t1').tree("reload");
					},
					error:function(){
						$.messager.alert('警告', '删除失败');
						$('#t1').tree("reload");
					}
				});
		    }    
		});  
	}

	function editName() {
		$.messager
				.prompt(
						'修改分组名称',
						'请输入一个分组名称：',
						function(r) {
							if (r) {
								if (r.trim() != '') {
									var parent = $("#t1").tree("getParent",
											currNode);
									var childens = $("#t1").tree("getChildren",
											parent);
									for ( var i in childens) {
										if (childens[i].text == r.trim()) {
											$.messager.alert('警告', '名称不能与重复');
											return;
										}
									}
									$.ajax({
												type : "POST",
												url : '${pageContext.request.contextPath}/su/system/updateRoomGroup',
												data : {
													id : currNode.id,
													text : r.trim()
												},
												cache : false,
												dataType : "text",
												success : function(data) {
													if(data=='更新失败'){
														$.messager.alert('警告', '更新失败');
													}
													$('#t1').tree("reload");
												},
												error:function(){
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
		.prompt(
				'添加分组',
				'请输入一个分组名称：',
				function(r) {
					if (r) {
						if (r.trim() != '') {
							var childens = $("#t1").tree("getChildren",
									currNode);
							for ( var i in childens) {
								if (childens[i].text == r.trim()) {
									$.messager.alert('警告', '名称不能与重复');
									return;
								}
							}
							$.ajax({
										type : "POST",
										url : '${pageContext.request.contextPath}/su/system/addRoomGroup',
										data : {
											pid : currNode.id,
											text : r.trim()
										},
										cache : false,
										dataType : "text",
										success : function(data) {
											if(data=='更新失败'){
												$.messager.alert('警告', '添加失败');
											}
											$('#t1').tree("reload");
										},
										error:function(){
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
		$(".panel-title").html("当前编辑房间位于" + title);
	}
</script>


</head>
<body style="padding: 0;">
	<div class="easyui-tabs" data-options="fit:true,tabWidth:130">
		<div title="房间类型"
			style="padding: 20px; background-color: transparent;">tab1</div>
		<div title="房间分区" data-options="closable:false"
			style="overflow: auto; padding: 10px; background-color: transparent;">

			<p>左边可对房间区域进行划分，右边是选中区域的详细房间</p>

			<div
				style="width: 150px; overflow-x: auto; position: absolute; z-index: 999; overflow-y: hidden;">
				<ul id="t1">

				</ul>
			</div>

			<table>
				<tr>
					<td>
						<div style="width: 150px;"></div>
					</td>
					<td>
						<table id="t2" style="width: 700px;" title="Editable DataGrid"
							toolbar="#toolbar" pagination="true" rownumbers="true"
							fitColumns="true" singleSelect="true">
							<thead>
								<tr>
									<!--<th field="id" width="100" editor="{type:'validatebox',options:{required:true}}">id</th>-->
									<th field="operator_number" width="100"
										editor="{type:'textbox',options:{readonly:true}}">员工账号</th>
									<th field="operator_name" width="100" align="center"
										editor="{type:'validatebox',options:{required:true}}">员工姓名
									</th>
									<th field="sys_role_id" width="100" align="center"
										editor="numberbox">系统角色</th>
									<th field="status" width="150" align="center"
										editor="{type:'combobox',options:{required:true,valueField:'value',textField:'name',url:'json/status.json',editable:false,panelHeight:65}}">
										账号状态</th>
								</tr>
							</thead>
						</table>
					</td>
				</tr>
			</table>


			<div id="mm" class="easyui-menu" style="width: 100px;">
				<div onclick="addGroup()" data-options="iconCls:'icon-house'">
					<span style="padding-left: 5px;">添加分组</span>
				</div>
				<div onclick="addRoom()" data-options="iconCls:'icon-add'">
					<span style="padding-left: 5px;">添加房间</span>
				</div>
				<div onclick="editName()" data-options="iconCls:'icon-edit'">
					<span style="padding-left: 5px;">修改名称</span>
				</div>
				<div onclick="delAll()" data-options="iconCls:'icon-remove'">
					<span style="padding-left: 5px;">删除分组</span>
				</div>
			</div>
			<div id="mm2" class="easyui-menu" style="width: 100px;">
				<div onclick="addGroup()" data-options="iconCls:'icon-house'">
					<span style="padding-left: 5px;">添加分组</span>
				</div>
				<div onclick="addRoom()" data-options="iconCls:'icon-add'">
					<span style="padding-left: 5px;">添加房间</span>
				</div>
			</div>
		</div>


	</div>
	</div>
</body>
</html>