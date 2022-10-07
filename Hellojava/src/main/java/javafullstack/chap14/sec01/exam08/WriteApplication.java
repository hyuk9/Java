package javafullstack.chap14.sec01.exam08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * packageName : javafullstack.chap14.sec01.exam08
 * fileName : WriteApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 배열 전체를 출력
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/main/resources/text8.txt");

//        배열 정의

        char[] array = {'A', 'B', 'C'};

//        배열을 매개변수로 전달해서 버퍼에 쓰기
        writer.write(array);

//        버퍼의 내용을 파일에 쓰기
        writer.flush();

//        파일 닫기
        writer.close();

    }
}
