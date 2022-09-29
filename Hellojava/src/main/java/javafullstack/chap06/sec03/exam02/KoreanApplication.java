package javafullstack.chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam01.exam02
 * fileName : KoreanApplication
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class KoreanApplication {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("⭐sec03 exam02 KoreanApplication⭐️");
        System.out.println("--------------------");
//        한국인 객체 생성
//        매개변수 2개짜리 생성자를 이용해서 속성을 초기화
//        초기화 한 결과를 출력
//        결과 : k1.name = 박자바
//              k1.ssn = 011225-1234567
//              k2.name = 김자바
//              k2.ssn = 930525-0654321

        Korean k1 = new Korean("박자바", "011225-1234567");
        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);

    }
}
