<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学院选择</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.js"></script>

<script type="text/javascript">

 $(function(){
	var url="<%=request.getContextPath() %>/getCollege.do";
	
	$.post(url,function(result){
		console.log(result)
		for(var i=0;i<result.length;i++){
			$("#coll").append("<option value='"+result[i].cid+"' >"+result[i].name+"</option>");

		}
			
	},'json')


	
}) 
function diqu(){
	var cid = $("#coll").val();
	var url="<%=request.getContextPath() %>/getMajor.do";
	$.post(url,{cid:cid},function(result){
		$("#zhy option").remove();
		for(var i=0;i<result.length;i++){
			$("#zhy").append("<option value='"+result[i].mid+"' >"+result[i].name+"</option>");


		}
	},'json')
}

</script>


</head>
<body>
<form action="inserClass.do" method="post">
选择地区：
<select  id="coll"  onclick="diqu()"><option value="0">--请选择--</option></select>
选择专业：
<select  id="zhy" name="mid" ><option value="0">--请选择--</option></select>
班级名称：<input type="text" name="name" /><br>
开班时间：<input type="text" name="start_time" onfocus="WdatePicker()"/><br>
结束时间：<input type="text" name="end_time" onfocus="WdatePicker()"/><br>
<input type="submit" value="确认新增班级"/>
</form>
</body>
</html>