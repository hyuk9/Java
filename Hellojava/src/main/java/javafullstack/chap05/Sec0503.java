package javafullstack.chap05;

import java.util.Calendar;

/**
 * packageName : chap05
 * fileName : Sec0503
 * author : hyuk
 * date : 2022/09/27
 * description : 열거형
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Sec0503 {
    public void EnumWeek(){
//    에제 : 요일을 체크해서 일요일이면 "일요일에는 축구를 합니다" 출력
//          그외 요일에는 "열심히 자바 공부를 합니다" 출력

//    💡Week 열거형 객체변수 = 상수값
        Week today = null;

//    👉자바에서 제공하는 날짜 객체 가져오기
//    Calendar 객체 new 연산자 사용안함. gerInstance()로 객체 생성함.
        Calendar calendar = Calendar.getInstance();
//    일요일(1) ~ 토요일(7)
//    Calendar.DAY_OF_WEEK : 요일 정보 ex) Calendar.YEAR 등
//    calendar.get(요일정보) : 요일 가져오기(반환값 : 정수)
        int week = calendar.get(Calendar.DAY_OF_WEEK);

//        조건문
        switch (week){
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

//        오늘의 요일 출력
        System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다");
        }else {
            System.out.println("자바 공부를 합니다");
        }

    }
}
