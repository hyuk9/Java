package javafullstack.chap12.sec01.exam01;

import java.awt.*;

/**
 * packageName : javafullstack.chap12.sec01.exam01
 * fileName : BeepTask
 * author : hyuk
 * date : 2022/10/06
 * description : 작업쓰레드
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class BeepTask implements Runnable{
//    ➡️ 작업쓰레드 실행 함수
    @Override
    public void run() {
//        ➡️ beep을 들려주는 코드
//        ✅ 자바쪽 멀티미디어 객체 : 소리, 그림, 이미지 etc 다루는 객체
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // pc 비프음
            try {
                Thread.sleep(500); // 0.5초 지연 그 후 비프음
            } catch (Exception e){
                System.out.println();
            }

        }
    }
}
