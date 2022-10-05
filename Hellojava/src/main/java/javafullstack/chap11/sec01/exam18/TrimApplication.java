package javafullstack.chap11.sec01.exam18;

/**
 * packageName : javafullstack.chap11.sec01.exam18
 * fileName : TrimApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 문자열 앞/뒤 공백 없애기 함수, .trim()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class TrimApplication {
    public static void main(String[] args) {
//        trim() 앞/뒤 공백만 제거 가능, 문자열 중간 공백은 제거 안됨(ex: "12 34")
        String tel = "  02";
        String tel2 = "123   ";
        String tel3 = "    1234    ";

        String telsum = tel.trim() + tel2.trim() + tel3.trim();

        System.out.println(telsum);

    }
}
