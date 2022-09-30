package javafullstack.chap07.verify.exam03;

/**
 * packageName : javafullstack.chap07.verify.exam03
 * fileName : CalculatorApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
// 문제 : Calculator(추상클래스)의 자식 클래스 GoodCalc 구현해서
//       프로그램을 완성하세요.
//    결과
//    5
//    -1
//    3.0
public class CalculatorApplication {
    public static void main(String[] args) {
        GoodCalc goodCalc = new GoodCalc();

        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int[]{2,3,4}));
    }
}





