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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/avalon.js"></script>
<script type="text/javascript">
	var currGroupId = 0;
	var currTypeId = 0;
	var currStatusId = 0;
	var currNumber = "";
	var roomCount = $
	{
		roomCount
	};
	var m_pageNumber = 1;
	var m_pageSize = 50;

	var url_getCount = "${pageContext.request.contextPath}/su/room/getRoomsCountByConditions"
	var url_getRooms = "${pageContext.request.contextPath}/su/room/getRoomsByConditions"
</script>

<script type="text/javascript">
	var model = avalon.define({
		$id : "roomController",
		array : []
	})
</script>
<script type="text/javascript">
	$(function() {
		$('#mm').menu({
			onClick : function(item) {
				currGroupId = item.id;
				loadData();
			}
		});
		$('#f_rtype').combobox({
			onSelect : function(record) {
				currTypeId = record.id;
				loadData();
			}
		});
		$('#f_rstatus').combobox({
			onSelect : function(record) {
				currStatusId = record.id;
				loadData();
			}
		});
		$('#s_rnumber').searchbox({
			searcher : function(value, name) {
				currNumber = value;
				loadData();
			},
			prompt : '  按房间号搜索',
			height : 24
		});
		$('#page').pagination({
			total : roomCount,
			pageSize : m_pageSize,
			pageList : [ 50, 80, 100 ],
			onBeforeRefresh : function(pageNumber, pageSize) {
				m_pageNumber = pageNumber;
				m_pageSize = pageSize;
				loadData();
			},
			onSelectPage : function(pageNumber, pageSize) {
				m_pageNumber = pageNumber;
				m_pageSize = pageSize;
				loadData();
			},
			onChangePageSize : function(pageSize) {
				m_pageSize = pageSize;
				loadData();
			}
		});
		loadData();
	});

	function loadData() {
		$.ajax({
			type : "POST",
			url : url_getCount,
			data : {
				groupId : currGroupId,
				typeId : currTypeId,
				statusId : currStatusId,
				roomNumber : currNumber
			},
			cache : false,
			dataType : "text",
			success : function(data) {
				$('#page').pagination({
					total : data
				});
			}
		})
		$.ajax({
			type : "POST",
			url : url_getRooms,
			data : {
				groupId : currGroupId,
				typeId : currTypeId,
				statusId : currStatusId,
				roomNumber : currNumber,
				pageNumber : m_pageNumber,
				pageSize : m_pageSize
			},
			cache : false,
			dataType : "json",
			success : function(data) {
				model.array = new Array();
				for ( var i in data) {
					model.array.push(data[i])
				}
			},
			error : function(e) {
				$.messager.alert('警告', '获取房间失败');
			}
		})
	}
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
			style="margin-right: -5px;">房态选择：</a> <input id="f_rstatus"
			class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'text',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomStatusAll2'" />

	</div>
	<div id="page"></div>

	<div style="padding: 0 0 0 15px; margin-top: 50px;"
		ms-controller="roomController" ms-each-el="array">						<!-- {{el.tips}} -->
		<div titlee="{{el.tips}}" class="easyui-tooltip r_empty"
			data-options="trackMouse:true" ids="el.id">
			<div class="r_empty_in">
				<span class="r_empty_type">{{el.roomTypeName}}</span>
				<div class="r_empty_number">{{el.roomNumber}}</div>
				<div class="r_empty_info">可住：{{el.maxPeople}}人</div>
				<div class="r_empty_info">位于：{{el.groupName}}</div>
				<div class="r_empty_info">
					&nbsp;
					<!-- <span>住客：小明</span> -->
				</div>
				<div class="r_empty_status">{{el.roomStatusName|html}}</div>
			</div>
		</div>
	</div>
	<div style="height: 40px; clear: both;"></div>

</body>
</html>