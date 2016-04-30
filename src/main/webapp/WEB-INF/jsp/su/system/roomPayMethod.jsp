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
	var roomPayMethodCount0 = ${roomPayMethodCount0};
	var t1_pageNumber = 1;
	var t1_pageSize = 10;
	var url_table1_getCount = '${pageContext.request.contextPath}/su/system/getRoomPayMethodCount/0';
	var url_table1_getAllByPages = '${pageContext.request.contextPath}/su/system/getRoomPayMethodAllByPages/0/';
	var url_table1_save = '${pageContext.request.contextPath}/su/system/addRoomPayMethod1';
	var url_table1_update = '${pageContext.request.contextPath}/su/system/updateRoomPayMethod1';
	var url_table1_del = '${pageContext.request.contextPath}/su/system/delRoomPayMethod';

	var roomPayMethodCount1 = ${roomPayMethodCount1};
	var t2_pageNumber = 1;
	var t2_pageSize = 10;
	var url_table2_getCount = '${pageContext.request.contextPath}/su/system/getRoomPayMethodCount/1';
	var url_table2_getAllByPages = '${pageContext.request.contextPath}/su/system/getRoomPayMethodAllByPages/1/';
	var url_table2_save = '${pageContext.request.contextPath}/su/system/addRoomPayMethod2';
	var url_table2_update = '${pageContext.request.contextPath}/su/system/updateRoomPayMethod2';
	var url_table2_del = '${pageContext.request.contextPath}/su/system/delRoomPayMethod';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/su/system/roomPayMethod.js"></script>

</head>
<body style="padding: 0;">
	<div class="easyui-tabs" data-options="fit:true,tabWidth:180">
		<div title="钟点房付费方案"
			style="padding: 20px 5px; background-color: transparent;">
			<div style="min-width: 1024px; width: 100%">
				<table id="table1" toolbar="#toolbar" rownumbers="true"
					fitColumns="true" singleSelect="true">
					<thead>
						<tr>
							<th field="id" hidden="true">id</th>
							<th field="payType" hidden="true"
								editor="{type:'textbox',options:{value:0}}">payType</th>
							<th field="payMethodName" width="15%" align="center"
								editor="{type:'validatebox',options:{required:true}}">付费方案名称</th>
							<th field="roomTypeName" width="12%" align="center"
								editor="{type:'combobox',options:{required:true,valueField:'roomTypeName',textField:'roomTypeName',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll',editable:false,panelHeight:65}}">房间类型</th>
							<th field="startupTime" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:0,max:2147483647,groupSeparator:','}}">起步时间/分钟</th>
							<th field="startupPrice" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:2,prefix:'￥',groupSeparator:','}}">起步价/元</th>
							<th field="standardTime" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:0,max:2147483647,groupSeparator:','}}">标准计费时间/分钟</th>
							<th field="standardPrice" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:2,prefix:'￥',groupSeparator:','}}">标准计费金额/元</th>
							<th field="minTime" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:0,max:2147483647,groupSeparator:','}}">最小计费时间/分钟</th>
							<th field="minPrice" width="13%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:2,prefix:'￥',groupSeparator:','}}">最小计费金额/元</th>
							<th field="statusName" width="10%" align="center"
								editor="{type:'combobox',options:{required:true,valueField:'value',textField:'value',url:'${pageContext.request.contextPath}/su/system/getRoomPayMethodStatusAll',editable:false,panelHeight:45}}">方案状态</th>
						</tr>
					</thead>
				</table>
				<div id="page1"
					style="background: #efefef; border-bottom: 1px solid rgb(149, 184, 231); border-left: 1px solid rgb(149, 184, 231); border-right: 1px solid rgb(149, 184, 231);"></div>

			</div>

		</div>
		<div title="过夜房付费方案" data-options="closable:false"
			style="overflow: auto; padding: 20px 5px; background-color: transparent;">
			<div style="width: 100%;">
				<table id="table2" toolbar="#toolbar" rownumbers="true"
					fitColumns="true" singleSelect="true">
					<thead>
						<tr>
							<th field="id" hidden="true">id</th>
							<th field="payType" hidden="true"
								editor="{type:'textbox',options:{value:1}}">payType</th>
							<th field="payMethodName" width="25%" align="center"
								editor="{type:'validatebox',options:{required:true}}">付费方案名称</th>
							<th field="roomTypeName" width="22%" align="center"
								editor="{type:'combobox',options:{required:true,valueField:'roomTypeName',textField:'roomTypeName',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll',editable:false,panelHeight:65}}">房间类型</th>
							<th field="checkInTime" width="23%" align="center"
								editor="{type:'timespinner2',options:{required:true,showSeconds:true}}">入住时间点</th>
							<th field="checkOutTime" width="23%" align="center"
								editor="{type:'timespinner2',options:{required:true,showSeconds:true}}">退房时间点</th>
							<th field="dayPrice" width="23%" align="center"
								editor="{type:'numberbox',options:{required:true,min:0,precision:2,prefix:'￥',groupSeparator:','}}">日总价/元</th>
							<th field="statusName" width="20%" align="center"
								editor="{type:'combobox',options:{required:true,valueField:'value',textField:'value',url:'${pageContext.request.contextPath}/su/system/getRoomPayMethodStatusAll',editable:false,panelHeight:45}}">方案状态</th>
						</tr>
					</thead>
				</table>
				<div id="page2"
					style="background: #efefef; border-bottom: 1px solid rgb(149, 184, 231); border-left: 1px solid rgb(149, 184, 231); border-right: 1px solid rgb(149, 184, 231);"></div>

			</div>
		</div>
	</div>
</body>
</html>