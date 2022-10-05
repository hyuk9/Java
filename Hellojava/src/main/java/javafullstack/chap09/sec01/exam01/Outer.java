package javafullstack.chap09.sec01.exam01;

/**
 * packageName : javafullstack.chap09.sec01.exam01
 * fileName : Outer
 * author : hyuk
 * date : 2022/10/04
 * description : 특수 클래스 - 중첩 클래스 (클래스 안에 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Outer {
    //    기본 생성자 : 매개변수 없는 생성자 cmd+n
    public Outer() {
        System.out.println("Outer 객체가 생성됨");
    }


    //   ✅ 속성의 형태 클래스가 있을 수 있음 : 일반 중첩 클래스 (==인스턴스 멤버 클래스)
    public class Attr {
        //        중첩 클래스 생성자
        public Attr() {
            System.out.println("Attr 객체가 생성됨");
        }

        int field1; //  중첩 클래스 속성(==필드==멤버변수==인스턴스 변수)

        //        중첩 클래스 함수
        void method1() {

        }
    }

    //    ✅ 공유 중첩 클래스
    static class Share {
        public Share() {
            System.out.println("Share 객체가 생성됨");
        }

        int field1; // 일반 속성
        static int field2; // 공유 속성

        void method1() {
        } // 일반 함수

        static void method2() {
        } // 공유 함수
    }

    //    ✅ 로컬(지역) 클래스 : Outer 클래스의 일반 함수 👉 거의 안나옴. 안드로이드 개발 때 가끔 사용
    void method() {
//        지역 클래스
        class Local {
            // 지역 중첩 클래스 생성자
            public Local() {
                System.out.println("Local 객체가 생성됨");
            }

            int field1;

            void method1() {

            }
        }
//        지역 중첩 클래스 객체 생성
        Local local = new Local();
        local.field1 = 3; // 지역 중첩 객체의 속성
        local.method1(); // 지역 중첩 객체의 함수
    }
}
