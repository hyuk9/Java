package StudyGroup.chap02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * packageName : StudyGroup.chap02
 * fileName : exercise08
 * author : hyuk
 * date : 2022/10/16
 * description : 연습문제8
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */
public class exercise08 {
    public static class YMD {
        Integer year;
        Integer month;
        Integer day;

        //        생성자
        public YMD(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");


            cal.set(year,month,day);
            System.out.println("지정한 날짜는 : " + sdf.format(cal.getTime()));
        }

//        ⭐️ n일 전의 날짜 출력
        public void YMDafter(int n){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

            cal.set(year,month,day);

            cal.add(Calendar.DATE, n);
            System.out.println(n+"일 후의 날짜는 : "+sdf.format(cal.getTime()));


        }

//        ⭐️ n일 후의 날짜 출력
        public void YMDbefore(int n){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");

            cal.set(year,month,day);

            cal.add(Calendar.DATE, -n);
            System.out.println(n+"일 전의 날짜는 : "+sdf.format(cal.getTime()));
        }
    }


    public static void main(String[] args) {
        //    Calendar 객체 생성
//        Calendar cal = Calendar.getInstance();
            YMD ymd = new YMD(1995, 11, 11);
            ymd.getTime();

            ymd.YMDafter(10);
            ymd.YMDbefore(10);
    }
}
