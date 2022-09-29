package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q1152
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Q1152 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String str = scanner.nextLine();
        String[] tempArr = str.split(" ");
        System.out.println(tempArr.length);
    }
}
