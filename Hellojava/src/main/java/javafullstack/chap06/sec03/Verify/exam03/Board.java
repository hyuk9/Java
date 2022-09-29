package javafullstack.chap06.sec03.Verify.exam03;

/**
 * packageName : javafullstack.chap06.sec03.Verify.exam03
 * fileName : Board
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    //    3) Borad 클래스의 생성자가 다음과 같이 오버로딩되어 있습니다. 생성자마다 중복 코딩된 부분이 있습니다.
//       this()를 활용해서 중복 코드를 제거해 보세요.
    Board(String title, String content) {

//        this.title = title;
//        this.content = content;
        this(title, content, null, null, 0);


    }

    Board(String title, String content, String writer) {
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
        this(title, content, writer, null, 0);

    }

    Board(String title, String content, String writer, String date) {
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.date = date;
        this(title, content, writer, date, 0);

    }

    Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }

}
