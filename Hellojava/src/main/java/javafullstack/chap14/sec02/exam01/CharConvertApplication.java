package javafullstack.chap14.sec02.exam01;

import java.io.*;

/**
 * packageName : javafullstack.chap14.sec02
 * fileName : CharConvertApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 보조스트림( 문자 변환 보조 스트림 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
//    ✅ 자바 입출력객체 : 데코레이션(장식) 패턴
//                  👉 A기본 기능 + aa보조기능 + bb보조기능
//    ✅ 보조 스트림 : 다른 기본 스트림과 연결해서 여러가지 편리한 기능을 제공하는 객체
//                  👉 자체적으로 입출력을 할 수는 없음
public class CharConvertApplication {
//    ➡️ 파일 쓰기용 공유 함수
    public static void write(String str) throws Exception{
//        ➡️ 기본 스트림 : 파일을 쓰기용으로 열기
        FileOutputStream fos = new FileOutputStream("src/main/resources/test1.db");

//        1byte로 쓰기용 문자단위(String)로 파일에 쓰고 싶음 👉 보조스트림 : OutputStreamWriter ‼️보조스트림 단독으로는 사용 못함‼️
//        ✅ 사용법 : 기본문자단위스트림 변수 = new 보조스트림(파일스트림변수)
//        데코레이션 패턴(decoration pattern) 사용
        Writer writer = new OutputStreamWriter(fos); // FileOutputStream 객체 + OutputStreamWriter

//        ➡️ 문자를 버퍼에 출력
//        ➡️ 매개변수 무자열을 버퍼에 출력
        writer.write(str);
//        ➡️ 버퍼에 출력 👉 파일에 출력
        writer.flush();
//        ➡️ 파일 닫기
        writer.close();
    }

//    ➡️ 읽기 공유 함수
    public static String read() throws Exception{
//        ➡️ 파일을 읽기용으로 열기
        FileInputStream fis = new FileInputStream("src/main/resources/test1.db");
//        ✅️ 보조스트림 기능 더하기 : new 보조스트림(기본스트림)
//        ➡️ 1byte 파일 열기 + 문자단위로 읽기 기능 추가(InputStreamReader)
        Reader reader = new InputStreamReader(fis);

//        ➡️ 배열 만들어서 읽기 : 속도 향상
        char[] buffer = new char[100];
//        ➡️ 100문자 읽기 - buffer 저장
//        ➡️ readCharNum : 읽은 문자 개수
//        ➡️ buffer : 파일의 내용이 저장
        int readCharNum = reader.read(buffer);
//        ➡️ 파일 닫기
        reader.close();

//        ➡️ char[] 👉 String 바꾸기
        String data = new String(buffer, 0, readCharNum); // 👉 여기 이해안됨 ‼️
        return data;
    }
    public static void main(String[] args) throws Exception {
//         ➡️ 공유함수 write()
        write("문자변환스트림을 사용합니다");
//         ➡️ 공유함수 read()
        String data = read();
        System.out.println(data);
    }
}
