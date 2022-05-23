<%--
  Created by IntelliJ IDEA.
  User: xen
  Date: 2017/12/5
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %>

<c:set var="title" value="用户管理"/>
<%@include file="common/adminHeader.jsp" %>
<c:set var="light" value="2"/>
<%@include file="common/adminNavigator.jsp" %>


<div class="container">
    <ol class="breadcrumb">
        <li>用户管理</li>
    </ol>
    <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">用户名</th>
            <th scope="col">用户组</th>
            <th scope="col">修改用户组</th>
        </tr>
        </thead>
        <tbody>

        <%--@elvariable id="users" type="servlet.UserServlet"--%>
        <c:forEach items="${users}" var="u" varStatus="vs">
            <tr>
                <th scope="row">${u.id}</th>
                <td>${u.name}</td>
                <td>${u.group}</td>
<%--                //littlestar TODO : 用户组修改 --%>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="common/adminPage.jsp" %>

<%@include file="common/adminFooter.jsp" %>

