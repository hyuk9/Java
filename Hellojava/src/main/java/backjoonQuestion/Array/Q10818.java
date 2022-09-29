package backjoonQuestion.Array;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.Array
 * fileName : Q10818
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Q10818 {
    public void answer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수의 개수를 입력해주세요.");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("정수를 입력해주세요.");
        String str = scanner.nextLine();
        String[] tempArr = str.split(" ");

        int maxNum = 0;
        for (int i = 0; i < num; i++) {
            if (maxNum < (Integer.parseInt(tempArr[i]))) {
                maxNum = Integer.parseInt(tempArr[i]);
            }
        }

        int minNum = maxNum;
        for (int i = 0; i < num; i++) {
            if (minNum > (Integer.parseInt(tempArr[i]))) {
                minNum = Integer.parseInt(tempArr[i]);
            }
        }
        System.out.println(minNum + " " + maxNum);
    }
}