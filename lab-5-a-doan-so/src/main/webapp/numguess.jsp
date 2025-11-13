<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="numguess" class="num.NumberGuessBean" scope="session"/>
<jsp:setProperty name="numguess" property="*" />
<html>
<head><title>Number Guess</title></head>
<body bgcolor="white">
<c:if test="${numguess.success}">
    <jsp:setProperty name="numguess" property="reset"/>
    Congrat ulations! You got it.
    And after just ${numguess.numGuesses} tries.<p>
    Care to<a href="numguess.jsp">try again</a>?
</c:if>
<c:if test="${!numguess.success and numguess.numGuesses == 0}">
    Welcome to the Number Guess game.<p>
    I'm thinking of a number between 1 and 100.<p>
    <form method="get">
        What's your guess?
        <input type="text" name="guess">
        <input type="submit" value="Submit">
    </form>
</c:if>

<c:if test="${!numguess.success and numguess.numGuesses > 0}">
    Good guess, but nope. Try <b>${numguess.hint}</b>.<br>
    You have made ${numguess.numGuesses} guesses.<p>

    I'm thinking of a number between 1 and 100.<p>

    <form method="get">
        What's your guess?
        <input type="text" name="guess">
        <input type="submit" value="Submit">
    </form>
</c:if>

</body>
</html>