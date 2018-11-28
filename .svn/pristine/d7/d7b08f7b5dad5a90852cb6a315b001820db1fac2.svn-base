<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改学生信息页面</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.js"></script>
<script type="text/javascript">

$(function(){
	var url = "<%=request.getContextPath() %>/stuGetCollege.do";
	
	$.post(url,function(result){
		console.log(result)
		for(var i=0;i<result.length;i++){
			$("#college").append("<option value='"+result[i].cid+"' >"+result[i].name+"</option>");

		}
			
	},'json')


	
})

function major1(){
	var cid = $("#college").val();
	var url ="<%=request.getContextPath() %>/stuGetMajor.do";
	$.post(url,{cid:cid},function(result){
		$("#major option").remove();
		for(var i=0;i<result.length;i++){
			$("#major").append("<option value='"+result[i].mid+"' >"+result[i].name+"</option>");


		}
	},'json')
}

function class1(){
	var mid = $("#major").val();
	var url ="<%=request.getContextPath() %>/stuGetClass.do";
	$.post(url,{mid:mid},function(result){
		$("#class option").remove();
		for(var i=0;i<result.length;i++){
			$("#class").append("<option value='"+result[i].class_id+"' >"+result[i].name+"</option>");

		}
	},'json')
} 


</script>
</head>
<body>
<form action="updastudent.do" method="post" >
<br><br>
<input type="hidden" name="sid" value="${stu.sid }"/>
姓名：<input type="text" name="name" value="${stu.name }"/><br><br>
性别：
<input type="radio"name="sex" value="男"<c:if test='${stu.sex.contains('男') }'>checked</c:if> />男
<input type="radio" name="sex" value="女"<c:if test='${stu.sex.contains('女') }'>checked</c:if>/>女<br><br>
 
年龄：<input type="text" name="age"  value="${stu.age }"/><br><br>
生日：<input type="text" name="birthday" value="${stu.birthday }" onfocus="WdatePicker()"/><br><br>
身份证号码：<input type="text" name="cardid" value="${stu.cardid }"/><br><br>
本人联系电话：<input type="text" name="tel" value="${stu.tel }" /><br><br>
学历：

<input type="radio" value="初中" name="education" <c:if test='${stu.education.contains('初中') }'>checked</c:if>/>初中
<input type="radio" value="高中" name="education" <c:if test='${stu.education.contains('高中') }'>checked</c:if>/>高中
<input type="radio" value="中专" name="education" <c:if test='${stu.education.contains('中专') }'>checked</c:if>/>中专
<input type="radio" value="大专" name="education" <c:if test='${stu.education.contains('大专') }'>checked</c:if>/>大专
<input type="radio" value="本科" name="education" <c:if test='${stu.education.contains('本科') }'>checked</c:if>/>本科<br><br>

家长联系电话1：<input type="text"  name="parent_tel01" value="${stu.parent_tel01 }"/><br><br><!-- 正则验证 -->
家长姓名2：<input type="text"  name="parent_name02" value="${stu.parent_name02 }"/><br><br>
家长联系电话2：<input type="text" name="parent_tel02" value="${stu.parent_tel02 }"/><br><br>

学制：
<input type="radio" value="6" name="school_system" <c:if test='${stu.school_system.contains('6') }'>checked</c:if>/>6月
<input type="radio" value="10" name="school_system" <c:if test='${stu.school_system.contains('10') }'>checked</c:if>/>10月
<input type="radio" value="16" name="school_system" <c:if test='${stu.school_system.contains('16') }'>checked</c:if>/>16月
<input type="radio" value="36" name="school_system" <c:if test='${stu.school_system.contains('36') }'>checked</c:if>/>36月<br><br>

入学班级：
<select  id="college"  name="cid" onclick="major1()"><option value="${college.cid }">${college.name }</option></select>
<select  id="major" name="mid" onclick="class1()"><option value="${majorone.mid }">${majorone.name }</option></select>
<select  id="class" name="class_id" ><option value="${classs.class_id }">${classs.name }</option></select><br>
学生状态：
<input type="radio" value="在读" name="student_status" <c:if test='${stu.student_status.contains('在读') }'>checked</c:if>/>在读
<input type="radio" value="休学" name="student_status" <c:if test='${stu.student_status.contains('休学') }'>checked</c:if>/>休学
<input type="radio" value="退学" name="student_status" <c:if test='${stu.student_status.contains('退学') }'>checked</c:if>/>退学
<input type="radio" value="毕业" name="student_status" <c:if test='${stu.student_status.contains('毕业') }'>checked</c:if>/>毕业<br>
<input type="submit" value="确认新增学生信息"/>
</form> 
</body>
</html>