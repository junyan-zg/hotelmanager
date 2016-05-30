<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/include.jsp"%>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/su/system/basic.css">
<title>查询会员</title>
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
	$(function() {
		$('#myform').form({
			//url : '${pageContext.request.contextPath}/su/guest/vip/addVip',
			onSubmit : function() {
				var isValid = $(this).form('validate');
				return isValid; // 返回false终止表单提交
			},
			success : function(data) {
				$.messager.alert('提示', data);
				if (data.indexOf("成功") != -1) {
					document.getElementById('myform').reset();
				}
			}
		});

		$('#s_vip').searchbox({
			searcher : function(value, name) {
				if (value.trim()) {
					searchRoom(value.trim());
				}
				$('#s_vip').searchbox("setValue", "");
			},
			prompt : '  请输入会员手机号',
			height : 24
		});
	});

	function searchRoom(val) {
		$
				.ajax({
					url : "${pageContext.request.contextPath}/su/guest/vip/findVipByPhone",
					type : "POST",
					data : {
						phone : val
					},
					cache : false,
					dataType : "json",
					success : function(data) {
						if (data.error) {
							$.messager.alert('警告', data.error);
							return;
						}
						$("#vId").html(data.id);
						$("#vTypeName").html(data.vipTypeName);
						$("#vName").html(data.vipName);
						$("#vBlances").html(data.blances);
						$("#vRemark").html(data.remark);
						$("#vIdCard").html(data.vipIdCard);
						$("#vStatusName").html(data.statusName);
						$("#vipPhone").html(data.vipPhone);
						$("#vPoints").html(data.points);
					},
					error : function() {
						$.messager.alert('警告', '查询失败');
					}
				});
	}
	function m_submit() {
		$('#myform').submit();
	}
</script>
</head>
<body style="padding: 10px; background-color: transparent;">
	<div class="panel-header"
		style="position: fixed; left: 0; right: 0; top: 0; z-index: 999;">
		<a class="panel-title">查询会员</a><span
			style="margin-left: 10px; margin-top: -2px; position: absolute;"><input
			id="s_vip"></input></span>
	</div>
	<div style="height: 30px;"></div>
	<form id="myform">
		<div>
			<input type="hidden" id="vId"> <label>会员姓名：</label><label
				id="vName"></label>
		</div>
		<div>
			<label>会员手机：</label><label id="vipPhone"></label>
		</div>
		<div>
			<label>身份证号：</label><label id="vIdCard"></label>
		</div>
		<div>
			<label>会员类型：</label><label id="vTypeName"></label>
		</div>
		<div>
			<label>会员余额：</label><label id="vBlances"></label> <a
				href="javascript:$('#blances').show();" class="easyui-linkbutton"
				data-options="iconCls:'icon-ok'" style="margin-left: 50px;">充值</a> <input
				id="blances" type="text" class="easyui-numberbox" name="blances"
				value="0" style="display: none;"
				data-options="min:0,precision:2,required:true"></input>
		</div>
		<div>
			<label>会员积分：</label><label id="vPoints"></label>
		</div>
		<div>
			<label>会员状态：</label><label id="vStatusName"></label> <a
				href="javascript:$('#statusSpan').show();
				$('#status').combobox('setValue',$('#vStatusName').html());"
				class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
				style="margin-left: 50px;">更改</a> <span
				style="margin-left: 20px; display: none;" id="statusSpan"> <input
				class="easyui-combobox" name="status" style="width: 60px;"
				id="status"
				data-options="valueField:'id',textField:'text',editable:false,panelHeight:50,required:true,url:'${pageContext.request.contextPath}/su/guest/vip/getVipStatusAll'" />
			</span>
		</div>
		<div>
			<label>会员备注：</label><label id="vRemark"></label> <a
				href="javascript:$('#remark').show();
				$('#remark').html($('#vRemark').html());"
				class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
				style="margin-left: 50px;">更改</a><br> <br>
			<textarea id="remark" class="easyui-validatebox" name="remark"
				style="resize: none; display: none;" placeholder="备注可不填"></textarea>
			<script type="text/javascript">
				$("#remark").css("width", $("#blances").css("width"));
				$("#remark").css("height", "50px");
			</script>
		</div>
		<div
			style="margin-top: 30px; padding-left: 10px; padding-right: 10px;">
			<a href="javascript:document.getElementById('myform').reset();"
				class="easyui-linkbutton" data-options="iconCls:'icon-undo'">重置</a>
			<a href="javascript:m_submit();" class="easyui-linkbutton"
				data-options="iconCls:'icon-ok'" style="margin-left: 50px;">添加</a>
		</div>
	</form>
</body>
</html>