package StudyGroup.chap05.Question1.실습5_5;

import StudyGroup.chap04.Question1.IntStack;

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
public class RecurX2 {
//    재귀 함수
    static void recur(int n){
        IntStack intStack = new IntStack(n);

        while (true){
            if (n > 0){
                intStack.push(n);
                n = n-1;
                continue;
            }
            if (intStack.isEmpty() != true){
                n = intStack.pop();
                System.out.println(n);
                n = n-2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        recur(x);
    }

}
