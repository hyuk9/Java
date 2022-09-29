package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q10951
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q10951 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String num = scanner.nextLine();
            String[] tempArr = num.split(" ");
            int num1 = Integer.parseInt(tempArr[0]);
            int num2 = Integer.parseInt(tempArr[1]);
            int result = num1+num2;
            System.out.println(result);
        }
    }
}
