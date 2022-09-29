package javafullstack.chap07.sec01.exam03;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam03
 * fileName : Computer
 * author : hyuk
 * date : 2022/09/29
 * description : 자식 클래스(함수 재정의 (오버라이딩 Overriding))
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Computer extends Calculator {
//    💡 함수 재정의 : 3.14가 마음에 안듦 => pi값 정확성 높이고 싶음
//    Math.PI
//    ✅ 함수 재정의를 하면 자신의 함수가 실행됨 => 부모 함수 무시‼️
//    @Overriding : 1) 오버라이딩(재정의)된 함수임을 표시
//                  2) 부모함수 선언부 == 자식함수 선언부
//                      => ‼️일치하지 않으면 어노테이션 에러 발생(오타 확인)
//                  3) 부모함수 내용 != 자식함수 내용

//    오버라이딩 함수 : cmd+n 함수 재정의 -> 함수 선택
    @Override
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 함수 실행");
        return Math.PI*r*r;
    }
}
