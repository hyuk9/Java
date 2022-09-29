package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q11720
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q11720 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        String  num2 = scanner.nextLine();
        String[] total = num2.split("");

        for (int i=0; i<num1; i++){
            result += Integer.parseInt(total[i]);
        }
        System.out.println(result);
    }
}
