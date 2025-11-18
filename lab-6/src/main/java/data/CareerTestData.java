package data;

import model.Conclusion;
import model.Option;
import model.Question;

public class CareerTestData {
    private static Question[] questions;
    private static Conclusion[] conclusions;
    static {
        Question q1 = new Question(
                "Cuối cùng đợt nghỉ mong đợi của bạn đã đến và bạn vui sướng "
                        + "ngắm nhìn vé du lịch vừa mua. Bỗng nhiên sếp gọi điện và giao cho bạn một việc "
                        + "cần làm gấp. Bạn:",
                new Option[] {
                        new Option("Làm ầm lên. Không ai có quyền cản trở kỳ nghỉ của bạn", 3),
                        new Option(
                                "Cắm đầu cắm cổ làm suốt ngày đêm để làm sao kịp hoàn thành "
                                        + "và thanh thản đi nghỉ", 2),
                        new Option("Hoãn chuyến đi lại một vài ngày", 1) });
        Question q2 = new Question(
                "Trong công ty của bạn có một vị trí hấp dẫn với đồng lương "
                        + "cao đang bỏ trống. Nhưng ngoài bạn còn có 2 đồng nghiệp nữa hướng tới vị trí "
                        + "này. Bạn sẽ có động tác gì?",
                new Option[] {
                        new Option(
                                "Bình tĩnh làm việc. Những phẩm chất trong công việc của bạn không"
                                        + " cần phải \"quảng cáo\"", 2),
                        new Option("Có thái độ bình thản trước tất cả", 1),
                        new Option("Khẩn cấp \"làm thân\" với sếp, nhận về phía mình những "
                                + " việc làm \"đồ sộ\"", 3) });
        Question q3 = new Question(
                "Tại cuộc triển lãm bạn gặp một người quan tâm đến bạn. Bạn sẽ:",
                new Option[] {
                        new Option("Tìm ngay lý do để bắt chuyện với người đó", 3),
                        new Option(
                                "Chờ đợi tình huống thích hợp để tự giới thiệu với người đó",

                                2), new Option("Cứ để xem thế nào", 1) });

        Question q4 = new Question(
                "Bạn tình cờ đụng vào ai đó trên xe buýt. Bạn sẽ phản ứng thế nào?",
                new Option[] { new Option("Lạnh lùng nói: \"Xin lỗi\"", 2),
                        new Option("\"Với ai mà chuyện như thế chẳng xảy ra\"", 1),
                        new Option("Buông một câu thô lỗ", 3) });
        Question q5 = new Question(
                "Buổi sáng, bạn bị trễ khi đến gặp những khách hàng quan trọng. "
                        + "Nhưng ở lối vào đang có đoàn người xếp hàng dài chờ trình giấy tờ. Bạn:",
                new Option[] {
                        new Option(

                                "Không chú đến ai cả và lao ngay vào cửa. Đó thực sự là cuộc gặp "
                                        + "quan trọng", 3),
                        new Option("Bạn lo lắng, nhưng nhẫn nại xếp hàng chờ", 1),
                        new Option(
                                "Bình tĩnh giải thích cho những người xung quanh nguyên nhân phải "
                                        + "vội vàng và đề nghị mọi người cho qua nhanh", 2) });
        questions = new Question[] { q1, q2, q3, q4, q5 };
        conclusions = new Conclusion[] {
                new Conclusion(0,
                        "Khó có thể gọi bạn là người bon chen thăng tiến. Về bản chất, "
                                + "bạn là người hay nhân nhượng, e dè và cố gắng không làm mình nổi trội. "
                                + "Thậm chí cả những thành công và danh vọng của các đồng nghiệp từ lâu cũng "
                                + "không khiến bạn ghen tị. Bạn đừng thất vọng, những người quản lý giỏi "
                                + "thường bắt đầu từ chính những \"dân đen\". Tuy nhiên, bạn không nên lười "
                                + "và đôi khi vẫn cần nhắc nhở sếp về khả năng chuyên môn của bạn."),
                new Conclusion(8,
                        "Đôi khi bạn mơ ước về thành tích chuyên môn và sự thăng tiến "
                                + "trong sự nghiệp, nhưng ngay lúc đó bạn nghi ngờ về bản thân mình, viện lý "
                                + "tất cả những cái đó không phải để dành cho mình. Bạn hãy làm việc thật nhiều "
                                + "với cá tính của mình, hãy tập đặt ra mục tiêu, tham dự các khóa huấn luyện "
                                + "phát triển cá nhân. Nhiều khả năng bạn còn thiếu sự tự tin và ý chí để đạt "
                                + "được thành công."),
                new Conclusion(13,
                        "Bạn là người trọng danh dự và dễ tự ái. Bạn luôn biết rõ mình "
                                + "muốn gì và không chịu được những người cản đường mình. Nhưng để đạt được "
                                + "thành tích, còn cần những phẩm chất khác: óc suy tính, tầm hiểu biết, tính "
                                + "khách quan và sự kiềm chế. Còn điều quan trọng nữa là biết cách quan hệ "
                                + "hài hòa với những người xung quanh và có thái độ kiên nhẫn đối với họ.") };
    }
    public static Question[] getQuestions() {
        return questions;
    }
    public static Conclusion[] getConclusions() {
        return conclusions;
    }
}
