package javafullstack.chap13.sec01.verify.exam08;

/**
 * packageName : javafullstack.chap13.sec01.verify.exam08
 * fileName : Student
 * author : hyuk
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum; // 학번
        this.name = name; // 이름
    }

//    함수 재정의 : .equals / .hashCode
//    👉 학번만 return하게 함수 재정의 : 같은 객체로 취급

    @Override
    public int hashCode() {
        return this.studentNum;
    }

//    👉 객체의 최고 조상클래스 : Object

    @Override
    public boolean equals(Object obj) {
//        재정의 로직 구현
        if (obj instanceof Student){
//            강제 형변환
            Student student = (Student) obj;
//            학번만 체크해서 같으면 true 아니면 false
            return (this.studentNum == student.studentNum);
        } else {
            return false;
        }
    }


//    👇 이건 인텔리제이로 자동 작성
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Student student = (Student) obj;
//        return studentNum == student.studentNum;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(studentNum);
//    }
}
