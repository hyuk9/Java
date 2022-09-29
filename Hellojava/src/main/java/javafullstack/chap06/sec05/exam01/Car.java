package javafullstack.chap06.sec05.exam01;

/**
 * packageName : javafullstack.chap06.sec05.exam01
 * fileName : Car
 * author : hyuk
 * date : 2022/09/28
 * description : 인스턴스(객체) 멤버와 정적 멤버
 * 💡========================== 요약 =========================💡
 *      객체(==인스턴스)멤버 : 객체 속성(멤버변수), 객체 함수(멤버 메소드)
 *      ✅this : 객체 내부의 자기자신을 의마하는 객체변수, 자신의 클래스 안에서만 사용가능
 *      ✅공유(==정적, 전역) 변수(함수) : 객체를 생성하지 않고 사용가능, 변수(함수)앞에 static 키워드 붙임
 *          사용법 : 클래스명.변수명, 클래스명.함수명()
 *      ✅싱글톤 : 공유 객체
 *      ✅final : 상수 만드는 키워드, 변수의 앞에 붙이면 상수가 됨, 초기값 바로 지정해야함
 *          사용법 : final 변수명 = 초기값
 *      ✅static final : 공유 상수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class Car {
//    this 사용
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

//    this사용하는 함수 : 속성의 값을 저장하는 함수
//    아래 함수를 통칭해서 Setter함수라고 함 => 무조건 매개변수 1개짜리 함수⭐️⭐️⭐️⭐️⭐️
//    void setSpeed(int speed){
////        this.속성 = 매개변수
//        this.speed = speed;
//    }

//    cmd+n 이용 => setter 선택, 자동으로 생성 ⭐️⭐️⭐️⭐️⭐️
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //    run() : 반복문 돌려서 출력
    void run(){
        for(int i=10; i<=50; i+=10){
//            speed = i;
//            this.setSpeed(i);
//            this.함수();
            setSpeed(i);
            System.out.println(this.model + "이(가) " + this.speed+"km/h 속도로 달립니다 ");
        }
    }
}
