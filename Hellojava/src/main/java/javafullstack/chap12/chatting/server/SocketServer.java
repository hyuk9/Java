package javafullstack.chap12.chatting.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * packageName : javafullstack.chap12.chatting.server
 * fileName : SocketServer
 * author : hyuk
 * date : 2022/10/06
 * description : 채팅 서버 프로그램
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 8888;

//        ➡️ 서버 소켓 만들기 : 매개변수 (포트 : 8888)
        ServerSocket serverSocket = new ServerSocket(port);

        while (true){
//            ➡️ 클라이언트의 소켓 포트정보가 서버와 일치하면 요청을 받아들이는 함수 호출
            Socket socket = serverSocket.accept(); // 서버 대기중
//            socket.getInetAddress() : 현재 연결된 소켓의 ip정보 (4자리 숫자)
//            IP : xxx.xxx.xxx.xxx
//            💡참고 : localhost == 127.0.0.1 (내 컴퓨터 IP)
            System.out.println("ip : " + socket.getInetAddress() + "와 연결되었습니다.");
//            받기(Reciever) 쓰레드 시작
            RecieveThread recieveThread = new RecieveThread(socket);
            recieveThread.start(); // run() 실행
            SendThread sendThread = new SendThread(socket);
            sendThread.start(); // run() 실행
        }
    }
}
