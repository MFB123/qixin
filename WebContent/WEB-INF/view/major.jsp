<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>专业</title>
<%-- <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/My97DatePicker/WdatePicker.js"></script>
  
<script type="text/javascript">
$(function(){
	var cid=${param.cid };
	var url="<%=request.getContextPath() %>/getMajor.do";
	$.post(url,{cid:cid},function(result){
	
	console.log(result)
	
	for(var i=0;i<result.length;i++){
		$("#maj").append("<input type='radio' name='mid' value='"+result[i].mid+"' />"+result[i].name);
		
		}

	
		},'json')
})
</script> --%>
</head>
<body>
<!-- <form action="inserClass.do" method="post">
班级名称：<input type="text" name="name" /><br>
开班时间：<input type="text" name="start_time" onfocus="WdatePicker()"/><br>
结束时间：<input type="text" name="end_time" onfocus="WdatePicker()"/><br>
选择专业：<span id="maj"></span><br><br>
<input type="submit" value="确认新增班级"/>
</form> -->

</body>
</html>