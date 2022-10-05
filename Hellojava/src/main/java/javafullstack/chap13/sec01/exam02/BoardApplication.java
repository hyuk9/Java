package javafullstack.chap13.sec01.exam02;

import java.util.List;
import java.util.Vector;

/**
 * packageName : javafullstack.chap13.sec01.exam02
 * fileName : BoardApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
//        다형성
        List<Board> list = new Vector<>();


//        .add(), .get(), .remove()
        list.add(new Board("제목1","내용1", "글쓴이1"));
        list.add(new Board("제목2","내용2", "글쓴이2"));
        list.add(new Board("제목3","내용3", "글쓴이3"));
        list.add(new Board("제목4","내용4", "글쓴이4"));
        list.add(new Board("제목5","내용5", "글쓴이5"));

//        삭제
        list.remove(2); // 2번 삭제후 당겨짐
        list.remove(3);

//        개선된 배열의 내용 출력
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i); // 인덱스번호에 해당하는 자료 조회
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
    }
}
