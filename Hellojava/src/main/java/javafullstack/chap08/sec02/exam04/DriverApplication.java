package javafullstack.chap08.sec02.exam04;

/**
 * packageName : javafullstack.chap08.sec02.exam04
 * fileName : DriverApplication
 * author : hyuk
 * date : 2022/09/30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class DriverApplication {
    public static void main(String[] args) {
        Flyable flyable = new Bat();
        flyable.fly();

        flyable = new Sparrow();
        flyable.fly();

        Swimable swimable = new Whale();
        swimable.swim();
    }
}
