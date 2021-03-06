﻿<%@ page import="com.lyq.bean.Item" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><!-- 包含公共的JSP代码片段 -->
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="../../style/js/jquery.js"></script>
<script type="text/javascript" src="../../style/js/page_common.js"></script>
<link href="../../style/css/common_style_blue.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="../../style/css/index_1.css" />
	<script type="text/javascript" src="/style/js/xmlhttp.js"></script>
</head>
<body>
<!-- 页面标题 -->
<div id="TitleArea">
	<div id="TitleArea_Head"></div>
	<div id="TitleArea_Title">
		<div id="TitleArea_Title_Content">
			<img border="0" width="13" height="13" src="../../style/images/title_arrow.gif"/> 添加新选项
		</div>
    </div>
	<div id="TitleArea_End"></div>
</div>

<!-- 主内容区域（数据列表或表单显示） -->
<div id="MainArea">
	<!-- 表单内容 -->
	<form action="/option/optionSave.action" method="post" enctype="multipart/form-data">
		<!-- 本段标题（分段标题） -->
		<div class="ItemBlock_Title">
        	<img width="4" height="7" border="0" src="../../style/images/item_point.gif"> 选项信息&nbsp;
        </div>
		<!-- 本段表单字段 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
				<div class="ItemBlock2">
					<table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
						<td width="80px">所属主题</td>
						<td>
                            <select name="itId" style="width:80px">
								<option vlaue="" selected="selected"></option>
								<c:forEach items="${applicationScope.iTms}" var="items">
									<option value="${items.imid}">${items.itemname}</option>
								</c:forEach>
							</select>
							<input type="hidden" name="id" value="" />*
						</td>
					</tr>
					<%--<tr>
						<td width="80px">选项编号</td>
						<td><input type="text" name="optId" class="InputStyle" value=""> *</td>
					</tr>--%>
					<tr>
						<td width="80px">选项内容</td>
						<td><input type="text" name="content" class="InputStyle" value=""> *</td>
					</tr>
					</table>
				</div>
            </div>
        </div>
		<!-- 表单操作 -->
		<div id="InputDetailBar">
			<input type="submit" value="添加" class="FunctionButtonInput"  >
			<a href="javascript:history.go(-1);" class="FunctionButton">返回</a>
        </div>
	</form>
</div>
</body>
</html>
