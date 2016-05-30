<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv=content-type content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/css/su/admin.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<table cellspacing=0 cellpadding=0 width="100%"
		background="${pageContext.request.contextPath}/images/su/index/header_bg.jpg"
		border=0>
		<tr height=56>
			<td width=260><img height=56
				src="${pageContext.request.contextPath}/images/su/index/header_left.jpg"
				width=260></td>
			<td style="font-weight: bold; color: #fff; padding-top: 20px;display: none;"
				align=middle>当前用户：admin &nbsp;&nbsp; <a style="color: #fff"
				href="" target=main>修改口令</a> &nbsp;&nbsp; <a style="color: #fff"
				onclick="if (confirm('确定要退出吗？')) return true; else return false;"
				href="" target=_top>退出系统</a>
			</td>
			<td align=right width=268><img height=56
				src="${pageContext.request.contextPath}/images/su/index/header_right.jpg"
				width=268></td>
		</tr>
	</table>
	<table cellspacing=0 cellpadding=0 width="100%" border=0>
		<tr bgcolor=#1c5db6 height=4>
			<td></td>
		</tr>
	</table>
</body>
</html>