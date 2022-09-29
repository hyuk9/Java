package javafullstack.chap06.sec04.exam05;

/**
 * packageName : javafullstack.chap06.sec04.exam05
 * fileName : Car
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class Car {
//    키를 돌립니다
    void keyTurnOn(){
        System.out.println("키를 돌립니다");
    }

//    달립니다 출력
    int speed = 10;
    int run(){
        while(true){
            if (speed<60){
                System.out.println("달립니다. (시속:" + speed + "km/h)");
                if (speed >= 50){
                    return speed;
                }
                speed += 10;
            }
        }
    }

//    💡 -------------------- 강사님 풀이 ------------------------- 💡
//    void run() {
//        for (int i = 10; i <= 50; i += 10) {
//            speed = i;
//            System.out.println("달립니다.(시속:" + speed + "km/h)");
//        }
//    }
//    현재속도값 return
    int getSpeed(){
        return speed;
    }
}
