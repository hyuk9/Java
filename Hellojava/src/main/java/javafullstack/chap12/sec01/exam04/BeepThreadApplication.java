package javafullstack.chap12.sec01.exam04;

/**
 * packageName : javafullstack.chap12.sec01.exam02
 * fileName : BeepThreadApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 상속받은 쓰레드 실행하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class BeepThreadApplication {
    public static void main(String[] args) {
//        쓰레드 객체
//        ✅ 다형성 : 부모클래스 객체변수 = new 자식클래스의생성자();
        Thread thread = new BeepThread();
        thread.start(); // run() 함수 실행

//        다른 작업 : 화면에 출력하기
        for (int i = 0; i < 5; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println();
            }
        }
    }
}
