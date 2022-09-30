package javafullstack.chap07.sec01.exam04;

/**
 * packageName : javafullstack.chap07.exam01.sec01.exam04
 * fileName : AirplaneApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class SuperSonicAirplane extends Airplane{
//    공유 상수 : 무조건 값을 바로 지정
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

//    속성
    public int flyMode = NORMAL;

//    함수 재정의 fly()
    @Override
    public void fly() {
        if (flyMode ==  SUPERSONIC){
            System.out.println("초음속 비행합니다");
        }else {
            super.fly(); // 부모 클래스의 함수 호출("일반비행합니다" 출력)
        }
    }

}
