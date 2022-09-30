package javafullstack.chap08.sec02.exam03;

/**
 * packageName : javafullstack.chap08.sec02.exam03
 * fileName : Bus
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void checkFare(){
        System.out.println("승차요금을 체크합니다");
    }
}
