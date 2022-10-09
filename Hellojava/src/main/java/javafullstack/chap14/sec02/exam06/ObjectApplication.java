package javafullstack.chap14.sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * packageName : javafullstack.chap14.sec02.exam06
 * fileName : ObjectApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 객체 입출력 보조 스트림 테스트
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class ObjectApplication {
//    객체 쓰기 공유 함수
    public static void writeList() throws Exception{
        List<Board> list = new ArrayList<>(); // List 생성 (ArrayList)

        list.add(new Board(1,"제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2,"제목2", "내용3", "글쓴이2", new Date()));
        list.add(new Board(3,"제목3", "내용3", "글쓴이3", new Date()));

//        기본 스트림(파일)
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/board.txt");

//        보조스트림 사용 : 객체를 파일로 쓸 수 있게 만들어주는 기능
//        주의점 : 직렬화된 객체만 가능 (직렬화기능 상속)
//        직렬화 : 객체를 내부적으로 byte로 변환시켜 주는 기능 (클래스가 Serialazble 상속)

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list); // 버퍼에 쓰기
        objectOutputStream.flush();
        objectOutputStream.close();
    }

//    객체 읽기 공유 함수
    public static List<Board> readList() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/board.txt");
//        보조스트림 : 객체를 파일로 읽을 수 있게 만드는 기능(역직렬화)
//        사용법 : new 보조스트림(기본스트림)
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Board> list = (List<Board>) objectInputStream.readObject(); // 객체로 바꾸기(원복)
        return list;
    }
    public static void main(String[] args) throws Exception{
        writeList(); // 쓰기 공유 함수 객체배열 List 파일에 쓰기
//        파일에 쓴 것을 읽기
        List<Board> list = readList(); // 읽기 공유 함수 (역직렬화)

//        화면에 객체 데이터 출력
//        날짜 포맷 변경
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

//        개선된 for문
        for (Board board : list){
            System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContents() + "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
        }
    }
}
