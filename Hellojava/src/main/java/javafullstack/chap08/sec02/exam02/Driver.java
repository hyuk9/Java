package javafullstack.chap08.sec02.exam02;

/**
 * packageName : javafullstack.chap08.sec02.exam02
 * fileName : Driver
 * author : hyuk
 * date : 2022/09/30
 * description : 전략 클래스(공유함수 : 매개변수의 다형성)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Driver {
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}
