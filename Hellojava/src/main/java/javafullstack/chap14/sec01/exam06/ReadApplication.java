package javafullstack.chap14.sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : javafullstack.chap14.sec01.exam04
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 지정된 길이만큼 파일에서 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception{
//         ➡️ 파일 읽기로(입력용) 열기
        InputStream inputStream = new FileInputStream("src/main/resources/test3.txt");

//         ➡️ 읽기용으로 배열 크기 설정
        byte[] buffer = new byte[5];

//        ➡️ 파일 읽기에서 3byte를 읽어서 buffer에 저장(인덱스 2번부터 3개 저장)
            int data = inputStream.read(buffer, 2,3);

            if (data != -1){
//            ➡️ buffer 내용 화면 출력
                for (int i = 0; i < buffer.length; i++) {
                    System.out.println(buffer[i]);
                }
            }
//         ➡️ 파일 닫기
        inputStream.close();
    }
}
