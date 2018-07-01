<%@ page import="java.util.List" %>
<%@ page import="com.lyq.bean.Selector" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<img border="0" width="13" height="13" src="../../style/images/title_arrow.gif"/> 选项列表
		</div>
    </div>
	<div id="TitleArea_End"></div>
</div>


	<!-- 过滤条件 -->
	<div id="QueryArea">
		<form action="/option/optionList.action"method="post">
			<input type="submit" value="搜索">
		</form>
	</div>
<!-- 主内容区域（数据列表或表单显示） -->
<div id="MainArea">
    <table class="MainArea_Content" align="center" cellspacing="0" cellpadding="0">
        <!-- 表头-->
        <thead>
            <tr align="center" valign="middle" id="TableTitle">
				<td>选项编号</td>
				<td>内容</td>
				<td>所属主题</td>
				<td>操作</td>
			</tr>
		</thead>	
		<!--显示数据列表 -->
        <tbody id="TableData">
			<c:forEach items="${applicationScope.options}" var="objects">
				<tr class="TableDetail1">
				<c:forEach items="${objects}" var="selector">
					 <c:if test="${selector==objects[0]}">
						<td align="center">${selector.oid}</td>
						<td align="center">${selector.content}</td>
					 </c:if>
					<c:if test="${selector==objects[1]}">
					<td align="center">${selector.itemname}</td>
					</c:if>
				</c:forEach>
				<td>
					<a href="/option/optionDelete.action?opId=${objects[0].oid}" onclick="delConfirm()">删除</a>
				</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- 其他功能超链接 -->
   <!-- 其他功能超链接 -->
	<div id="TableTail" align="center">
		<div class="FunctionButton"><a href="/item/itemShow.action" target="right">添加</a><br></div>
    </div> 
</div>
</body>
</html>
