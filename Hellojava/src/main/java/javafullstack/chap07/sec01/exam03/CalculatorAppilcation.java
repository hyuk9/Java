package javafullstack.chap07.sec01.exam03;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam03
 * fileName : CalculatorAppilcation
 * author : hyuk
 * date : 2022/09/29
 * description : 실행 클래스(main())
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class CalculatorAppilcation {
    public static void main(String[] args) {
//        부모객체 생성
        Calculator calculator = new Calculator();
//        반지름 지정
        int r = 10;

//        calculator = 부모함수
        System.out.println("원면적 : " + calculator.areaCircle(r));

//        자식객체 생성
        Computer computer = new Computer();
//        원의 면적 출력 (재정의된 함수가 실행됨(자식의 함수))
//        computer = 자식함수
        System.out.println("원면적 : " + computer.areaCircle(r));

    }
}
