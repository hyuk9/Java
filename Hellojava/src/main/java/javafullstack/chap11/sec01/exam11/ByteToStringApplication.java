package javafullstack.chap11.sec01.exam11;

/**
 * packageName : javafullstack.chap11.sec01.exam11
 * fileName : ByteToStringApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Byte 배열 👉 String 배열로 변환하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

//        byte 배열을 문자열로 변환하기
//        String 생성자의 매개변수 = byte[] 배열
        String str1 = new String(bytes);
        System.out.println(str1);

//        참고) 인덱스 위치부터 length만큼만 잘라서 보여주기
//        사용법 : String(byte배열, 시작 인덱스 위치, 자를개수)
        String str2 = new String(bytes, 6, 4);
        System.out.println(str2);
    }
}
