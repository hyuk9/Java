package javafullstack.chap13.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : javafullstack.chap13.sec02.exam02
 * fileName : MessageApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 큐(Queue)를 이용한 메시지 큐 (FIFO : 선입선출)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class MessageApplication {
    public static void main(String[] args) {
//        ➡️ 큐 객체 생성 : 다형성
//        ✅ 부모인터페이스 변수 = new 자식클래스()
        Queue<Message> messageQueue = new LinkedList<>();

//        ➡️ 큐에 자료저장
//        ✅ new Message(명령어, Who)
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));

//        ➡️ 큐에 내용 출력
//        ✅ 큐객체.isEmpty() : 큐안에 자료가 있는지 없는지 확인 함수 (없으면 true, 있으면 false)
        while (!messageQueue.isEmpty()){
//            ➡️ 자료 한개 꺼내기(Message 객체)
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail" :
                case "sendSMS" :
                case "sendKakaotalk" :
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break;
            }
        }
    }
}
