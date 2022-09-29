package javafullstack.chap07.sec01.exam04;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam04
 * fileName : Airplane
 * author : hyuk
 * date : 2022/09/29
 * description : 부모클래스의 함수 호출(super.함수())
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Airplane {
//    착륙 함수
    public void land(){
        System.out.println("착륙합니다");
    }
//    비행기 이륙함수
    public void takeOff(){
        System.out.println("이륙합니다");
    }

//    비행 함수
    public void fly(){
        System.out.println("일반비행합니다");
    }
}
