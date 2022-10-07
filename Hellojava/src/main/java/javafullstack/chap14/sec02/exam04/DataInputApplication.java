package javafullstack.chap14.sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * packageName : javafullstack.chap14.sec02.exam04
 * fileName : DataInputApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 기본 자료형(타입)으로 입출력하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class DataInputApplication {
    public static void main(String[] args) throws Exception{
//        byte 단위 파일 쓰기용으로 열기
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/primitive.txt");

//        보조스트림 사용 : 기본 자료형을 사용할 수 있게 함
//        기본스트림 + 보조기능 추가(기본자료형 사용)
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

//        버퍼에 쓰기
        dataOutputStream.writeUTF("홍길동");
        dataOutputStream.writeDouble(95.4);
        dataOutputStream.writeInt(1);

        dataOutputStream.writeUTF("김자바");
        dataOutputStream.writeDouble(90.3);
        dataOutputStream.writeInt(1);

//        버퍼 👉 파일 쓰기
        dataOutputStream.flush();
        dataOutputStream.close(); // 파일 닫기

//        ===================================== 파일 읽기
//        파일에 쓴 자료형 순서를 맞추어서 읽어야 함 : 자료형마다 byte 크기가 틀림
//        파일을 읽기용으로 열기(byte 단위)
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/primitive.txt");
//        보조스트림 : 파일 읽기용 데이터 기본자료형 객체
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

//        주의점 : 출력순서 : 문자열 👉 double 👉 int : 문자열 👉 double 👉 int
        for (int i = 0; i < 2; i++) {
            String name = dataInputStream.readUTF(); // 파일에서 문자열로 읽기
            double score = dataInputStream.readDouble(); // 파일에서 실수로 읽기
            int order = dataInputStream.readInt(); // 파일에서 정수 읽기
            System.out.println(name + " : " + score + " : " + order);
        }

//        파일 닫기
        dataInputStream.close();
        dataOutputStream.close();
    }
}
