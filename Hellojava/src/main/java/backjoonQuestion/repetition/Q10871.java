package backjoonQuestion.repetition;

import javax.swing.*;
import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q10871
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */

//      첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//      둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
public class Q10871 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 2개를 입력하세요");
        String num1 = scanner.nextLine();
        String[] tempArr1 = num1.split(" ");

        int N = Integer.parseInt(tempArr1[0]);
        int X = Integer.parseInt(tempArr1[1]);

        System.out.println("수열 A를 입력하세요");
        String num2 = scanner.nextLine();
        String[] tempArr2 = num2.split(" ");

        for (int i=0; i<N; i++){
            if (Integer.parseInt(tempArr2[i])<X){
                System.out.print(tempArr2[i] + " ");
            }
        }
    }
}
