package javafullstack.chap13.sec02.exam02;

/**
 * packageName : javafullstack.chap13.sec02.exam02
 * fileName : Message
 * author : hyuk
 * date : 2022/10/06
 * description : Message 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
//    ✅ 큐(Queue) : 인터페이스, 구현클래스(LinkedList 사용)
//                  👉 FIFO(First In First Out)
//                  ➡️ 큐의 함수들 : 1) .offer(객체) : 주어진 객체를 큐에 넣는 함수
//                                2) .peek() : 맨 앞에 있는 객체의 정보를 조회하는 함수. 객체를 삭제하지 않음
//                                3) .poll() : 맨 앞에 있는 객체를 꺼냄, 큐에서 객체를 삭제함
public class Message {
//    ✅ 속성
    public String command;
    public String to;

//    ✅ 생성자
    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
