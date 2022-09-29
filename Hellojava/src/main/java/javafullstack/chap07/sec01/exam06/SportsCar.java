package javafullstack.chap07.sec01.exam06;

/**
 * packageName : javafullstack.chap07.sec01.exam06
 * fileName : SportCar
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class SportsCar extends Car{
    @Override
    public void speedUP() {
        speed += 10;
    }

//    final 붙은 부모 함수는 재정의 할 수 없음 : stop()
}
