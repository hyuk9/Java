package javafullstack.chap14.sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : javafullstack.chap14.sec01.exam04
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 배열의 크기만큼 파일에서 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("src/main/resources/test2.db");

//        한번에 크게 읽기용으로 배열 크기 설정
        byte[] buffer = new byte[100];

        while (true){
//            ➡️ 배열의 크기만큼 읽기 : 100byte씩 읽기(읽기 횟수가 줄음) 👉 속도가 향상
//            ➡️ .read(배열) : 파일에서 읽은 데이터를 배열에 쓰기
//            ➡️ return값 : 파일에서 읽은 byte 개수
            int data = inputStream.read(buffer); // read(배열) 리턴값은 byte가 아닌 정수값(int) 👉4byte를 다 쓰는게 아닌 1byte만 사용
//            ➡️ 파일의 끝에 도달하면 : -1
            if (data == -1) break;
//            ➡️ 읽은 바이트 수만큼 화면에 출력
//            ➡️ 읽은 바이트(배열) : data
//            ➡️ 읽은 데이터 : buffer
            for (int i = 0; i < data; i++) {
                System.out.println(buffer[i]);
            }
        }
//         ➡️ 파일 닫기
        inputStream.close();
    }
}
