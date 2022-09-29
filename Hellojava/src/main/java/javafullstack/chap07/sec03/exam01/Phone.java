package javafullstack.chap07.sec03.exam01;

/**
 * packageName : javafullstack.chap07.sec03.exam01
 * fileName : Phone
 * author : hyuk
 * date : 2022/09/29
 * description : 추상 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */

//    ✅ 추상 클래스 만들기 : public abstract class 클래스명{} // abstract 추가
//    ✅ 추상 클래스 객체생성 못함 (new Phone() // 에러발생‼️)
//    ✅ 추상 클래스 : 부모 클래스
//    ✅ 자식 클래스 상속받아 사용
//    💡 목적 💡
//    함수 이름을 통일하고 공통된 속성 이름을 사용할 목적으로 사용
//    ✅ 추상 클래스 : 일반화된 객체들
//      👉ex) 동물(추상클래스) : 벌레, 물고기, 새, ...
public abstract class Phone {
    //    속성
    public String owner;

    //    생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    //    전원 키는 함수
    public void turnOn() {
        System.out.println("휴대폰 전원을 켭니다");
    }

    //    전원 끄는 함수
    public void turnOff() {
        System.out.println("휴대폰 전원을 끕니다");
    }
}
