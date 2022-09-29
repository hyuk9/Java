package javafullstack.chap06.sec05.exam01;

/**
 * packageName : javafullstack.chap06.sec05.exam01
 * fileName : CarApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car("그랜저");
        Car car2 = new Car("벤츠");
        car.run(); //반복문 출력
        car2.run(); //반복문 출력
    }
}