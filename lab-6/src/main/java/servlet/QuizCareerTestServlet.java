package servlet;

import beans.QuizTest;
import model.Conclusion;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class QuizCareerTestServlet extends HttpServlet {
    static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        QuizTest quizTest = (QuizTest) session.getAttribute("quizTest");

        String nextPage = "index.jsp";
        if (request.getParameter("next") != null) {
            int choose;
            try {
                choose = Integer.parseInt(request.getParameter("choose"));
            } catch (NumberFormatException e) {
                choose = -1;
            }
            if (choose == -1) {
                nextPage = "again.jsp";
            } else {
                quizTest.nextAction(choose);
                if (quizTest.hasMoreQuestions()) {
                    quizTest.nextQuestion();
                } else {
                    Conclusion conclusion = quizTest.getConclusionWhenDone();
                    request.setAttribute("conclusion", conclusion);
                    nextPage = "done.jsp";
                }
            }
        }
        if (request.getParameter("startAgain") != null) {
            quizTest.reset();
        }
        request.getRequestDispatcher(nextPage).forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
