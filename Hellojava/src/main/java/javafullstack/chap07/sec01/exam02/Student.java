package javafullstack.chap07.sec01.exam02;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam02
 * fileName : Student
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Student extends People {
    public int studentNo;

//    ✅ 상속관계 : 부모객체 - 자식객체
//    ✅ new 객체를 만들면 생성자를 호출 : 1) 부모생성자 먼저 호출
//                                 2) 자식생성자 나중 실행
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); //super(매개변수값1, 매개변수값2) : 부모의 생성자를 호출하는 함수
        this.studentNo = studentNo; //자기 속성 초기값 지정
    }
}
