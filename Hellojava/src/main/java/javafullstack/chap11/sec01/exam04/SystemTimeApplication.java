package javafullstack.chap11.sec01.exam04;

/**
 * packageName : javafullstack.chap11.sec01.exam04
 * fileName : SystemTimeApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 프로그램 실행 소요 시간 구하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class SystemTimeApplication {
    public static void main(String[] args) {
//        1) 처음 시간 체크
        long time1 = System.nanoTime(); // 1/10⁹ 시간
//        2) 실행
        int sum=0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i; // 누적합 구하기
        }
//        3) 마지막 시간 체크
        long time2 = System.nanoTime(); // 1/10⁹ 시간
//        4) 마지막 시간 - 처음 시간 = 소요 시간
        System.out.println("1~백만까지 합 : " + sum);
        System.out.println("소요시간(ns) : " + (time2 - time1));
    }
}
