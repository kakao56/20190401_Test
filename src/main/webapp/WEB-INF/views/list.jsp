<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/lib/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		
	});
	function searchList(){
		$.ajax({
			url: "searchlist"
			,type: "post"
			,data: $("#searchfrm").serialize()
			,success: function(data){
				$("#listdv").html(data);
			}, error: function(err){
				console.log(err);
			}
		});
	}
</script>
</head>
<body onload="searchList()">
<h1>자유게시판11</h1>
<div id="searchdv">
	<form id="searchfrm">
	</form>
</div>
<div id="listdv">
</div>
</body>
</html>