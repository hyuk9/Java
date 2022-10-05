package javafullstack.chap11.sec02.exam01;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName : javafullstack.chap11.sec02.exam01
 * fileName : DateApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Date ( 날짜 함수 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class DateApplication {
    public static void main(String[] args) {
        // import java.util.Date
        Date now = new Date(); // 현재 날짜 정보 가져오기(컴퓨터에 지정된 날짜)
        String strNow = now.toString(); // 날짜 👉 문자열로 변환
        System.out.println(strNow);

//        💡참고 : 날짜 포맷 변경
//        ✅ 날짜포맷 : yyyy(연도), mm(월), dd(일), hh(시), mm(분), ss(초)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");

//        simpleDateFormat.format(Date 객체) : 기본 날짜형식 👉 위의 형식으로 바꾸어 문자열로 저장함
        String strNow2 = simpleDateFormat.format(now);
        System.out.println(strNow2);
    }
}
