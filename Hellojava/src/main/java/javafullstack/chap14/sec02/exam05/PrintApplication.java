package javafullstack.chap14.sec02.exam05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * packageName : javafullstack.chap14.sec02.exam05
 * fileName : PrintApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 프린트 보조 스트림
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class PrintApplication {
    public static void main(String[] args) throws IOException {
//        byte 기반 쓰기용으로 파일 열기
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/printstring.txt");

//        보조스트림 사용 : Print 기능 추가(데코레이션 패턴)
        PrintStream printStream = new PrintStream(fileOutputStream);

//        파일에 글자를 쓸 때 아래 함수들을 사용할 수 있음 : println(), print()
//        println() : 줄바꿈, print() : 줄바꿈 없음
        printStream.println("[프린터 보조 스트림]");
        printStream.print("마치");
        printStream.println("프린터가 출력되는 것처럼");
        printStream.println("데이터를 출력합니다");

//        버퍼의 내용을 모두 파일에 쓰고 입출력 스트림 닫기
        printStream.flush();
        printStream.close();
    }
}
