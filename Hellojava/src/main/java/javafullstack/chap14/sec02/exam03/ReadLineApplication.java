package javafullstack.chap14.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * packageName : javafullstack.chap14.sec02.exam03
 * fileName : ReadLineApplication
 * author : hyuk
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */


//‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️
public class ReadLineApplication {
    public static void main(String[] args) throws IOException {
//        문자기반(char) 파일 읽기용으로 열기
        Reader reader = new FileReader("src/main/resources/language.txt");

//        보조스트림 : 버퍼가 있는 읽기
//        사용법 : new 보조스트림(기본스트림)
        BufferedReader bufferedReader = new BufferedReader(reader);

//        BufferedReader 클래스의 특징 : 한라인씩 읽기
        while (true){
            String data = bufferedReader.readLine(); // 파일을 한라인씩 읽기
//            파일의 끝 : null
            if (data == null) break; // 파일의 끝라인
        }

    }
}
