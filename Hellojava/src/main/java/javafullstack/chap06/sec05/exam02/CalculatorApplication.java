package javafullstack.chap06.sec05.exam02;

import javafullstack.chap06.sec05.exam02.Calculator;

/**
 * packageName : javafullstack.chap06.sec05.exam02
 * fileName : CalculatorApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
//        사용법 : 클래스명.함수(), 클래스명.변수
        double result1 = 10*10*Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
