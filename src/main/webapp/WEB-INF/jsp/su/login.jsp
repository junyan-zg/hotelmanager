<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>酒店管理系统登录</title>

<link href="${pageContext.request.contextPath}/css/su/login.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.1.8.3-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/base64.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/su/login.js"></script>
</head>

<body class="login">
<div class="login_m">
	<div class="login_logo"><img src="${pageContext.request.contextPath}/images/su/login/logo.png" width="196" height="46"></div>
	<form method="post" action="${pageContext.request.contextPath}/su/loginCheck" id="m_form">
	<div class="login_boder">
		<div class="login_padding">
			<h2>管理员</h2>
			<label>
				<input type="text" placeholder="请输入您的账号" name="operatorNumber" id="operatorNumber" class="txt_input txt_input2">
			</label>
			<h2>密码</h2>
			<label>
				<input type="password" placeholder="请输入您的密码"  name="operatorPwd" id="operatorPwd" class="txt_input">
			</label>
			<div class="rem_sub">
				<label>
					<input type="reset" class="sub_button2" value="重&nbsp;置" style="opacity: 0.7;">
				</label>
				<label>
					<input type="submit" class="sub_button" id="bt_submit" value="登&nbsp;录" style="opacity: 0.7;">
				</label>
			</div>
		</div>
	</div><!--login_boder end-->
	</form>
</div><!--login_m end-->

</body>
</html>