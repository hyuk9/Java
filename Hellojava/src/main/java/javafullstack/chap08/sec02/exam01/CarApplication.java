package javafullstack.chap08.sec02.exam01;

/**
 * packageName : javafullstack.chap08.sec02.exam01
 * fileName : CarApplication
 * author : hyuk
 * date : 2022/09/30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */

// Q.한국타이어, 금호타이어 클래스 생성

//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    금호타이어가 굴러갑니다
//    금호타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다


public class CarApplication {
    public static void main(String[] args) {
//        자동차 객체 생성
        Car car = new Car();

        car.run();

        car.frontLeftTire = new KumhoTire();
        car.frontRightTire = new KumhoTire();
        System.out.println("===================================");

        car.run();
    }
}
