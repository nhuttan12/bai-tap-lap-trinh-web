<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head><title>Number Guess</title></head>
<body>
<%-- Đọc bean numguess thuộc kiểu num.NumberGuessBean trong phạm vi session --%>
<jsp:useBean id="numguess" class="num.NumberGuessBean" scope="session" />
Congratulations! You got it.
And after just <jsp:getProperty name="numguess" property="numGuesses" /> tries.
<jsp:setProperty name="numguess" property="reset" />
<p>Care to <a href="guess?action=startAgain">try again</a>?
</body>
</html>