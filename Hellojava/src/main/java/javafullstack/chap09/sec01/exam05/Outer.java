package javafullstack.chap09.sec01.exam05;

/**
 * packageName : javafullstack.chap09.sec01.exam05
 * fileName : Outer
 * author : hyuk
 * date : 2022/10/04
 * description : 중첩 클래스 안에서 바깥쪽 this 참조
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Outer {
    String field = "Outer-field";
    void method(){
        System.out.println("Outer-method");
    }

//    ✅ 일반 중첩 클래스
    class Nested {
        String field = "Nested=field";

        void method(){
            System.out.println("Nested-method");
        }

        void print(){
            System.out.println(this.field); // 중첩 클래스 속성 접근
            this.method(); // 중첩 클래스의 함수 호출

//            바깥쪽 클래스의 속성/함수 접근
            System.out.println(Outer.this.field); // 바깥쪽 클래스의 속성 접근
            Outer.this.method(); // 바깥쪽 클래스의 함수 접근
        }
    }
}
