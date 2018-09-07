<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="app">
<head>
    <style>
     h1{
         color:pink;
         font-size: 20px;
     }
        span{
            font-size: 30px;
            color:black;
        }
    </style>
</head>
<h1 >欢迎<span>${user.username }</span>光临!请选择你的操作:</h1><br>
<ul>
    <shiro:hasPermission name="add"><li>增加</li></shiro:hasPermission>
    <shiro:hasPermission name="delete"><li>删除</li></shiro:hasPermission>
    <shiro:hasPermission name="update"><li>修改</li></shiro:hasPermission>
    <shiro:hasPermission name="query"><li>查询</li></shiro:hasPermission>
</ul>
<a href="${pageContext.request.contextPath }/logOut">点我注销</a>
</html>