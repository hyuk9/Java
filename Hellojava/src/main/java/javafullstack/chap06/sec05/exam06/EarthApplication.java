package javafullstack.chap06.sec05.exam06;

/**
 * packageName : javafullstack.chap06.sec05.exam06
 * fileName : EarthApplication
 * author : hyuk
 * date : 2022/09/28
 * description : 공유 상수(static final) 테스트
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class EarthApplication {
    public static void main(String[] args) {
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS+"km");
        System.out.println("지구의 반지름 : " + Earth.EARTH_AREA+"km²");
    }
}
