package javafullstack.chap14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * packageName : javafullstack.chap14.sec01.exam01
 * fileName : WriteApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 1Byte씩 출력하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
//  ✅ 자바 기본 입출력 객체 : InputStream(1Byte용 입력용, 읽기용), OutputStream(1Byte용 출력용, 쓰기용)
//                      Reader(char 문자기반 입력용), Writer(char 문자기반 출력용), 최상위 클래스 (추상 클래스)
//    ✅ 자식 클래스(byte용) : XXXInputStream, XXXOutputSteam
//    ✅ 자식 클래스(char용) : XXXReader, XXXWriter
//    ✅ InputStream/OutputStream(byte기반 입출력 클래스) : 멀티미디어(이미지, 동영상 등) 위한 용도
//    ✅ Reader/Writer(char기반 입출력 클래스) : 주로 텍스트 파일 등
//    ✅ 자바 입출력 객체 : 디자인패턴 적용(데코레이션(장식) 패턴)
public class WriteApplication {
    public static void main(String[] args) throws Exception{
//        ➡️ 파일 출력용(쓰기용) 객체 생성(파일 열기)
//                                  ✅ new FileOutputStream(경로+파일이름);
//        Gradle 프로젝트 루트(/)경로 : build.gradle 파일 있는 위치
        OutputStream outputStream = new FileOutputStream("src/main/resources/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

//        ➡️ 파일에 쓰기 : 먼저 버퍼에 쓰고 버퍼(메모리, 배열)가 다 차면 파일에 씀
//        ➡️ 버퍼(buffer) : 메모리의 임시공간(입출력/네트워크 속도 향상을 위해 사용)
//       .write(byte값) : 파일버퍼(네트워크)에 쓰는 함수
        outputStream.write(a);
        outputStream.write(b);
        outputStream.write(c);

//        ➡️ .flush() 함수 : 버퍼에 있는 문자를 파일에 쓰기
        outputStream.flush();
//        ➡️ 파일 사용 끝나면 닫기
        outputStream.close();
    }
}
