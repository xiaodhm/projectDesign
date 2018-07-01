<%--
  Created by IntelliJ IDEA.
  User: juna
  Date: 2017/12/8
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>投票管理系统</title>
  </head>
  <frameset rows="28%,*,10%"  >
      <frame src="detail/back/component/top1.html" scrolling="no" noresize= />
      <frameset cols="21%,*">
          <frame noresize src="detail/front/left.jsp" scrolling="yes" />
          <frame noresize name="right" src="detail/front/right.jsp" scrolling="yes" />
      </frameset>
      <frame noresize name="status_bar" scrolling="no" src="detail/back/component/bottom1.html" />
  </frameset>
  <noframes>
      <body>
      你的浏览器不支持框架布局，推荐你使用<a href="http://www.firefox.com.cn/download/" style="text-decoration: none;">火狐浏览器</a>,
      <a href="http://www.google.cn/intl/zh-CN/chrome/" style="text-decoration: none;">谷歌浏览器</a>
      </body>
  </noframes>
</html>
