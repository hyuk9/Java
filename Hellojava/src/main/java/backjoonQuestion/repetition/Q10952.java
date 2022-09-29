package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q10952
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q10952 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.print("더할 숫자 두개를 입력하세요 : ");
            String num = scanner.nextLine();
            String[] tempArr = num.split(" ");
            int num1 = Integer.parseInt(tempArr[0]);
            int num2 = Integer.parseInt(tempArr[1]);
            result = num1+num2;
            System.out.println("결과값 : " + result);
            if (num1 == 0 && num2 ==0){
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
