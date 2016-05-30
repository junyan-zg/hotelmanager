<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/include.jsp"%>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/system/basic.css">
<title>添加会员</title>
<style type="text/css">
label {
	color: #0E2D6F;
	font-size: 14px;
}

#myform {
	padding-left: 50px;
}

#myform>div {
	margin-top: 30px;
}
</style>
<script type="text/javascript">
$(function(){
	$('#myform').form({    
	    url:'${pageContext.request.contextPath}/su/guest/vip/addVip',    
	    onSubmit: function(){
	    	var isValid = $(this).form('validate');
			return isValid;	// 返回false终止表单提交
	    },    
	    success:function(data){    
	    	$.messager.alert('提示',data);
	    	if(data.indexOf("成功")!=-1){
	    		document.getElementById('myform').reset(); 
	    	}
	    }
	});
});

function m_submit() {
	$('#myform').submit();  
}
</script>
</head>
<body style="padding: 10px; background-color: transparent;">
	<div class="panel-header"
		style="position: fixed; left: 0; right: 0; top: 0; z-index: 999;">
		<a class="panel-title">添加会员</a> 
	</div>
	<div style="height: 40px;"></div>
	<form id="myform" method="post">
		<div>
			<label>客户姓名：</label> <input class="easyui-validatebox" type="text"
				name="vipName" data-options="required:true" />
		</div>
		<div>
			<label>客户手机：</label> <input class="easyui-numberbox" type="text"
				name="vipPhone" data-options="required:true" validType="isMobile" />
		</div>
		<div>
			<label>身份证号：</label> <input class="easyui-validatebox" type="text"
				name="vipIdCard" data-options="required:true" validType="isCardNo"/>
		</div>
		<div>
			<label>会员类型：</label> <input class="easyui-combobox"
				name="GVipType.id"
				data-options="valueField:'id',textField:'vipTypeName',editable:false,panelHeight:150,required:true,url:'${pageContext.request.contextPath}/su/system/getVipTypeByPages/0/0'" />
		</div>
		<div>
			<label>充值金额：</label> <input id="blances" type="text" class="easyui-numberbox"
				name="blances" value="0"
				data-options="min:0,precision:2,required:true"></input>
		</div>
		<div>
			<label>客户备注：</label> <textarea id="remark" class="easyui-validatebox"
				name="remark" style="resize:none;" placeholder="备注可不填"></textarea>
				<script type="text/javascript">
					$("#remark").css("width",$("#blances").css("width"));
					$("#remark").css("height","50px");
				</script>
		</div>
		<div style="margin-top: 50px;padding-left: 10px;padding-right: 10px;">
		<a href="javascript:document.getElementById('myform').reset();" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">重置</a>
		<a href="javascript:m_submit();" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" style="margin-left:50px;">添加</a>
		</div>

	</form>
</body>
</html>