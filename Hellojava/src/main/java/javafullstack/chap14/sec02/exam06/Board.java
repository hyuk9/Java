package javafullstack.chap14.sec02.exam06;

import java.io.Serializable;
import java.util.Date;

/**
 * packageName : javafullstack.chap14.sec02.exam06
 * fileName : Board
 * author : hyuk
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
// 모델(Model) : 순수객체, 속성, 생성자, Setter/Getter, 그 외에 로직을 구하는 함수는 없음
//    목적 : 데이터 저장용/검색용
//    Service : 업무가 들어가 있는 클래스(객체)
//    Controller : 여러 화면(View)을 조작(컨트롤)하는 클래스
//    MVC 디자인 패턴 : M(Model) / V(View) / C(Controller)
public class Board implements Serializable {
//    속성
//    게시판 번호
    private int bno;
//    제목
    private String title;
//    내용
    private String contents;
//    작성자
    private String writer;
//    날짜
    private Date date;

    public Board(int bno, String title, String contents, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.date = date;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
