<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改班级名字</title>
</head>
<body>
<form action="updaclassname.do" method="post">
<input type="hidden" name="class_id" value="${param.class_id }"/>
<input type="text" name="name" value="${param.classname }"/>
<input type="submit" value="确认修改班级名称"/>
</form>
</body>
</html>