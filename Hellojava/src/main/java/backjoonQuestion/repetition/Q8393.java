package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q8393
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q8393 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i=1; i<=num; i++){
            result += i;
        }
        System.out.println("1부터 "+num+"까지의 합은 : " + result);
    }
}
