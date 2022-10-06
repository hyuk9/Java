package javafullstack.chap12.Client;

import javafullstack.chap12.chatting.server.RecieveThread;
import javafullstack.chap12.chatting.server.SendThread;

import java.io.IOException;
import java.net.Socket;

/**
 * packageName : javafullstack.chap12.Client
 * fileName : SocketClient
 * author : hyuk
 * date : 2022/10/06
 * description : 클라이언트 채팅 실행 프로그램
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
//        ➡️ 서버쪽과 연결할 소켓 객체 생성 : ip (localhost), port(8888)
        Socket socket = new Socket("localhost", 8888); // 서버 있으면 바로 연결됨
        System.out.println("서버와 접속되었습니다");

//        Receiver, Send 쓰레드 각각 시작
        RecieveThread recieveThread = new RecieveThread(socket);
        recieveThread.start();

        SendThread sendThread = new SendThread(socket);
        sendThread.start();
    }
}
