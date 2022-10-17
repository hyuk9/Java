package javafullstack.chap08.sec01.exam01;

/**
 * packageName : javafullstack.chap08
 * fileName : RemoteControlApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class RemoteControlApplication {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn(); // 재정의된 구현클래스(자식클래스) 함수 호출
        rc.setVolumn(0); // 재정의된 구현클래스(자식클래스) 함수 호출
        rc.turnOff(); // 재정의된 구현클래스(자식클래스) 함수 호출

        rc = new Audio();
        rc.turnOn(); // 재정의된 구현클래스(자식클래스) 함수 호출
        rc.setVolumn(10); // 재정의된 구현클래스(자식클래스) 함수 호출
        rc.turnOff(); // 재정의된 구현클래스(자식클래스) 함수 호출
    }
}
