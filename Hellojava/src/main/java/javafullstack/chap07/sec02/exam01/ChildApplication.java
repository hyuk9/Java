package javafullstack.chap07.sec02.exam01;

/**
 * packageName : javafullstack.chap07.sec02.exam01
 * fileName : ChildApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
// 다형성(상속관계) : 사용 방법은 동일하지만 다양한 객체를 이용해서 다양한 실행결과가 나오도록 하는 것
//    자동형변환 : 부모객체 => 자식객체
//    부모객체.함수(); => 재정의한 함수가 자식객체 있을 경우 재정의한 함수가 호출됨
//    다형성의 장점 :
//    ex) 자동차가 타이어를 끼워넣는 방법은 일정하지만 금호타이어, 고급타이어 등 넣느냐에 따라서 주행속도가 달라짐

//    다형성을 구현 : 함수 재정의 + 자동형변환(타입변환)

public class ChildApplication {
    public static void main(String[] args) {
//        자식 클래스 객체 생성
        Child child = new Child();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

//        다형성
//        자동형변환 : 부모객체 = 자식객체 ‼️상속관계일 경우만 가능‼️
        Parents parents = child3; // 연산자 byte => int와 비슷

        parents.method1(); // 부모함수호출
        parents.method2(); // 재정의한 자식함수호출
    }
}
