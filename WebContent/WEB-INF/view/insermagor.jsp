<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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

</script>

</head>
<body>
<form action="insermagor.do" method="post">
选择地区：
<select  id="coll" name="cid"  onclick="diqu()"><option value="0">--请选择--</option></select>
输入学院：
<input type="text" name="name"/>
<input type="submit"/>
</form>
</body>
</html>