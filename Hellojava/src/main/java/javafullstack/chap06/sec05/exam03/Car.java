package javafullstack.chap06.sec05.exam03;

/**
 * packageName : javafullstack.chap06.sec05.exam03
 * fileName : Car
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */

// 예제 : 공유변수(함수) 쓸 때의 주의점
public class Car {
    int speed; // 속성
    void run(){
        System.out.println(speed + "으로 달립니다.");
    } //함수

    public static void main(String[] args) {
//        this.speed = 60; // 에러 발생‼️ => 일반속성은 바로 사용할 수 없음
//        같은 클래스라도 객체를 생성해서 사용해야함
        Car car = new Car();
        car.speed = 60;
    }
}
