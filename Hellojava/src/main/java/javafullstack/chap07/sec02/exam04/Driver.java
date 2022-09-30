package javafullstack.chap07.sec02.exam04;

import javafullstack.chap08.sec02.exam02.Taxi;

/**
 * packageName : javafullstack.chap07.sec02.exam04
 * fileName : Driver
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Driver {
//    운전 함수
//    매개변수 : Vehicle (부모 클래스)
//    다형성 : 자식객체인(Bus, Taxi) 2개 중에 1개를 전달하면
//    Bus객체 전달하면 Bus.run() 실행(재정의된 함수)
//    Taxi 객체 전달하면 Taxi.run() 실행(재정의된 함수)
    public void drive(Taxi vehicle){
        vehicle.run();
    }
}
