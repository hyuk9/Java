package javafullstack.chap11.sec01.exam01;

/**
 * packageName : javafullstack.chap11.sec01.exam01
 * fileName : Member
 * author : hyuk
 * date : 2022/10/04
 * description : 객체를 동등 비교(.equals())
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */

// ✅ 객체가 동등하다는 것은 2개의 속성이 같다라는 뜻
//    String 객체를 제외한 모든 객체는 .equals() 함수를 쓰면 주소(방번호) 비교를 하기 때문에
//    재정의해서 사용해야함
//    String 객체는 .equals() 값 비교가 됨 ( String에서 재정의 되어 있음 : 자바에서 미리 재정의함)
//    Object : 최고 조상(부모) 클래스 ( .equals(), hashCode(), toString() 등)
//   모든 객체는 Object를 자동상속하고 있음(extends 키워드는 생략)
public class Member {
//    속성
    public String id;

    public Member(String id) {
        this.id = id;
    }

//    Object : 객체의 최고 조상(부모) 클래스
//    객체의 .equals 함수 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
//            강제 형변환
            Member member = (Member) obj;
//            속성의 id 값 매개변수값 id를 비교해서 같으면 true
//            틀리면 false
            if (this.id.equals(member.id)){
                return true;
            }
        }
        return false;
    }
}
