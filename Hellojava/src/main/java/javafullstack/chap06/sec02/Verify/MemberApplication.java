package javafullstack.chap06.sec02.Verify;

/**
 * packageName : chap06.sec02.Verify
 * fileName : Verify06
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("⭐MemberApplicationn️⭐️");
        System.out.println("--------------------");
//        Member객체 생성하고 속성에 아래의 값으로 저장한 후 출력
        Member member = new Member();
        member.name = "최하얀";
        member.id = "23";

        System.out.println("이름 : " + member.name);
        System.out.println("id : " + member.id);
    }
}
