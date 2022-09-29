package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q11022
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q11022 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("테스트 케이스 개수를 입력해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++){
            System.out.print("더할 숫자 두개를 입력해주세요 : ");
            String cal = scanner.nextLine();
            String[] tempArr = cal.split(" ");
            int num1 = Integer.parseInt(tempArr[0]);
            int num2 = Integer.parseInt(tempArr[1]);
            int result = num1+num2;
            System.out.println("Case #"+(i+1)+": "+num1+" + "+num2+" = "+result);
        }
    }
}
