package javafullstack.chap09.sec02.exam02;

/**
 * packageName : javafullstack.chap09.sec02.exam02
 * fileName : AnonymousApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 실행 클래스 + 매개변수 이용한 익명객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
//        익명 객체 속성 사용
        anonymous.field.turnOn();
//        익명 객체 함수 사용
        anonymous.method1();
//        매개변수값으로 익명객체 전달
        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTv를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTv를 끕니다");
            }
        });
    }
}
