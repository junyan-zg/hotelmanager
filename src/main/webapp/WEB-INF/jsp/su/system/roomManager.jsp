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

	var roomTypeCount = ${roomTypeCount};
	var t1_pageNumber = 1;
	var t1_pageSize = 10;
	var url_table1_getCount = '${pageContext.request.contextPath}/su/system/getRoomTypeCount';
	var url_table1_getAllByPages = '${pageContext.request.contextPath}/su/system/getRoomTypeByPages/';
	var url_table1_save = '${pageContext.request.contextPath}/su/system/addRoomType';
	var url_table1_update = '${pageContext.request.contextPath}/su/system/updateRoomType';
	var url_table1_del = '${pageContext.request.contextPath}/su/system/delRoomType';
	
	var roomCount = 0;
	var t2_pageNumber = 1;
	var t2_pageSize = 10;
	var curr_groupId = 0;
	var url_table2_getCount = '${pageContext.request.contextPath}/su/system/getRoomCount/';
	var url_table2_getAllByPages = '${pageContext.request.contextPath}/su/system/getRoomAllByPages/';
	var url_table2_save = '${pageContext.request.contextPath}/su/system/addRoom';
	var url_table2_update = '${pageContext.request.contextPath}/su/system/updateRoom';
	var url_table2_del = '${pageContext.request.contextPath}/su/system/delRoom';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/su/system/roomManager.js"></script>

</head>
<body style="padding: 0;">
	<div class="easyui-tabs" data-options="fit:true,tabWidth:130">
		<div title="房间类型"
			style="padding: 20px 5px; background-color: transparent;">
			<div style="width: 100%">
				<table id="tt" toolbar="#toolbar" rownumbers="true"
					fitColumns="true" singleSelect="true">
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
				<div id="page1"
					style="background: #efefef; border-bottom: 1px solid rgb(149, 184, 231); border-left: 1px solid rgb(149, 184, 231); border-right: 1px solid rgb(149, 184, 231);"></div>

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
<div style="width: 100%;">
			<table>
				<tr>
					<td>
						<div style="width: 150px;"></div>
					</td>
					<td style="width: 100%;" id="table2">
							<table id="t2" toolbar="#toolbar" rownumbers="true"
								fitColumns="true" singleSelect="true" title="1">
								<thead>
									<tr>
										<th field="id" hidden="true">id</th>
										<th field="group_id" hidden="true">group_id</th>
										<th field="roomNumber" width="34%" align="center"
											editor="{type:'validatebox',options:{required:true}}">房间号</th>
										<th field="roomTypeName" width="33%" align="center"
											editor="{type:'combobox',options:{required:true,valueField:'roomTypeName',textField:'roomTypeName',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll',editable:false,panelHeight:65}}">房间类型</th>
										<th field="roomStatusName" width="33%" align="center"
											editor="{type:'combobox',options:{required:true,valueField:'value',textField:'value',url:'${pageContext.request.contextPath}/su/system/getRoomStatusAll',editable:false,panelHeight:65}}">房间状态</th>

									</tr>
								</thead>
							</table>
							<div id="page2"
								style="background: #efefef; border-bottom: 1px solid rgb(149, 184, 231); border-left: 1px solid rgb(149, 184, 231); border-right: 1px solid rgb(149, 184, 231);"></div>

					</td>
				</tr>
			</table>
</div>

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
				<!-- <div onclick="addRoom()" data-options="iconCls:'icon-add'">
					<span style="padding-left: 5px;">添加房间</span>
				</div> -->
			</div>
		</div>


	</div>
	</div>
</body>
</html>