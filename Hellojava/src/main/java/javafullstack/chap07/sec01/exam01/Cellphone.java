package javafullstack.chap07.sec01.exam01;

/**
 * packageName : javafullstack.chap07.exam01
 * fileName : Cellphone
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
// ✅현실 세계에서 상속 : 부모로부터 재산(자산)을 물려받는 것
// ✅코딩 : 부모클래스(객체)(속성property, 함수function) => 자식클래스(객체)
// ✅부모클래스(==상위클래스)ㅑ
// ✅자식클래스(==하위클래스, 파생클래스)
// ✅상속의 장점 : 1) 코딩 중복을 제거함 👉 상속은 객체지향언어에만 가능‼️
//              2) 부모클래스의 속성or함수를 수정하면 자식클래스는 자동수정됨 (유지보수성, 코딩생산성 증가)
public class Cellphone {
//    속성
    String model;
    String color;

//    생성자 생략
//    전원 켜기 함수(메소드) : 리턴값이 없음
    void powerOn(){
        System.out.println("전원을 켭니다");
    }

//    전원 끄기 함수 : 리턴값이 없음
    void powerOff(){
        System.out.println("전원을 끕니다");
    }

//    벨 울리는 함수
    void bell(){
        System.out.println("벨이 울립니다");
    }

//    핸드폰 통화하기 기능(함수) : 매개변수 있는 함수
    void sendVoice(String message){
        System.out.println("나 : " + message);
    }

//    핸드폰 받는사람 통화하는 함수
    void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }

//    전화 끊기 함수
    void hangUp(){
        System.out.println("전화를 끊습니다");
    }

}

