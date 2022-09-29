package javafullstack.chap06.sec02.exam01;

/**
 * packageName : chap06.sec02.exam01
 * fileName : CarApplication
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class CarApplication {
    public static void main(String[] args){
//        객체 생성
        Car car = new Car();

//        속성 불러와서 출력하기
        System.out.println("제작회사 : " + car.company);
        System.out.println("모델 : " + car.model);
        System.out.println("색상 : " + car.color);
        System.out.println("최고속도 : " + car.maxSpeed);
        System.out.println("현재속도 : " + car.speed);

        car.speed = 60; // => 원본파일에 영향주지 않음
        System.out.println("현재속도 : " + car.speed);
    }
}
