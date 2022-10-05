package javafullstack.chap11.sec01.exam12;

/**
 * packageName : javafullstack.chap11.sec01.exam12
 * fileName : StringCharAtApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 문자열 중에 한문자를 가져오기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class StringCharAtApplication {
    public static void main(String[] args) {
//        주민번호
        String ssn = "010624-123012";

//        문자열.charAt(인덱스번호) : 인덱스 번호에 해당하는 한문자를 가져오는 함수
        char gender = ssn.charAt(7); // '1' 문자 들어감

        switch (gender){
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다");
                break;
        }
    }
}
