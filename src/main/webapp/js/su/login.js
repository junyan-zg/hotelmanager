var b64 = new Base64();
$(document).ready(function() {
	$("#bt_submit").click(
		function() {
			var name = $("#operatorNumber").val().trim();
			var pwd = $("#operatorPwd").val().trim();

			if (isEmpty($("#operatorNumber"), name, "账号不能为空")
					|| isEmpty($("#operatorPwd"), pwd, "密码不能为空")) {
				return false;
			}
			var encodeVal = b64.encode(pwd);
			$("#operatorPwd").val(encodeVal);
			$("#m_form").submit();
		});
});
function isEmpty(el, val, info) {
	if (val == null || val == "") {
		alert(info);
		el.focus();
		return true;
	}
}

/*
 * var b = new Base64(); 
 * var str = b.encode("admin"); 
 * alert("base64 encode:" + str); 
 * //解密 
 * str = b.decode(str); 
 * alert("base64 decode:" + str);
 */