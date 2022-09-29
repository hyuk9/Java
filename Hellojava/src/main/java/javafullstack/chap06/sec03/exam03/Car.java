package javafullstack.chap06.sec03.exam03;

/**
 * packageName : javafullstack.chap06.sec03.exam03
 * fileName : Car
 * author : hyuk
 * date : 2022/09/27
 * description : 생성자 오버로딩
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Car {
//    속성
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
//
////    객체 지향 언어 제공하는 기능 :
////    생성자 오버로딩 : 일반적으로 함수명이 같으면 에러가 발생함
////    단, 매개변수 타입(자료형), 개수가 다르다면 허용함
//
//
////    기본 생성자
//    Car(){
//
//    }
//
////    매개변수 1개짜리 생성자
//    Car(String model2){
//        model = model2;
//    }
//
////    매개변수 2개짜리 생성자
//    Car(String model2, String color2){
//        model = model2;
//        color = color2;
//    }
//
////    매개변수 3개짜리 생성자
//    Car(String model2, String color2, int maxSpeed2){
//        model = model2;
//        color = color2;
//        maxSpeed = maxSpeed2;
//    }

    public Car(String company, String model, String color, int maxSpeed) {
//        this : 객체 자기자신을 의미(Car)
//        this.속성명 = 매개변수명;
//        intellij 자동화 툴 이용 : 생성자 만들기 cmd+n => 생성자 메뉴 선택

//        생성자의 매개변수명 == 속성의 이름 같은 경우 사용
//        this.속성명 = 매개변수명;
//        this : 자기자신 의마하는 객체변수(객체 자기자신 car)
//        클래스 내부에서만 사용가능, 다른 클래스에서는 사용 못함
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

//    기본 생성자 : 자바에서 자동 만들어 주는 대상 (생성자 없는 경우)
//    this() : 생성자를 호출할 수도 있음
//    this() == Car()
//    this("현대자동차") == Car("현대자동차")
//    this("현대자동차", "검정") == Car("현대자동차", "검정")
    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String company, String model) {
//        this.model = model;
//        this.company = company;
//        매개벼수 3개짜리 생성자 함수를 재사용 : 코드 중복 제거
        this(company, model, 0); // 이거는 잘 되는데
//        this(company, model); // 이건 안되는 이유가 머지?‼️
    }

    public Car(String company, String model, int maxSpeed) {
        this.model = model;
        this.company = company;
        this.maxSpeed = maxSpeed;
    }
}


