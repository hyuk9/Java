package javafullstack.chap13.sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : javafullstack.chap13.sec01.verify.exam07
 * fileName : BoardDao
 * author : hyuk
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */

public class BoardDao {

    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1", "내용1"));
        list.add(new Board("제목2", "내용2"));
        list.add(new Board("제목3", "내용3"));
        return list;
    }
}
