package javafullstack.chap14.sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * packageName : javafullstack.chap14.sec01.exam04
 * fileName : ReadApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("src/main/resources/test1.db");

        while (true){
//            ➡️ .read() : 1byte 읽기
            int data = inputStream.read(); // read() 리턴값은 byte가 아닌 정수값(int) 👉4byte를 다 쓰는게 아닌 1byte만 사용
//            ➡️ 파일의 끝에 도달하면 : -1
            if (data == -1) break;
//             ➡️ 읽은 내용 화면 출력
            System.out.println(data);
        }
//         ➡️ 파일 닫기
        inputStream.close();
    }
}
