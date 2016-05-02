<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<%@include file="/include.jsp"%>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/system/basic.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/room/getShowRooms.css">
<script type="text/javascript" src=""></script>
<script type="text/javascript">
	var currGroupId = 0;
	var currStatusId = 0;
	var currNumber = "";
	var roomCount = ${};
	var m_pageNumber = 1;
	var m_pageSize = 10;
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
		$('#page').pagination({
			total : roomCount,
			pageSize:48,
			pageList:[50,80,100],
			onBeforeRefresh : function(pageNumber, pageSize) {
				m_pageNumber = pageNumber;
				m_pageSize = pageSize;
				//table1_reload();
			},
			onSelectPage : function(pageNumber, pageSize) {
				m_pageNumber = pageNumber;
				m_pageSize = pageSize;
				//table1_reload();
			},
			onChangePageSize : function(pageSize) {
				m_pageSize = pageSize;
				//table1_reload();
			}
		});
	});
</script>

</head>
<body style="padding: 0;">
	<div id="mm" class="easyui-menu" style="width: 100px">
		<div id="0" data-options="iconCls:'icon-reload'">显示全部</div>
		<div class="menu-sep"></div>
		${rooms}
	</div>
	<div class="panel-header"
		style="position: fixed; left: 0; right: 0; top: 0; z-index: 999;">
		<a class="panel-title" style="margin-right: -5px;">房间分组：</a> <span
			id="s_room"> <a href="javascript:void(0)"
			class="easyui-menubutton panel-title" id="f_room"
			data-options="menu:'#mm',iconCls:'icon-house'">筛选房间</a></span><a
			class="panel-title" style="margin-left: 8px; margin-right: -5px;">房间类型：</a>
		<input id="f_rtype" class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
		<span style="margin-left: 180px; margin-top: 2px; position: absolute;"><input
			id="s_rnumber"></input></span> <a class="panel-title"
			style="margin-right: -5px;">房态选择：</a> <input id="f_rtype"
			class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'text',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomStatusAll2'" />

	</div>
	<div id="page"></div>

	<div style="padding: 0 0 0 15px; margin-top: 50px;">
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
			<div title="${r.tips}" class="easyui-tooltip r_empty"
				data-options="trackMouse:true" ids="${r.id}">
				<div class="r_empty_in">
					<span class="r_empty_type">${r.roomTypeName}</span>
					<div class="r_empty_number">${r.roomNumber}</div>
					<div class="r_empty_info">可住：${r.maxPeople}人</div>
					<div class="r_empty_info">位于：${r.groupName}</div>
					<div class="r_empty_info">
						&nbsp;
						<!-- <span>住客：小明</span> -->
					</div>
					<div class="r_empty_status">${r.roomStatusName}</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<div style="height: 40px; clear: both;"></div>
</body>
</html>