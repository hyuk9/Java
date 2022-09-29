package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q2884
 * author : hyuk
 * date : 2022/09/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/24         hyuk          최초 생성
 */
public class Q2884 {
    public void answer() {
//        첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
//        그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//
//        입력 시간은 24시간 표현을 사용한다.
//        24시간 표현에서 하루의 시작은 0:0(자정)이고,
//        끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

//        스캐너 인스턴스 생성하기
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간을 입력해주세요 : ");
        String num = scanner.nextLine();
        String[] tempArr = num.split(" ");

        int hour = Integer.parseInt(tempArr[0]);
        int minute = Integer.parseInt((tempArr[1]));

        if (minute >= 45) {
            System.out.println(hour + " " + (minute - 45));
        } else {
            if (hour >= 1) {
                System.out.println((hour-1) + " " + (minute+15));
            } else if (hour == 0) {
                System.out.println(23 + " " + (minute+15));
            }
        }
    }
}
