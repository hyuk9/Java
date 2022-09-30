package javafullstack.chap07.sec02.exam04;

/**
 * packageName : javafullstack.chap07.sec02.exam04
 * fileName : DriverApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class DriverApplication {
    public static void main(String[] args) {
//        운전함수를 가지고 있는 객체 생성
        Driver driver = new Driver();

//        vehicle의 자식객체들
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

//        매개변수의 다형성 : 매개변수값(bus, taxi)에 따라 결과가 달라짐
//        driver.drive(bus);
//        driver.drive(taxi);
    }
}
