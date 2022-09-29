package javafullstack.chap06.sec04.verify.exam03;

/**
 * packageName : javafullstack.chap06.sec04.verify.exam03
 * fileName : MemberService
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class MemberService {
    boolean login(String id, String pw) {
//        == : 정수, 실수값 등을 비교할 떼 사용
//        .equals() : 문자열 비교시 사용하는 함수
        if (id.equals("hong") && pw.equals("12345")) {
            return true;
        }
        else {
            return false;
        }
    }
    void logout(String id){
        System.out.println(id+"이 로그아웃 되었습니다");
    }
}
