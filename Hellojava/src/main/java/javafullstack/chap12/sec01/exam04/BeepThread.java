package javafullstack.chap12.sec01.exam04;

import java.awt.*;

/**
 * packageName : javafullstack.chap12.sec01.exam02
 * fileName : BeepThread
 * author : hyuk
 * date : 2022/10/06
 * description : Thread 클래스 상속받아 만들기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class BeepThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음
            try {
                Thread.sleep(500); // 0.5초 비프음 지연
            }catch (Exception e){
                System.out.println();
            }
        }
    }
}
