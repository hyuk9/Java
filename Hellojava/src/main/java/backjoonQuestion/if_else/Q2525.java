package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q2525
 * author : hyuk
 * date : 2022/09/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/24         hyuk          최초 생성
 */
public class Q2525 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
//        첫째 줄에는 현재 시각이 나온다.
//        현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
//        두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
//        오븐이 종료되는 시각 입력받기

//        입력 14 30 + 20 = 출력 14 50
//        입력 17 40 + 80 = 출력 19 0
//        입력 23 48 + 25 = 출력 0 13


        System.out.println("현재 시각을 입력해주세요");
        String num = scanner.nextLine();
        String[] tempArr = num.split(" ");
        int hour = Integer.parseInt(tempArr[0]);
        int minute = Integer.parseInt(tempArr[1]);
        System.out.println("요리하는데 필요한 시간을 입력해주세요");
        int cooktime = Integer.parseInt(scanner.nextLine());
        System.out.println("---");
        int total = minute+cooktime;

        if (cooktime<60){
            if (total<60){
                System.out.println(hour + " " + total);
            } else if (total>=60) {
                int totalhour = hour+(total/60);
                if (totalhour<24){
                    System.out.println(totalhour + " " + total%60);
                } else if (totalhour >=24) {
                    System.out.println((totalhour-24)+ " " + total%60);
                }
            }
        } else if (cooktime>=60) {
            if(hour + (total/60) < 24){
                System.out.println((hour + (total/60)) + " " + total%60);
            } else if (hour + (total/60) >= 24) {
                System.out.println(((hour + (total/60))-24) + " " + total%60);
            }

        }
    }
}
