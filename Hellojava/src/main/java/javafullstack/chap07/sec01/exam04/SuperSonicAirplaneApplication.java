package javafullstack.chap07.sec01.exam04;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam04
 * fileName : SuperSonicAirplaneApplication
 * author : hyuk
 * date : 2022/09/29
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class SuperSonicAirplaneApplication {
    public static void main(String[] args) {
//        자식 객체 만들기
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();

//        비행기 이륙
        superSonicAirplane.takeOff(); // 부모 이륙함수
        superSonicAirplane.fly(); // 부모 비행함수
//        공유상수 호출 : 클래스명.공유상수명
//        비행모드 : 초음속 변경
        superSonicAirplane.flyMode = SuperSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.land(); // 부모 착륙함수

    }
}
