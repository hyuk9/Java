package javafullstack.chap08.sec02.exam06;

/**
 * packageName : javafullstack.chap08.sec02.exam06
 * fileName : Calc
 * author : hyuk
 * date : 2022/09/30
 * description :
 * 💡========================= 요약 =========================💡
 *      ✅ 자동 타입 변환 : 구현 객체가(자식클래스) 인터페이스(부모) 변수에 대입되는 것
 *      ✅ 다형성 : 상속은 같은 종류의 하위 클래스를 만드는 기술
 *      ✅ 인터페이스 : 사용 방법이 같은(함수의 선언이 같음) 클래스를 만드는 기술
 *      ✅ 강제 타입 변환 : 인터페이스에 저장된 구현 객체(자식클래스)를 다시 구현 클래스(자식클래스)로 변환하는것(원복)
 *      ✅ instanceof : 강제 타입 변환을 하기 전에 변환 가능한지 조사할 때 사용하는 연산자
 *                    👉 인터페이스(부모) 안에 구현객체(자식 클래스)가 있는지 조사할 때 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public interface Calc {
    int ERORR = -999999999;

    int add(int num1, int num2); // 덧셈
    int substract(int num1, int num2); //뺄셈
    int times(int num1, int num2); // 곱셈
    int divide(int num1, int num2); // 나눗셈
}
