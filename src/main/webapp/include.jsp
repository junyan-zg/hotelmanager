<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.1.8.3-min.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/jqueryUI/themes/default/easyui.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/jqueryUI/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jqueryUI/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jqueryUI/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jqueryUI/jquery.edatagrid.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jqueryUI/jquery.etree.js"></script>


<script type="text/javascript">
	$(function() {
		var body = document.getElementsByTagName("body")[0];
			body.oncontextmenu = function() {
				return true;
			}
	})
</script>