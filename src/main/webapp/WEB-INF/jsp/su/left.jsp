<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv=content-type content="text/html; charset=utf-8"/>
    <link href="${pageContext.request.contextPath}/css/su/left.css" type="text/css" rel="stylesheet"/>
    <script>
        function expand(el) {
            childObj = document.getElementById("child" + el);
            childObj.style.display = childObj.style.display == 'none'?'block':'none';
        }
    </script>
</head>
<body>
<shiro:authenticated>
<table height="100%" cellspacing=0 cellpadding=0 width=146 border=0>
<tr>
<td valign=top align="left">
<table cellspacing=0 cellpadding=0 width="100%" border=0>
    <tr>
        <td height=10></td>
    </tr>
</table>
<shiro:hasPermission name="33:22:44"> 
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(1)">房间管理</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
</shiro:hasPermission>
<table id=child1 style="display: block" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="${pageContext.request.contextPath}/su/room/getShowRooms" target=right>查看房间</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>入住详情</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>历史入住</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(2)">预订管理</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child2 style="display: block" cellspacing=0 cellpadding=0
       width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>新增预订</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>审核预订</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>当前预订</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>历史预订</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(3)">商品管理</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child3 style="display: none" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>商品出售</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>商品进货</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>商品明细</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>商品编辑</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(4)">会员管理</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child4 style="display: none" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>添加会员</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>会员详情</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(5)">信用管理</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child5 style="display: none" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>挂账详情</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>拉黑号码</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>拉黑详情</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(6)">收益情况</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child6 style="display: none" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>每日收益</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>每月收益</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(7)">系统设置</td>
    </tr>
    <tr height=4>
        <td></td>
    </tr>
</table>
<table id=child7 style="display: block" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="system/operatorManager.html" target=right>人员管理</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="system/roleManager.html" target=right>角色管理</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="${pageContext.request.contextPath}/su/system/roomManager" target=right>房间编辑</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="${pageContext.request.contextPath}/su/system/roomPayMethod" target=right>付费方案</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="${pageContext.request.contextPath}/su/system/getVipTypes" target=right>会员类型</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>日志中心</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=22>
        <td class="headTd" onclick="expand(8)">个人设置</td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
<table id=child8 style="display: none" cellspacing=0 cellpadding=0 width=145 border=0>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="#" target=right>修改密码</a></td>
    </tr>
    <tr height=20>
        <td align="left" width="30px"><img height=9 src="${pageContext.request.contextPath}/images/su/index/menu_icon.gif" width=9></td>
        <td class="childTd"><a href="javaScript:void(0);" target=right onclick="if (confirm('确定要退出吗？')) return true; else return false;">退出系统</a></td>
    </tr>
    <tr height=4>
        <td colspan=2></td>
    </tr>
</table>
</td>
</tr>
</table>
</shiro:authenticated>
</body>
</html>