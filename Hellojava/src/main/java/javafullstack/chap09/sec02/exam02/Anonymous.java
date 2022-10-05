package javafullstack.chap09.sec02.exam02;

/**
 * packageName : javafullstack.chap09.sec02.exam02
 * fileName : Anonymous
 * author : hyuk
 * date : 2022/10/04
 * description : 인터페이스를 이용한 익명(==무명) 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Anonymous {

    // ✅ 속성
//    💡 익명 객체 사용법 💡
//    인터페이스명 인터페이스변수 = new 인터페이스() {자식(구현)클래스}
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다");
        }
    };

    // ✅ 함수 내 지역변수에 익명 객체 사용
    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다");
            }
        };
        localVar.turnOn(); // 익명객체의 함수 실행
    }
//    2nd 함수
    void method2(RemoteControl remoteControl){
        remoteControl.turnOn();
    }
}
