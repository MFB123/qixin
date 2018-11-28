<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生管理页面</title>
<script type="text/javascript">
function mohu(){
	var aaa=document.getElementById("ohu").value;
location.href="xues1.do?mohu="+aaa;
	
}



</script>
</head>
<body>
<a href="fanhuiind.do">返回</a>
<a href="toinserStudent.do">添加学生信息</a>
<input type="text" id="ohu" name="mohuname"><input type="button" onclick="mohu()" value="查询">
<br>



未分配班级
<table cellspacing="0" border="1" align="center">
<tr>
<td>学号</td><td>姓名</td><td>性别</td><td>年龄</td>
<td>生日</td><td>身份证号码</td>
<td>本人联系电话</td><td>学历</td><td>家长姓名1</td><td>家长联系电话1</td>
<td>家长姓名2</td><td>家长联系电话2</td><td>学制</td>
<td>入学时间</td><td>入学班级</td><td>学生状态</td><td>操作</td>
</tr>
<c:forEach items="${weuk }" var="k">
<tr>
<td>${k.xhid }</td>
<td>${k.name }</td>
<td>${k.sex }</td>
<td>${k.age }</td>
<td>${k.birthday }</td>
<td>${k.cardid }</td>
<td>${k.tel }</td>
<td>${k.education }</td>
<td>${k.parent_name01 }</td>
<td>${k.parent_tel01 }</td>
<td>${k.parent_name02 }</td>
<td>${k.parent_tel02 }</td>
<td>${k.school_system }</td>
<td>${k.enrolment_time }</td>
<td>${k.student_class }</td>
<td>${k.student_status }</td>

<td><a href="tofenpeiclass.do?sid=${k.sid }">分配班级</a></td>
</tr>
</c:forEach>

</table>
 
<br>

已分配班级
<table cellspacing="0" border="1" align="center">
<tr>
<td>学号</td><td>姓名</td><td>性别</td><td>年龄</td>
<td>生日</td><td>身份证号码</td>
<td>本人联系电话</td><td>学历</td><td>家长姓名1</td><td>家长联系电话1</td>
<td>家长姓名2</td><td>家长联系电话2</td><td>学制</td>
<td>入学时间</td><td>入学班级</td><td>学生状态</td><td>操作</td>
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

<td><a href="delestu.do?sid=${l.sid }">删除学生信息</a><a href="updastu.do?sid=${l.sid }">修改学生信息</a></td>
</tr>
</c:forEach>
<tr>
<td colspan="17">
${page } 当前页${cpage}/${tpage }
</td>
</tr>
</table>


</body>
</html>