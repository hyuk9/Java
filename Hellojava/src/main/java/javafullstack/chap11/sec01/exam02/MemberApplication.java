package javafullstack.chap11.sec01.exam02;

/**
 * packageName : javafullstack.chap11.sec01.exam01
 * fileName : MemberApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        Member member = new Member("blue"); // 방번호(주소) 1
        Member member2 = new Member("blue"); // 방번호(주소) 2
        Member member3 = new Member("red");

        if (member.equals(member2)){ // 속성의 값을 비교하는 것이 아닌 객체의 방번호를 비교하기 때문에 다르다고 나옴
            System.out.println("member와 member2는 같습니다");
        }else {
            System.out.println("member와 member2는 다릅니다");
        }
    }
}
