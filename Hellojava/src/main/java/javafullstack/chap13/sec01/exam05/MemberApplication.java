package javafullstack.chap13.sec01.exam05;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : javafullstack.chap13.sec01.exam05
 * fileName : MemberApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Member 객체를 중복없이 저장하는 HashSet
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//        <> : 제너릭( 자료형을 제한 )
        Set<Member> set = new HashSet<>();

//        .equals(), .hashCode() 재정의 되었으면 중복 제거가 됨
//        위의 함수 재정의 안하면 중복제거 안됨

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체수 : " + set.size());
    }
}
