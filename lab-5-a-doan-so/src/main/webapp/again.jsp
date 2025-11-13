<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="numguess" class="num.NumberGuessBean" scope="session"/>
<html>
<head>
  <title>Number Guess</title>
</head>
<body>
<%-- Đọc bean numguess thuộc kiểu num.NumberGuessBean trong phạm vi session --%>
Good guess, but nope. Try <b><jsp:getProperty name="numguess" property="hint" /></b>.
You have made <jsp:getProperty name="numguess" property="numGuesses" /> guesses.
<p>I'm thinking of a number between 1 and 100.
<form method=get action="guess">
  <p>What's your guess?
    <input type=text name=guess>
    <input type=submit value="Submit">
</form>
</body>
</html>