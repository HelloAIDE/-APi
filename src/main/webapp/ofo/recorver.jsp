<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>免费领取OFO月卡</title>
</head>
<body>

	<script type="text/javascript">
	
	<c:if test="${data!=null}">
		alert("${data }");
	</c:if>
</script>
	<div class="header">
		<div>免费领取OFO月卡</div>
	</div>
	<div>
		<div>
			<form action="/ofo.do"> 
				<label>手机号：<input name="phone"></label>
				<lable><input type="submit"></lable>
			</form>
		</div>
	</div>
</body>
</html>