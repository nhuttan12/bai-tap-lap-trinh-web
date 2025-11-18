import beans.SurveyData;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SurveyProcess")
public class SurveyServletController extends javax.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        // Tạo một mục đối tượng surveyData thuộc kiểu SurveyData thêm vào phạm vi
        // application và gán vào biến data.
        SurveyData data = (SurveyData) context.getAttribute("surveyData");
        if (data == null) {
            data = new SurveyData();
            context.setAttribute("surveyData", data);
        }
        // Đọc dữ liệu "nghe" người dùng chọn
        String nghe = request.getParameter("nghe");
        // Tăng số người bình chọn nghề yêu thích nghe
        data.increasingValue(nghe);
        context.setAttribute("surveyData", data);
        request.setAttribute("description", data.getDescription(nghe));
        // Chuyển tới trang result.jsp để hiển thị kết quả
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
