package javafullstack.chap06.sec03.Verify.exam03;

/**
 * packageName : javafullstack.chap06.sec03.Verify.exam03
 * fileName : BoardApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
        Board board = new Board("제목", "내용");

        System.out.println("제목 : " + board.title);
        System.out.println("내용 : " + board.content);
    }
}
