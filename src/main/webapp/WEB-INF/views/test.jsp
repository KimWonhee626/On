<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<h1>사용자 이름</h1>
		<c:forEach var="player" items="${ player }">
			<tr>
				<td>${player.username }</td>
			</tr>
		</c:forEach>	

</div>

	

</body>
</html>