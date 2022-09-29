package javafullstack.chap07.sec03.exam01;

/**
 * packageName : javafullstack.chap07.sec03.exam01
 * fileName : SmartPhoneApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("장동혁");

//        추상 클래스의 함수 호출
        smartPhone.turnOn(); //전원 켜기
        smartPhone.internetSearch(); // 인터넷 검색
        smartPhone.turnOff(); // 전원 끄기
    }
}
