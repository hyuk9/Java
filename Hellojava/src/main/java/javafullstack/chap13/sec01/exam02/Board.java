package javafullstack.chap13.sec01.exam02;

/**
 * packageName : javafullstack.chap13.sec01.exam02
 * fileName : Board
 * author : hyuk
 * date : 2022/10/05
 * description : Board 객체를 저장하는 Vector
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
// Vector : 멀티쓰레드 환경(프로그래밍) 사용하는 자료구조, ArrayList 거의 유사
//          동기화 맞추기 : Vector 동기화가 구현되어 있음 (Synchronized)
public class Board {
    String subject;
    String content;
    String writer;

//    자동으로 생성자 만들기 : 속성의 초기값 지정
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
