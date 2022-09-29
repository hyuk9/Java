package javafullstack.chap07.sec02.exam02;

/**
 * packageName : javafullstack.chap07.sec02.exam02
 * fileName : CarApplication
 * author : hyuk
 * date : 2022/09/29
 * description : 속성의 다형성 예제, 타이어 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
    //    자동차 객체 생성
        Car car = new Car();
        for (int i = 0; i < 5; i++) {
            int problemLocation = car.run(); //자동차 함수 실행
//            조건문 problemLocation 체크(0~4)

            switch (problemLocation){
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
//                    다형성을 이용한 객체 교체
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
//                    다형성을 이용한 객체 교체
                    car.frontRightTire = new HankookTire("앞왼쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
//                    다형성을 이용한 객체 교체
                    car.backLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
//                    다형성을 이용한 객체 교체
                    car.backRightTire = new HankookTire("앞왼쪽", 15);
                    break;
            }
        }
    }
}
