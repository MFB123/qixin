<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级列表</title>
</head>
<body>
<br>
<a href="fanhui.do">返回</a>
<br>
<table cellspacing="0" border="1" align="center">
<tr>
<td>id</td><td>班级名称</td><td>开班时间</td><td>结束时间</td><td>所在专业</td><td>所在院校</td><td>操作</td>
</tr>
<c:forEach items="${list }" var="i">
<tr>
<td>${i.class_id }</td>
<td>${i.classname }</td>
<td>${i.start_time }</td>
<td>${i.end_time }</td>
<td>${i.majorname }</td>
<td>${i.collegename }</td>
<td>

<a href="classDetails.do?class_id=${i.class_id }&classname=${i.classname }">班级详细信息</a>

</td>
</tr>
</c:forEach>
<tr>
<td colspan="7">
${page } 当前页${cpage}/${tpage }
</td>
</tr>
</table>
</body>
</html>