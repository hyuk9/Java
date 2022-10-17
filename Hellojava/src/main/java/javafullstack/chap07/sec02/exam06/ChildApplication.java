package javafullstack.chap07.sec02.exam06;

import javafullstack.chap07.sec02.exam05.Child;
import javafullstack.chap07.sec02.exam05.Parent;

/**
 * packageName : javafullstack.chap07.sec02.exam06
 * fileName : ChildApplication
 * author : hyuk
 * date : 2022/09/29
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class ChildApplication {
//    공유변수
    public static void method1(Parent parent){
//        instanceof : 부모객체 안에 자식객체가 있는지 확인하는 연산자
//        부모객체 instanceof 자식클래스 : 있으면 true, 없으면 false
        if (parent instanceof Child){
//            강제 형변환 : 자식객체로 다시 원복
            Child child = (Child) parent; //parent에 자식객체 있음을 확인 했음
            System.out.println("method1 - 강제형변환 성공");
        }else {
            System.out.println("method1 - 강제형변환 실패");
        }
    }
    public static void main(String[] args) {
//        자동 형변환 : 다형성
        Parent parent = new Child();

        method1(parent); // child 객체가 들어간 부모 객체를 매개변수로 전달함
    }
}
