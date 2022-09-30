package javafullstack.chap08.sec01.exam03;

/**
 * packageName : javafullstack.chap08.sec01.exam03
 * fileName : MyClassApplication
 * author : hyuk
 * date : 2022/09/30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class MyClassApplication {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(new Television());
        System.out.println("============================");
        myClass = new MyClass(new Audio());
    }
}
