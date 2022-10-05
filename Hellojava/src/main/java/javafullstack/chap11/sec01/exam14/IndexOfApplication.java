package javafullstack.chap11.sec01.exam14;

/**
 * packageName : javafullstack.chap11.sec01.exam14
 * fileName : IndexOfApplication
 * author : hyuk
 * date : 2022/10/05
 * description : String 객체 함수 - IndexOF()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class IndexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

//        indexOf(문자열) : 매개변수값으로 주어진 문자열이 시작되는 인덱스를 리턴하는 함수
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);

//        문자열이 없으면 -1 리턴
        if (subject.indexOf("자바") != -1){
            System.out.println("자바와 관련된 책이군요");
        }else {
            System.out.println("자바와 관련이 없군요");
        }


    }
}
