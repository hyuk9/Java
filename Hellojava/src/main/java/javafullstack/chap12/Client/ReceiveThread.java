package javafullstack.chap12.Client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * packageName : javafullstack.chap12.Client
 * fileName : RecieveThread
 * author : hyuk
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class ReceiveThread extends Thread {

    private final Socket socket;
    private String receiveString;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    //    쓰레드 실행 함수
    @Override
    public void run() {
        try {
//            long, int, boolean 등 기본문자열로 네트웍 전송 받기
            DataInputStream tmpbuf = new DataInputStream(socket.getInputStream());
            while (true) {
//                읽은 스트림을 문자열로 저장
                receiveString = tmpbuf.readUTF();
                if (receiveString == null) {
                    System.out.println("상대방 연결이 종료되었습니다.");
                } else {
                    System.out.println("상대방 : " + receiveString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
