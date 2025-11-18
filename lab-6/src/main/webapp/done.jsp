<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Done</title>
</head>
<body>
<jsp:useBean id="quizTest" type="beans.QuizTest" scope="session" />
<p><b>Cám ơn bạn đã tham gia bài trắc nghiệm!</b>
<p><b>Tổng điểm của bạn là: </b>${quizTest.totalPoints}
<p><b>Kết luận:</b>
<p>${conclusion.content}</p>
<form method="post" action="QuizCareerTestServlet">
  <p><input type="submit" value="Start Again" name="startAgain">
</form>
</body>
</html>