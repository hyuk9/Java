package javafullstack.chap14.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : javafullstack.chap14.sec01.exam02
 * fileName : WriteApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 1byte(배열이용하기) 파일 출력
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) throws Exception{
//        파일을 쓰기용(출력용)으로 열기
        OutputStream outputStream = new FileOutputStream("src/main/resources/test3.txt");
//        byte 배열
        byte[] array = {10, 20, 30, 40, 50};

//        배열의 데이터를 버퍼에 쓰기
//        배열의 시작인덱스부터 1byte개수만큼 버퍼에 쓰기
        outputStream.write(array, 1, 3); // 20, 30, 40

//        버퍼 내용 👉 파일 쓰기
        outputStream.flush();
//        파일 닫기
        outputStream.close();
    }
}
