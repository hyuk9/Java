package StudyGroup.chap05.Question1.실습5_3;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap05.Question1.실습5_3
 * fileName : Recur
 * author : hyuk
 * date : 2022/11/07
 * description : 재귀 알고리즘 p.170
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/07         hyuk          최초 생성
 */
public class Recur {
//    재귀 함수
    static void recur(int n){
        if (n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        recur(x);
    }

}
