package javafullstack.chap14.sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * packageName : javafullstack.chap14.sec01.exam08
 * fileName : WriteApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 배열의 일부를 출력
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("src/main/resources/text10.txt");

//        문자열에 저장
        String str = "ABC";

//        문자열 전체를 버퍼에 출력
        writer.write(str);

//        버퍼의 내용을 파일에 쓰기
        writer.flush();

//        파일 닫기
        writer.close();

    }
}
