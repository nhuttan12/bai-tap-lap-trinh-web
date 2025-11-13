import num.NumberGuessBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/guess")
public class NumGuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy session của người dùng, tạo mới nếu chưa có
        HttpSession session = request.getSession(true);

        // Đọc bean numguess thuộc kiểu num.NumberGuessBean trong phạm vi session
        // nếu chưa có numguess, tạo bean numguess và đưa vào phạm vi session
        NumberGuessBean numguess = (NumberGuessBean) session.getAttribute("numguess");
        if (numguess == null) {
            numguess = new NumberGuessBean();
            session.setAttribute("numguess", numguess);
        }

        // Nếu muốn chơi lại game, reset bean numguess để bắt đầu với số đoán mới
        if ("startAgain".equals(request.getParameter("action"))) {
            // reset bean numguess
            numguess.reset();
            request.getRequestDispatcher("start.jsp").forward(request, response);
            return;
        }
        // xử lý số đoán của người dùng
        numguess.setGuess(request.getParameter("guess"));
        if (numguess.getSuccess()) {
            // chuyển tới trang done.jsp
            request.getRequestDispatcher("done.jsp").forward(request, response);
        } else {
            // chuyển tới trang again.jsp
            request.getRequestDispatcher("again.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}