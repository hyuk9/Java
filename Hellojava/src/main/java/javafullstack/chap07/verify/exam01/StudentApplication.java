package javafullstack.chap07.verify.exam01;

import javafullstack.chap07.verify.HttpServlet;

/**
 * packageName : javafullstack.chap07.verify.exam01
 * fileName : StudentApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.set();

//        아래 출력
        System.out.println("나이 : " + student.age);
        System.out.println("이름 : " + student.name);
        System.out.println("키 : " + student.height);
        System.out.println("몸무게 : " + student.weight);
    }
}
