package javafullstack.chap06.sec04.exam01;

/**
 * packageName : javafullstack.chap06.sec04.exam01
 * fileName : CalculaterApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class CalculaterApplication {
    public static void main(String[] args) {
        Calculater calculater = new Calculater();

//        계산기 전원 켜기
//        객체변수.리턴값이없는함수();
        calculater.powerOn();

//        덧셈계산
//        int result = 리턴값이 있는 함수();
        int result1 = calculater.plus(3,4);
        System.out.println("덧셈결과는 : " + result1);

//     💡---------------------- 강사님 풀이 ----------------------💡
        byte x = 10;
        byte y = 4;
//        위에서 변수의 값(byte형)을 넣었지만 byte(1) -> int(4) 자동 형변환
        double result2 = calculater.divide(x, y);
        System.out.println("result2 : " + result2);
//      --------------------------------------------------------

        double dresult = calculater.divide(2, 4);
        System.out.println("나눗셈결과는 : " + result2);


        calculater.powerOff();

    }
}
