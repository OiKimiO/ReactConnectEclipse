<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
$(function(){
	// 바로 사용하면 됨
})// function end
</script>
</head>
<body>
<div >
	<h2>디비 테스트 샘플입니다.</h2>
	<table>
		<thead>
			<th>데이터1</th>
			<th>데이터2</th>	
		</thead>
		<tbody>
			<c:forEach var="example" items="${example}" >
				<td>${example.test_name}</td>
			</c:forEach>
		</tbody>
		
	</table>	
</div>
</body>
</html>