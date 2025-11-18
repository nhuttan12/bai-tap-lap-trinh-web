<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Career Test</title>
</head>
<body>
<jsp:useBean id="quizTest" class="beans.QuizTest" scope="session"/>
<b>Câu hỏi ${quizTest.currentQuestionIndex + 1}:</b>
</br>
<p>${quizTest.currentQuestion.content}
<form method="post" action="QuizCareerTestServlet">
    <c:forEach var="op" items="${quizTest.currentQuestion.options}" varStatus="st">
    <p><input type="radio" name="choose" value="${st.index}">
            ${op.content}
        </c:forEach>
    <p><input type="submit" value="Next" name="next">

</form>
</body>
</html>