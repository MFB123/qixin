<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生信息页面</title>
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

function subt(){

	
	//alert($("#pnames").val().length);
	//alert($("#ptels").val().length);

	if($("#ptels").val().length!=11){
	alert("家长手机格式不对！！")
	return false;
			}

	if($("#pnames").val().length<1){
		alert("家长名字必须输入！！")
		return false;
		}
	
	else {
return true;
		}

	
}
</script>



</head>
<body>
<form action="inserStudent.do" method="post" onsubmit="return subt();">

<br><br>
学号：<input type="text" name="xhid"/><br><br>
姓名：<input type="text" name="name"/><br><br>
性别：<input type="radio"name="sex" value="男" />男<input type="radio" name="sex" value="女" />女<br><br>
年龄：<input type="text" name="age" /><br><br>
生日：<input type="text" name="birthday" onfocus="WdatePicker()"/><br><br>
身份证号码：<input type="text" name="cardid"/><br><br>
本人联系电话：<input type="text" name="tel"/><br><br>
学历：
<input type="radio" value="初中" name="education"/>初中
<input type="radio" value="高中" name="education"/>高中
<input type="radio" value="中专" name="education"/>中专
<input type="radio" value="大专" name="education"/>大专
<input type="radio" value="本科" name="education"/>本科<br><br>
家长姓名1：<input type="text" id="pnames" name="parent_name01"/><span style="color:red;">必填</span><br><br><!-- 正则验证 -->
家长联系电话1：<input type="text" id="ptels" name="parent_tel01"/><span style="color:red;">必填</span><br><br><!-- 正则验证 -->
家长姓名2：<input type="text" name="parent_name02"/><br><br>
家长联系电话2：<input type="text" name="parent_tel02"/><br><br>

学制：
<input type="radio" value="6" name="school_system"/>6月
<input type="radio" value="10" name="school_system"/>10月
<input type="radio" value="16" name="school_system"/>16月
<input type="radio" value="36" name="school_system"/>36月<br><br>
入学时间：<input type="text" name="enrolment_time" onfocus="WdatePicker()"/><br><br>
入学班级：
<select  id="college"  name="cid"  onclick="major1()"><option value="0">--请选择--</option></select>
<select  id="major" name="mid" onclick="class1()"><option value="0">--请选择--</option></select>
<select  id="class" name="class_id" ><option value="0">--请选择--</option></select>

<input type="submit" value="确认新增学生信息" />
</form>





</body>
</html>
