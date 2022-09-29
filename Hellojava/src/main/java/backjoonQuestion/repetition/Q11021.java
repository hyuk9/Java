package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q11021
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q11021 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("테스트 케이스 개수를 입력해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++){
            System.out.print("더할 숫자 두개를 입력해주세요 : ");
            String cal = scanner.nextLine();
            String[] tempArr = cal.split(" ");
            int result = Integer.parseInt(tempArr[0])+Integer.parseInt(tempArr[1]);
            System.out.println("Case #"+(i+1)+": "+result);
        }
    }
}
