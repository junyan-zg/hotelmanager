<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <%@include file="/include.jsp"%> 

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/su/system/basic.css">

    <script>
        $(function () {
            setTimeout(function () {
                $(".panel-title").html("hhh");
            }, 3000);
            $('#t1').tree({
                url: 'json/tree_data1.json',
                onContextMenu: function (e, node) {
                    e.preventDefault();
                    // 查找节点
                    $('#t1').tree('select', node.target);
                    // 显示快捷菜单
                    $('#mm').menu('show', {
                        left: e.pageX,
                        top: e.pageY
                    });
                },
                onClick: function (node) {
                    $('#t2').edatagrid('load');
                    $(".panel-title").html(node.text);
                }
            });

            $('#t2').edatagrid({
                url: 'oper.json',
                toolbar: [
                    {
                        iconCls: 'icon-add',
                        text: "添加一行",
                        handler: function () {
                            $('#t2').edatagrid('addRow');
                        }
                    },
                    {
                        iconCls: 'icon-remove',
                        text: "删除一行",
                        handler: function () {
                            $('#t2').edatagrid('destroyRow');
                        }
                    },
                    {
                        iconCls: 'icon-save',
                        text: "保存数据",
                        handler: function () {
                            $('#t2').edatagrid('saveRow');
                        }
                    },
                    {
                        iconCls: 'icon-no',
                        text: "放弃修改",
                        handler: function () {
                            $('#t2').edatagrid('cancelRow');
                        }
                    }
                ]

            })
        });
        function append() {
            $(".panel-title").html("");
            $('#t2').edatagrid('addRow');
        }
    </script>


</head>
<body style="padding: 0;">
<div class="easyui-tabs" data-options="fit:true,tabWidth:130">
    <div title="房间类型" style="padding:20px;background-color: transparent;">
        tab1
    </div>
    <div title="房间分区" data-options="closable:false"
         style="overflow:auto;padding:10px;background-color: transparent;">

        <p>左边可对房间区域进行划分，右边是选中区域的详细房间</p>

        <div style="width:200px;overflow-x:auto;position: absolute;z-index: 999;">
            <ul id="t1">

            </ul>
        </div>

        <table>
            <tr>
                <td>
                    <div style="width: 200px;"></div>
                </td>
                <td>
                    <table id="t2" style="width:700px;"
                           title="Editable DataGrid" toolbar="#toolbar" pagination="true"
                           rownumbers="true" fitColumns="true" singleSelect="true">
                        <thead>
                        <tr>
                            <!--<th field="id" width="100" editor="{type:'validatebox',options:{required:true}}">id</th>-->
                            <th field="operator_number" width="100" editor="{type:'textbox',options:{readonly:true}}">
                                员工账号
                            </th>
                            <th field="operator_name" width="100" align="center"
                                editor="{type:'validatebox',options:{required:true}}">员工姓名
                            </th>
                            <th field="sys_role_id" width="100" align="center" editor="numberbox">系统角色</th>
                            <th field="status" width="150" align="center"
                                editor="{type:'combobox',options:{required:true,valueField:'value',textField:'name',url:'json/status.json',editable:false,panelHeight:65}}">
                                账号状态
                            </th>
                        </tr>
                        </thead>
                    </table>
                </td>
            </tr>
        </table>


        <div id="mm" class="easyui-menu" style="width:120px;">
            <div onclick="append()" data-options="iconCls:'icon-add'">追加</div>
            <div onclick="remove()" data-options="iconCls:'icon-remove'">移除</div>
        </div>

    </div>


</div>
</div>
</body>
</html>