package javafullstack.chap14.sec01.exam13;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * packageName : javafullstack.chap14.sec01.exam13
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 배열을 지정한 길이만큼 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("src/main/resources/text9.txt");

//        배열 정의
        char[] buffer = new char[5];

//        파일에서 읽은 문자를 배열에 쓰기 : 2nd 인덱스부터 글자 3개 쓰기
        int readCharNum = reader.read(buffer, 2, 3);

//        파일의 끝이 아니라면 화면에 출력하기
        if (readCharNum != -1){
            for (int i = 0; i < buffer.length; i++) {
//            buffer 내용을 화면에 출력
                System.out.println(buffer[i]);
            }
        }
//        파일 닫기
        reader.close();
    }
}
