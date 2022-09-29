package javafullstack.chap07.sec01.exam02;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam02
 * fileName : PeopleApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "1234567-12345678", 1);
        System.out.println("name : " + student.name); // 부모속성 name
        System.out.println("ssn : " + student.ssn); // 부모속성 ssn
        System.out.println("studentNo : " + student.studentNo); // 본인속성 ssn
    }
}
