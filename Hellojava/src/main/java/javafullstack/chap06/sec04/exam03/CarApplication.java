package javafullstack.chap06.sec04.exam03;

/**
 * packageName : javafullstack.chap06.sec04.exam03
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
        Car car = new Car();

        car.setGas(5);
        boolean gasState = car.isLeftGas();

        if (gasState){
            System.out.println("출발합니다");
            car.run();
        }

        if (car.isLeftGas() == true){
            System.out.println("gas를 주입할 필요가 없습니다");
        }else {
            System.out.println("gas를 주입하세요");
        }
    }
}
