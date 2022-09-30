package javafullstack.chap08.sec02.exam03;

/**
 * packageName : javafullstack.chap08.sec02.exam03
 * fileName : VehicleApplication
 * author : hyuk
 * date : 2022/09/30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */

//  결과
//    버스가 달립니다
//    버스가 달립니다
//    승차요금을 체크합니다
public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run(); // 버스가 달립니다

        Bus bus = (Bus) vehicle; // 강제 형변환

        bus.run(); // 버스가 달립니다
//        bus 객체의 고유 함수 : checkFare()
        bus.checkFare(); // 승차요금을 체크합니다
    }
}
