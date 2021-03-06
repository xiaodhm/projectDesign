<%@ page import="java.util.List" %>
<%@ page import="com.lyq.dao.SelectorDao" %>
<%--
  Created by IntelliJ IDEA.
  User: juna
  Date: 2017/12/15
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>投票管理平台</title>
    <!-- 包含公共的JSP代码片段 -->
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
            <img border="0" width="13" height="13" src="../../style/images/title_arrow.gif"/> 投票列表
        </div>
    </div>
    <div id="TitleArea_End"></div>
</div>


<!-- 过滤条件 -->
<div id="QueryArea">
    <form action="/option/optCount.action" method="post">
        <input type="submit" value="搜索">
    </form>
</div>


<!-- 主内容区域（数据列表或表单显示） -->
<div id="MainArea">
    <table class="MainArea_Content" cellspacing="0" cellpadding="0">
        <!-- 表头-->
        <thead>
          <tr align="center" valign="middle" id="TableTitle">
             <td>选项编号</td>
             <td>选项内容</td>
             <td>所属主题</td>
             <td>票数</td>
         </tr>
        </thead>
        <!--显示数据列表 -->
        <tbody id="TableData">
            <c:forEach items="${applicationScope.optNumb}" var="slcnum">
                <tr class="TableDetail1">
                    <td align="center">${slcnum[0]}</td>
                    <td align="center">${slcnum[1]}</td>
                    <td align="center">${slcnum[2]}</td>
                    <td align="center">${slcnum[3]}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <!-- 其他功能超链接 -->
</div>
</body>
</html>
