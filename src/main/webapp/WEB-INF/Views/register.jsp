<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Voting</title>
</head>
<body>
	<form:form action="savevoter" method="post" modelAttribute="voter">
<%-- voterId<form:input path="voterId" />
		<br> --%>
voterPartyName<form:input path="voterParty" />
		<br>
voterArea<form:input path="voterArea" />
		<br>
		<button type="submit">Register</button>
	</form:form>
	<a href="../Voter/3"><button>VoterData</button></a>
</body>
</html>