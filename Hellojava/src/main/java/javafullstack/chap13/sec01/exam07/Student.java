package javafullstack.chap13.sec01.exam07;

/**
 * packageName : javafullstack.chap13.sec01.exam07
 * fileName : Student
 * author : hyuk
 * date : 2022/10/05
 * description : 학생 클래스
 *              ✅ Model(순수한 객체 : 정보저장을 목적으로 만듦) / 업무로직 저장한 클래스( Service )
 *              ====================================================================
 *              ✅ 화면을 모바일 / 웹브라우저 등 상황에 맞게 돌려주는 클래스 ( Controller )
 *              ✅ 화면에 표시만 할 클래스 : ( View ) 👉 스프링
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class Student {
    public int sno; // 학번
    public String name; // 이름

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

//    hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + sno;
    }

//    equals 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student student = (Student) obj;
            return this.name.equals(student.name) && (this.sno == student.sno);
        }else {
            return false;
        }
    }
}
