<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		$('#ss').searchbox({ 
			searcher:function(value,name){ 
			alert(value + "," + name) 
			}, 
			prompt:'按房间号搜索' ,
			height:24
			}); 
	})
</script>
</head>
<body style="padding: 0;">

	<div id="mm" class="easyui-menu" style="width: 100px">
		<div id="0" data-options="iconCls:'icon-reload'">显示全部</div>
		<div class="menu-sep"></div>
		${rooms}
	</div>
	<div class="panel-header">
		<a class="panel-title header-margin-left">房间分组：</a><a href="javascript:void(0)"
			class="easyui-menubutton panel-title" id="f_room"
			data-options="menu:'#mm',iconCls:'icon-search'">筛选房间</a><a
			class="panel-title header-margin-left">房间类型：</a> <input id="f_rtype"
			class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
			<a class="panel-title header-margin-left">房态选择：</a> <input id="f_rtype"
			class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
			<span style="position: absolute;margin-left: 20px;margin-top: 1px;"><input id="ss"></input></span>
			
	</div>

</body>
</html>