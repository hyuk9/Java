package javafullstack.chap14.sec01.exam12;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * packageName : javafullstack.chap14.sec01.exam12
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 배열의 길이만큼 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws IOException {
//        ➡️ 파일 읽기용으로 열기(문자기반)
        Reader reader = new FileReader("src/main/resources/text8.txt");

//        ➡️ 배열 정의
        char[] buffer = new char[100];

//        ➡️ loop 돌리면서 파일에서 글자 읽기
        while (true){
//            ➡️ 배열 크기만큼 읽기
//            ➡️ 파일을 읽어서 배열에(buffer) 저장 : 100문자 -> 배열에 저장
            int readCharNum = reader.read(buffer);
            if (readCharNum == -1) break; // 파일의 끝 : -1
//            ➡️ 읽은 내용을 화면에 출력하기
            for (int i = 0; i < readCharNum; i++) {
//                 ➡️ buffer 내용을 화면에 출력
                System.out.println(buffer[i]);
            }
        }
//         ➡️ 파일 닫기
        reader.close();
    }
}