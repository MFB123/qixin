<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
<a href="fanhuilist.do">返回</a>
<table cellspacing="0" border="1" align="center">
<tr>
<td>学号</td><td>姓名</td><td>性别</td><td>年龄</td>
<td>生日</td><td>身份证号码</td>
<td>本人联系电话</td><td>学历</td><td>家长姓名1</td><td>家长联系电话1</td>
<td>家长姓名2</td><td>家长联系电话2</td><td>学制</td>
<td>入学时间</td><td>入学班级</td><td>学生状态</td>
</tr>
<c:forEach items="${list }" var="l">
<tr>
<td>${l.xhid }</td>
<td>${l.name }</td>
<td>${l.sex }</td>
<td>${l.age }</td>
<td>${l.birthday }</td>
<td>${l.cardid }</td>
<td>${l.tel }</td>
<td>${l.education }</td>
<td>${l.parent_name01 }</td>
<td>${l.parent_tel01 }</td>
<td>${l.parent_name02 }</td>
<td>${l.parent_tel02 }</td>
<td>${l.school_system }</td>
<td>${l.enrolment_time }</td>
<td>${l.student_class }</td>
<td>${l.student_status }</td>
</tr>
</c:forEach>
<tr>
<td colspan="16" align="center">

<a href="toupdaclass.do?class_id=${param.class_id }&classname=${param.classname }">修改班级名称</a>${page } 当前页${cpage}/${tpage }

<a href="deleclass.do?class_id=${param.class_id }">删除班级</a>



</td>
</tr>
</table>

</body>
</html>