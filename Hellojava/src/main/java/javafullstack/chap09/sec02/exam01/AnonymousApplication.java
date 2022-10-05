package javafullstack.chap09.sec02.exam01;

/**
 * packageName : javafullstack.chap09.sec02.exam01
 * fileName : PersonApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 실행 클래스 + 매개변수의 익명함수 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

//        익명 객체의 속성 사용
        anonymous.field.wake();

//        익명 객체의 함수 호출
        anonymous.method1(); // 익명객체가 안에서 실행됨

//        매개변수의 익명객체 사용
//        익명객체를 함수의 매개변수값으로 전달
        anonymous.method2(
                new Person() {
                    void study() {
                        System.out.println("공부합니다.");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 일어납니다");
                        study();
                    }
                } // 👉 anonymous.method2의 매개변수
        );
    }
}
