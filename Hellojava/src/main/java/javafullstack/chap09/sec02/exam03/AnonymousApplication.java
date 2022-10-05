package javafullstack.chap09.sec02.exam03;

/**
 * packageName : javafullstack.chap09.sec02.exam03
 * fileName : AnonymousApplication
 * author : hyuk
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.method(0,0); // 지역변수(익명객체)
    }
}
