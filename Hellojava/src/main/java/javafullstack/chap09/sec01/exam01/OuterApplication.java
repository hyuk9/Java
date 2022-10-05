package javafullstack.chap09.sec01.exam01;

/**
 * packageName : javafullstack.chap09.sec01.exam01
 * fileName : OuterApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 중첩 클래스의 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class OuterApplication {
    public static void main(String[] args) {
//        제일 바깥쪽의 클래스 객체 생성
        Outer outer = new Outer();

//      ✅ 일반(속성, 인스턴스멤버) 중첩 클래스 생성 👉 어렵다‼️
        Outer.Attr attr = outer.new Attr();
//        일반 중첩 클래스의 속성 접근
        attr.field1 = 3;
//        일반 중첩 클래스의 함수 접근
        attr.method1();

//      ✅ 공유 중첩 클래스의 객체 생성
//        Outer 객체 필요없음 👉 이미 공유 클래스로 지정해놨기 때문
        Outer.Share share = new Outer.Share();
//        공유 중첩 클래스의 일반 속성 접근
        share.field1 = 3;
        share.method1();

//        공유 중첩 클래스의 공유 속성 접근
        Outer.Share.field2 = 3;
        Outer.Share.method2();

//      ✅ 로컬(지역) 클래스의 객체 생성을 위한 함수 호출
        outer.method();

    }
}
