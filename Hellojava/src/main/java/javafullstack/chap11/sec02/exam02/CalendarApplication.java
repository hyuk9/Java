package javafullstack.chap11.sec02.exam02;

import java.util.Calendar;

/**
 * packageName : javafullstack.chap11.sec02.exam02
 * fileName : CalendarApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Calendar 달력 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class CalendarApplication {
    public static void main(String[] args) {
//        객체 생성 : new 생성자()
        Calendar now = Calendar.getInstance(); // 싱글톤(디자인패턴), 공유객체

//        달력 정보들
//        사용법 : 날짜객체.get(날짜상수들) // 현재 날짜 시간 정보 보기
        int year = now.get(Calendar.YEAR); // 년
        int month = now.get(Calendar.MONTH)+1; // 월
        int week = now.get(Calendar.DAY_OF_WEEK); // 요일
        int day = now.get(Calendar.DAY_OF_MONTH); // 일

        System.out.println(year+"년");
        System.out.println(month+"월");
        System.out.println(week+"요일"); // 1(일) 2(월) 3(화) 4(수) 5(목) 6(금) 7(토)
        System.out.println(day+"일");

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(hour+"시");
        System.out.println(minute+"분");
        System.out.println(second+"초");


    }
}
