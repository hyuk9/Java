package javafullstack.chap06.sec04.verify.exam04;

/**
 * packageName : javafullstack.chap06.sec04.verify.exam04
 * fileName : PrinterApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class PrinterApplication {
    public static void main(String[] args) {
//        💡공유함수 오버로딩 예제
//        ✅공유함수 호출하는 방법
//        ✅사용법 : 클래스명.공유함수명();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
