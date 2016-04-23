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
	var url_tree_getAll = '${pageContext.request.contextPath}/su/system/getAllRoomGroup';
	var url_tree_del = '${pageContext.request.contextPath}/su/system/delRoomGroup';
	var url_tree_update = '${pageContext.request.contextPath}/su/system/updateRoomGroup';
	var url_tree_add = '${pageContext.request.contextPath}/su/system/addRoomGroup';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/su/system/roomManager.js"></script>

</head>
<body style="padding: 0;">
	<div class="easyui-tabs" data-options="fit:true,tabWidth:130">
		<div title="房间类型"
			style="padding: 20px 5px; background-color: transparent;">
			<div style="width: 100%">
				<table id="tt" toolbar="#toolbar" pagination="true"
					rownumbers="true" fitColumns="true" singleSelect="true">
					<thead>
						<tr>
							<th field="id" hidden="true">id</th>
							<th field="roomTypeName" width="25%" align="center"
								editor="{type:'validatebox',options:{required:true}}">房间类型名称</th>
							<th field="maxPeople" width="20%" align="center"
								editor="{type:'numberbox',options:{required:true,min:1,precision:0,max:65535,groupSeparator:','}}">可容纳最大人数</th>
							<th field="deposit" width="20%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:2,prefix:'￥',groupSeparator:','}}">押金</th>
							<th field="description" width="35%" align="center"
								editor="{type:'validatebox'}">描述</th>
						</tr>
					</thead>
				</table>


			</div>





		</div>
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
						<div id="table2">
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
						</div>
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