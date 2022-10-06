package javafullstack.chap12.sec01.exam07;

/**
 * packageName : javafullstack.chap12.sec01.exam07
 * fileName : CalculatorApplication
 * author : hyuk
 * date : 2022/10/06
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        1st 쓰레드 setMemory
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start(); // run() 함수 실행

//        2nd 쓰레드 setMemory
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start(); // run() 함수 실행
    }
}
