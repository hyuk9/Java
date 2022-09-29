package javafullstack.chap07.sec01.exam06;

/**
 * packageName : javafullstack.chap07.sec01.exam06
 * fileName : Car
 * author : hyuk
 * date : 2022/09/29
 * description : final 함수, 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Car {
    public int speed;

//    속도 증가 함수
    public void speedUP() {
        speed += 1;
    }

//    final 함수
    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }


}
