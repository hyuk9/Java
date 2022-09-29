package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q2438
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q2438 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<num; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
