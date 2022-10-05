package javafullstack.chap11.sec01.exam16;

/**
 * packageName : javafullstack.chap11.sec01.exam16
 * fileName : ReplaceApplication
 * author : hyuk
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class ReplaceApplication {
    public static void main(String[] args) {
//        API : 유용한 함수들의 묶음 (Application Programming Interface)
        String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API도 지원합니다";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(newStr);
    }
}
