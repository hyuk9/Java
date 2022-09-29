package javafullstack.chap06.sec05.exam06;

/**
 * packageName : javafullstack.chap06.sec05.exam06
 * fileName : Earth
 * author : hyuk
 * date : 2022/09/28
 * description : 공유 상수(static final)
 * 💡명명규칙 : 대문자💡
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */

public class Earth {
//    지구의 반지름
    static final double EARTH_RADIUS = 6400;

//    지구의 표면적
    static final double EARTH_AREA = 4*Math.PI*EARTH_RADIUS;
}
