package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q2675
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q2675 {
    public void answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("테스트 케이스의 개수를 입력해주세요.");
        int T = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<T; i++){
            System.out.println("반복횟수와 문자열을 입력해주세요");
            String S = scanner.nextLine();
            String[] tempArr = S.split(" ");
            int num1 = Integer.parseInt(tempArr[0]);
            String num2 = tempArr[1];

            System.out.println(num1 + num2);
        }
    }
}
