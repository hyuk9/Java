package javafullstack.chap14.sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * packageName : javafullstack.chap14.sec01.exam07
 * fileName : WriteApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 한 문자씩 출력하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws IOException {
//        ➡️ 파일 쓰기용(출력용)으로 열기(문자기반(char) : 2byte)
        Writer writer = new FileWriter("src/main/resources/text7.txt");

        char a = 'A'; // 홑따옴표 한문자 표기하는 자료형
        char b = 'B';
        char c = 'C';

//        ➡️ 한문자씩 버퍼에 출력
        writer.write(a);
        writer.write(b);
        writer.write(c);

//        ➡️ 버퍼에 있는 내용을 실제 파일에 쓰기
        writer.flush();
//        ➡️ 파일 닫기
        writer.close();
    }
}
