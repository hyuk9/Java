package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q10950
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q10950 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
//        반복해서 입력받을 숫자
        System.out.print("반복할 숫자를 입력해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++){
            System.out.print("더할 숫자 두개를 입력해주세요 : ");
            String str = scanner.nextLine();
            String[] tempArr = str.split(" ");
            System.out.print("합계 : ");
            System.out.println(Integer.parseInt(tempArr[0])+Integer.parseInt(tempArr[1]));
        }
    }
}
