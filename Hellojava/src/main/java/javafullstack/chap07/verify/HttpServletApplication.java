package javafullstack.chap07.verify;

/**
 * packageName : javafullstack.chap07.verify
 * fileName : HttpServletApplication
 * author : hyuk
 * date : 2022/09/30
 * description : 자식
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class HttpServletApplication {
    public static void main(String[] args) {
        method(new LoginServlet());         // "로그인 합니다"
        method(new FileDownloadServlet());  // "파일 다운로드합니다."
//        LoginServlet loginServlet = new LoginServlet();
//        FileDownloadServlet fileDownloadServlet = new FileDownloadServlet();
    }

//    HttpServlet : 부모클래스
//    LoginServlet : 자식클래스
//    FileDownLoadServlet : 자식클래스
    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}
