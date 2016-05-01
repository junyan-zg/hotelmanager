<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
<%@include file="/include.jsp"%>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/system/basic.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/room/getShowRooms.css">
<script>
	function GaiBian(osel) {
		alert(osel.options[osel.selectedIndex].value);
	}
</script>

<script type="text/javascript">
	$(function() {
		$('#mm').menu({
			onClick : function(item) {
				console.log(item.id)
			}
		});
		$('#f_rtype').combobox({
			onSelect : function(record) {
				console.log(record.id)
			}
		});
		$('#s_rnumber').searchbox({
			searcher : function(value, name) {
				alert(value + "," + name)
			},
			prompt : '  按房间号搜索',
			height : 24
		});

	});
</script>



</head>
<body style="padding: 0;">
	<style type="text/css">
.rrr {
	border: 1px solid rgb(149, 184, 231);
	width: 120px;
	min-height: 87px;
	margin: 4px;
	float: left;
	background-color: #8ec6fe; 
	overflow:hidden;
}
.rrr:HOVER {
	border-color:#0E2D6F;
}
.dd {
	width: 119px;
	min-height: 86px;
	position: relative;
	overflow: hidden;
}

.a {
	color: white;
	font-weight: bolder;
	font-size: 20px;
	margin: 1px;
	white-space: break-all;
}

.t {
	color: #0E2D6F;
	font-size: 14px;
	padding: 2px;
	font-weight: 600;
	white-space: break-all;
}
</style>
	<div id="mm" class="easyui-menu" style="width: 100px">
		<div id="0" data-options="iconCls:'icon-reload'">显示全部</div>
		<div class="menu-sep"></div>
		${rooms}
	</div>
	<div class="panel-header">
		<span style="position: absolute; margin-left: 8px; margin-top: 2px;"><input
			id="s_rnumber"></input></span> <a class="panel-title"
			style="padding-left: 185px; margin-right: -5px;">房间分组：</a> <span
			id="s_room"> <a href="javascript:void(0)"
			class="easyui-menubutton panel-title" id="f_room"
			data-options="menu:'#mm',iconCls:'icon-house'">筛选房间</a></span><a
			class="panel-title" style="margin-left: 8px; margin-right: -5px;">房间类型：</a>
		<input id="f_rtype" class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
		<a class="panel-title" style="margin-right: -5px;">房态选择：</a> <input
			id="f_rtype" class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
	</div>
	<div style="margin-top: 4px;">
		<%-- <div title="This is the<br>tooltip message." class="easyui-tooltip rrr" data-options="trackMouse:true">
			<div class="dd" >
				<span class="a">3305</span><span class="t" style="float: right;">单人房</span>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					可住：2 人
				</div>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					位于：A-5-6
				</div>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					&nbsp;<!-- <span>住客：小明</span> -->
				</div>
				<div class="t" style="position: absolute; right: 0; bottom: 0;font-size: 12px;">
					有<br>人</div>
			</div>
		</div> --%>
		<c:forEach var="r" items="${roomDetails }">
		<div title="${r.tips}" class="easyui-tooltip rrr" data-options="trackMouse:true" ids="${r.id}">
			<div class="dd" >
				<span class="a">${r.roomNumber}</span><span class="t" style="float: right;">${r.roomTypeName}</span>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					可住：${r.maxPeople} 人
				</div>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					位于：${r.groupName}
				</div>
				<div class="t" style="margin-top:2px;font-size: 12px;">
					&nbsp;<!-- <span>住客：小明</span> -->
				</div>
				<div class="t" style="position: absolute; right: 0; bottom: 0;font-size: 12px;">
					${r.roomStatusName}</div>
			</div>
		</div>
		</c:forEach>
	</div>
	<!-- <div style="border: 1px solid rgb(149, 184, 231);clear: both;width: 100px;height: 100px;"></div> -->
</body>
</html>