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
	var vipTypeCount = ${vipTypeCount};
	var t_pageNumber = 1;
	var t_pageSize = 10;
	var url_table_getCount = '${pageContext.request.contextPath}/su/system/getVipTypeCount';
	var url_table_getAllByPages = '${pageContext.request.contextPath}/su/system/getVipTypeByPages/';
	var url_table_save = '${pageContext.request.contextPath}/su/system/addVipType';
	var url_table_update = '${pageContext.request.contextPath}/su/system/updateVipType';
	var url_table_del = '${pageContext.request.contextPath}/su/system/delVipType';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/su/system/vipType.js"></script>
</head>
<body style="padding: 0; background-color: transparent;">
	<div style="width: 100%">
		<table id="table" title="会员类型编辑" toolbar="#toolbar" rownumbers="true"
			fitColumns="true" singleSelect="true">
			<thead>
				<tr>
					<th field="id" hidden="true">id</th>
					<th field="vipTypeName" width="40%" align="center"
						editor="{type:'validatebox',options:{required:true}}">会员类型名称</th>
					<th field="vipDiscount" width="15%" align="center"
						editor="{type:'numberbox',options:{required:true,min:0,precision:0,max:100,suffix:'%'}}">会员折扣(0-100)</th>
					<th field="description" width="45%" align="center"
						editor="{type:'validatebox',options:{required:false}}">会员类型描述</th>
				</tr>
			</thead>
		</table>
		<div id="page"
			style="background: #efefef; border-bottom: 1px solid rgb(149, 184, 231); border-left: 1px solid rgb(149, 184, 231); border-right: 1px solid rgb(149, 184, 231);"></div>

	</div>


</body>
</html>