package javafullstack.chap08.sec02.exam02;

/**
 * packageName : javafullstack.chap08.sec02.exam02
 * fileName : Taxi
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Taxi implements Vehicle{
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
