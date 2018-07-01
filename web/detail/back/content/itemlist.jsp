<%@ page import="com.lyq.bean.Item" %>
<%@ page import="java.util.List" %>
<%@ page import="com.lyq.dao.impl.ItemDaoImpl" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lyq.action.ItemAction" %><%--
  Created by IntelliJ IDEA.
  User: juna
  Date: 2017/12/15
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <!-- 包含公共的JSP代码片段 -->
    <title>投票管理平台</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="../../style/js/jquery.js"></script>
    <script type="text/javascript" src="../../style/js/page_common.js"></script>
    <link href="../../style/css/common_style_blue.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="../../style/css/index_1.css" />
</head>
<body>
<!-- 页面标题 -->
<div id="TitleArea">
    <div id="TitleArea_Head"></div>
    <div id="TitleArea_Title">
        <div id="TitleArea_Title_Content">
            <img border="0" width="13" height="13"
                 src="../../style/images/title_arrow.gif" /> 主题列表
        </div>
    </div>
    <div id="TitleArea_End"></div>
</div>
<!-- 过滤条件 -->
<div id="QueryArea">
    <form action="/item/itemList.action" method="post">
        <input type="submit" value="搜索">
    </form>
</div>

<!-- 主内容区域（数据列表或表单显示） -->
<div id="MainArea">
    <table class="MainArea_Content" align="center" cellspacing="0" cellpadding="0">
        <!-- 表头-->
        <thead>
        <tr align="center" valign="middle" id="TableTitle">
            <td>主题编号</td>
            <td>主题名称</td>
            <td>操作</td>
        </tr>
        </thead>
        <!--显示数据列表 -->
        <tbody id="TableData">
        <c:forEach items="${applicationScope.items}" var="item">
            <tr class="TableDetail1">
                <td align="center">${item.imid}</td>
                <td align="center"> ${item.itemname}</td>
                <td>
                    <a href="/item/itemDelete.action?imId=${item.imid}"  onclick="delConfirm()">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <!-- 其他功能超链接 -->
    <div id="TableTail" align="center">
        <div class="FunctionButton">
            <a href="/detail/back/content/saveItem.jsp">添加</a>
        </div>
    </div>
</div>
</body>
</html>