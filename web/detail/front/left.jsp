<%--
  Created by IntelliJ IDEA.
  User: juna
  Date: 2017/12/13
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style>
        div{margin:0 auto;  }
    </style>

</head>
<body>
    <h3>用户登录:</h3>
    <div id="userlogin" style="height: 72%">
    <c:if test="${sessionScope.user==null}">
        <div id="userinformation" style="height: 42%">
            <form name="form1" method="post" action="/userLogin.action">
                <table align="center">
                    <tr>
                        <td align="right" style="width: 25%">账号：</td>
                        <td align="left" style="width: 63%"><input type="text" name="userId"></td>
                    </tr>
                    <tr>
                        <td align="right" style="width: 25%">密码：</td>
                        <td align="left" style="width: 63%"><input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td align="center" style="width: 25%"><input type="submit" value="登录"></td>
                    </tr>
                    <span>
                        <p style="color: red">${message}</p>
                    </span>
                </table>
            </form>
        </div>
    </c:if>
    <c:if test="${sessionScope.user!=null}">
        <div id="userinformation" style="height: 42%">
            <form name="form1"  >
                <table align="center">
                    <tr>
                        <td align="center" style="width: 25%"><a href="/option/optCheckUser.action?usrId=${sessionScope.user.usrid}" style="font-size: medium" target="right" >查看投票</a> </td>
                        <td align="center" style="width: 63%"><a href="/option/optCountUser.action?usrId=${sessionScope.user.usrid}" style="font-size: medium" target="right">我的投票</a> </td>
                        </tr>
                </table>
            </form>
        </div>
   </c:if>
    </div>
    <hr>
    <h3>管理员登录</h3>
    <div id="adminlogin" style="height: 28%">
    <c:if test="${sessionScope.admin==null}">
        <form name="form2" method="post" action="/adminLogin.action">
            <table align="center">
                <tr>
                    <td align="right" style="width: 25%">用户名:</td>
                    <td align="left" style="width: 63%"><input type="text" name="adminid" ></td>
                </tr>
                <tr>
                    <td align="right" style="width: 25%">密码：</td>
                    <td align="left" style="width: 63%"><input type="text" name="adminpass" ></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" value="登录"> </td>
                </tr>
                <tr>
                     <td align="center" colspan="2" >${message1}</td>
                </tr>
            </table>
        </form>
    </c:if>
    <c:if test="${sessionScope.admin!=null}">
        <a href="../../index1.html" target="_blank" style="font-size: medium;align-content: center">后台管理</a>
    </c:if>
    </div>
</body>
</html>
