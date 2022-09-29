package javafullstack.chap07.sec02.exam02;

/**
 * packageName : javafullstack.chap07.sec02.exam02
 * fileName : Car
 * author : hyuk
 * date : 2022/09/29
 * description : 자동차 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Car {
    //속성(==필드==멤버변수)
//    자동차의 4가지 타이어
    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);

    //생성자

    //메소드(함수)
//    자동차 운전함수
    int run() {
        System.out.println("[자동차가 달립니다.]");
//        .roll() 함수 호출 : 리턴값이 false면, 타이어 펑크, 아니면 계속 운전가능
        if(frontLeftTire.roll()==false) { stop(); return 1; }; //1번
        if(frontRightTire.roll()==false) { stop(); return 2; }; //2번
        if(backLeftTire.roll()==false) { stop(); return 3; }; //3번
        if(backRightTire.roll()==false) { stop(); return 4; }; //4번
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
