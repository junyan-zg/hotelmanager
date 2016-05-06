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
//手机号码验证
$.extend($.fn.validatebox.defaults.rules, {    
	isMobile: {    
        validator: function(value, param){  
        	var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
            return value.length == 11 && mobile.test(value);    
        },    
        message: '请填写正确的手机号码'   
    }    
});  
//身份证号验证
$.extend($.fn.validatebox.defaults.rules, {    
	isCardNo: {    
        validator: function(value, param){  
        	// 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X  
        	var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;  
            return reg.test(value);    
        },    
        message: '请填写正确的身份证号'   
    }    
}); 
</script>
<script type="text/javascript">
	$(function() {
		var body = document.getElementsByTagName("body")[0];
			body.oncontextmenu = function(e) {
				return false;
			//e.preventDefault();
			}
	})
</script>