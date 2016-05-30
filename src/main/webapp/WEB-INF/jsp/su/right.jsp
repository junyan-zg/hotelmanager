<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv=content-type content="text/html; charset=utf-8" />
<link href="${pageContext.request.contextPath}/css/su/admin.css"
	type="text/css" rel="stylesheet" />
</head>
<body>
	<table cellspacing=0 cellpadding=0 width="100%" align=center border=0>
		<tr height=28>
			<td
				background=${pageContext.request.contextPath}/images/su/index/title_bg1.jpg>当前位置:
			</td>
		</tr>
		<tr>
			<td bgcolor=#b1ceef height=1></td>
		</tr>
		<tr height=20>
			<td
				background=${pageContext.request.contextPath}/images/su/index/shadow_bg.jpg></td>
		</tr>
	</table>
	<table cellspacing=0 cellpadding=0 width="90%" align=center border=0>
		<tr height=100>
			<td align=middle width=100><img height=100
				src="${pageContext.request.contextPath}/images/su/index/admin_p.gif"
				width=90></td>
			<td width=60>&nbsp;</td>
			<td>
				<table height=100 cellspacing=0 cellpadding=0 width="100%" border=0>

					<tr>
						<td>当前时间：<fmt:formatDate var="nowTime"
								value="<%=new Date()%>" type="both" dateStyle="long"
								pattern="yyyy-MM-dd hh:mm:ss" />${nowTime}
						</td>
					</tr>
					<tr>
						<td style="font-weight: bold; font-size: 16px">${sysOperator.operatorName }</td>
					</tr>
					<tr>
						<td>欢迎进入酒店管理系统！</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan=3 height=10></td>
		</tr>
	</table>
	<table cellspacing=0 cellpadding=0 width="95%" align=center border=0>
		<tr height=20>
			<td></td>
		</tr>
		<tr height=22>
			<td style="padding-left: 20px; font-weight: bold; color: #ffffff"
				align=middle
				background=${pageContext.request.contextPath}/images/su/index/title_bg2.jpg>您的相关信息</td>
		</tr>
		<tr bgcolor=#ecf4fc height=12>
			<td></td>
		</tr>
		<tr height=20>
			<td></td>
		</tr>
	</table>
	<table cellspacing=0 cellpadding=2 width="95%" align=center border=0>
		<tr height="40">
			<td align=right width=100>登陆帐号：</td>
			<td style="color: #880000">${sysOperator.operatorNumber }</td>
		</tr>
		<tr height="40">
			<td align=right>上线时间：</td>
			<td style="color: #880000">${nowTime}</td>
		</tr>
		<tr height="40">
			<td align=right>ip地址：</td>
			<td style="color: #880000"><%=request.getRemoteHost() %></td>
		</tr>
		<tr height="40">
			<td align=right>身份过期：</td>
			<td style="color: #880000">30 分钟</td>
		</tr>
	</table>
</body>
</html>