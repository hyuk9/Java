package javafullstack.chap12.chatting.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

/**
 * packageName : javafullstack.chap12.chatting.server
 * fileName : RecieveThread
 * author : hyuk
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class RecieveThread extends Thread {
//    네트워크 통신 소켓 속성

    public final Socket socket; // 상수(값 설정

//     생성자
    public RecieveThread(Socket socket) {
        this.socket = socket;
    }

//    run()함수 작성
    @Override
    public void run() {
        try {
//            네트워크 기본 1Byte 통신 👉 기본 데이터형 사용할 수 있게하는 객체 사용
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String receiveString;
            while (true){
                receiveString = dataInputStream.readUTF(); // 네트워크 전송 데이터 받기
                System.out.println("상대방 : " + receiveString);
            }

        } catch (SocketException e1) {
            System.out.println("상대방 연결이 종료되었습니다.");
        } catch (IOException e2){
            e2.printStackTrace(); // 에러코드 및 에러메시지 화면 출력
        }
    }
}
