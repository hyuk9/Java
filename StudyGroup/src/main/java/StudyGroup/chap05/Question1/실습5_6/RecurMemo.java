package StudyGroup.chap05.Question1.실습5_6;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap05.Question1.실습5_6
 * fileName : RecurMemo
 * author : hyuk
 * date : 2022/11/07
 * description : 재귀함수 메모화 p.177 ~ 178
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/07         hyuk          최초 생성
 */
public class RecurMemo {
    static String[] memo;

//    메모화를 도입한 recur 메서드
    static void recur(int n){
        if (memo[n+1] != null){
            System.out.print(memo[n+1]);
        } else {
            if (n > 0){
                recur(n-1);
                System.out.println(n);
                recur(n-2);
                memo[n+1] = memo[n] + n + "\n" + memo[n-1];
            } else {
                memo[n+1] = "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        memo = new String[x+2];
        recur(x);
    }

}
