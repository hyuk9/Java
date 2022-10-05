package javafullstack.chap09.sec01.exam03;

/**
 * packageName : javafullstack.chap09.sec01.exam03
 * fileName : Outer
 * author : hyuk
 * date : 2022/10/04
 * description : 일반 중첩 클래스의 사용 제한
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Outer {
    int field1; // 일반 속성

    void method1() {
    } // 일반 함수

    static int field2; // 공유 속성

    static void method2() {
    } // 공유 함수

    //    일반 중첩 클래스 👉 가져와서 쓰는 것 전부 다 가능
    class Attr {
        void method() {
            field1 = 10; // 가능
            method1(); // 가능
//        바깥쪽 클래스의 공유 속성/함수
            field2 = 10; // 가능
            method2(); // 가능
        }
    }

    //    공유 중첩 클래스 👉 바깥쪽 클래스의 공유 속성/함수만 사용가능
    static class Share {
        void method() {
//            field1 = 10; // 불가능
//            method1(); // 불가능
//        바깥쪽 클래스의 공유 속성/함수
            field2 = 10; // 가능
            method2(); // 가능
        }
    }


}
