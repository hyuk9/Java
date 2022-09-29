package javafullstack.chap07.sec01.exam03;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam03
 * fileName : Calculator
 * author : hyuk
 * date : 2022/09/29
 * description : 함수 오버라이딩(재정의)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Calculator {
//    매개변수값(반지름)을 전달받아 원의 넓이를 구하는 함수
    double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle() 함수 실행");
        return 3.14*r*r;
    }
}
