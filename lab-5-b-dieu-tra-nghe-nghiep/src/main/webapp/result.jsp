<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="surveyData" class="beans.SurveyData" scope="application"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ket qua</title>
</head>
<body>
<p>Cam on ban da tham gia cuoc khao sat</p>
<b>Nghe nghiep ban yeu thich nhat la: ${description}
</b>
<h2>Ket qua:</h2>
Tong so nguoi tham gia binh chon la : ${surveyData.toTal} trong do:
<br>
<br>
<c:forEach var="item" items="${surveyData.surveyItems}">
    Co ${surveyData.getPercent(item.name)}%
    % nguoi tham gia binh chon thich nghe ${item.description}<br>
</c:forEach>
</body>
</html>