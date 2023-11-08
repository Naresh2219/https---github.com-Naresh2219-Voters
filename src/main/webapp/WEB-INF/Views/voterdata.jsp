<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:directive.page isELIgnored="false" />

<!DOcTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>VoterId</th>
			<th>Party Name</th>
			<th>Party area</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="voter">
			<tr>
				<td><c:out value="${voter.voterId}"></c:out></td>
				<td><c:out value="${voter.voterParty}"></c:out></td>
				<td><c:out value="${voter.voterArea}"></c:out></td>
			
			<td><a href="edit?id=${voter.voterId }">edit</a></td>
			<td><a href="delete?id=${voter.voterId }">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>