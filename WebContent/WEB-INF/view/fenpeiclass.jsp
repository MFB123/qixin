<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<form action="fenpeiclass.do" method="post">
<input type="hidden" name="sid" value="${param.sid }"/>
<select  id="college"  name="cid" onclick="major1()"><option value="">--请选择--</option></select>
<select  id="major" name="mid" onclick="class1()"><option value="">--请选择--</option></select>
<select  id="class" name="class_id" ><option value="">--请选择--</option></select><br>
<input type="submit" value="确认选择"/>
</form>
</body>
</html>