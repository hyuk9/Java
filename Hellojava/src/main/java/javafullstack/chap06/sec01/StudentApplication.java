package javafullstack.chap06.sec01;

/**
 * packageName : chap06
 * fileName : StudentApplication
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args){
//        객체 생성해서 출력
//        객체변수 : student를 여러개를 만들 수 있음
        Student student = new Student();
        student.myPrint();
        Student student2 = new Student();
        student.myPrint();
        Student student3 = new Student();
        student.myPrint();
    }
}
