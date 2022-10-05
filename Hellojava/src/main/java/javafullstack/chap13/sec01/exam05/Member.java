package javafullstack.chap13.sec01.exam05;

/**
 * packageName : javafullstack.chap13.sec01.exam05
 * fileName : Member
 * author : hyuk
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class Member {
//    속성정의
    public String name; // 이름
    public int age; // 나이

//    생성자
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    name과 age값이 같으면 같은 객체라고 .equals() 재정의
//    name과 age값이 같으면 동일한 hashcode() 값이 리턴
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

//    .equal() 재정의
//    name과 age값이 같으면 true리턴 아니면 false리턴
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
            Member member = (Member) obj;
            return this.name.equals(member.name) && (this.age == member.age);
        }else {
            return false;
        }
    }
}
