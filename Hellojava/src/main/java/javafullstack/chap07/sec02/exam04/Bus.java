package javafullstack.chap07.sec02.exam04;

/**
 * packageName : javafullstack.chap07.sec02.exam04
 * fileName : Bus
 * author : hyuk
 * date : 2022/09/29
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }
}
