package javafullstack.chap11.sec01.exam15;

/**
 * packageName : javafullstack.chap11.sec01.exam15
 * fileName : LengthApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 문자열 길이를 반환하는 함수 - Length()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class LengthApplication {
    public static void main(String[] args) {
        String ssn = "7306241230123"; // 주민번호 13자리
        int length = ssn.length(); // 문자열 길이 리턴
        if (length == 13){
            System.out.println("주민번호 자리수가 맞습니다");
        }else {
            System.out.println("주민번호 자리수가 틀립니다");
        }
    }
}
