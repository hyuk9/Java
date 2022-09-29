package javafullstack.chap06.sec03.Verify.exam02;

/**
 * packageName : javafullstack.chap06.sec03.Verify.exam02
 * fileName : MemberApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//        1) Mamber객체 생성 name, id속성 외부에서 받은값 초기화

        Member member = new Member("홍길동", "hong");
        System.out.println("name : " + member.name);
        System.out.println("id : " + member.id);
    }

//    2)

}
