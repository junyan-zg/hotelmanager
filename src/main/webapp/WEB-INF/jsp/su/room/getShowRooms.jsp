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
		    onClick:function(item){    
		    	console.log(item.id) 
		    }    
		});  
		$('#f_rtype').combobox({
			onSelect : function(record) {
				console.log(record.id)
			}
		});
	})
</script>
</head>
<body style="padding: 0;">
	<div class="panel-header">
		<a class="panel-title">center title</a>
			<a href="javascript:void(0)" class="easyui-menubutton panel-title"     
        data-options="menu:'#mm',iconCls:'icon-search'">筛选房间</a> 

<a class="panel-title header-margin-left">房间类型：</a>
<input id="f_rtype" class="easyui-combobox"
			data-options="editable:false,panelHeight:'120',width:'100',valueField:'id',textField:'roomTypeName',value:'显示全部',url:'${pageContext.request.contextPath}/su/system/getRoomTypeAll2'" />
	</div>

	<div id="mm" class="easyui-menu" style="width: 100px">
		<div id="0" data-options="iconCls:'icon-reload'">显示全部</div>
		<div class="menu-sep"></div>
		${rooms}
	</div>
</body>
</html>