package javafullstack.chap14.sec01.exam11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * packageName : javafullstack.chap14.sec01.exam11
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 한 문자씩 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws IOException {
//        ➡️ 파일 읽기용(입력용)으로 열기
        Reader reader = new FileReader("src/main/resources/text7.txt");

//        ➡️ loop 돌리면서 한문자씩 읽기
        while (true){
//            ➡️ 한문자씩 읽기(아스키코드)
            int data = reader.read();
//            ➡️ 파일의 끝 : -1
            if (data == -1) break;
            System.out.println((char) data); // 아스키코드 👉 문자
        }
//        ➡️ 파일 닫기
        reader.close();
    }
}
