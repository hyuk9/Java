package javafullstack.chap11.sec01.exam03;

/**
 * packageName : javafullstack.chap11.sec01.exam03
 * fileName : SmartPhoneApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("google", "android");

//        .toString() 함수 : 객체를 문자열로 변환하는 함수
//        출력 : 패키지명 + 클래스명 + @16진수해시코드
//        개발자가 기대하는 출력 : 속성의 값들을 보고 싶다
        System.out.println(smartPhone.toString());
    }
}
