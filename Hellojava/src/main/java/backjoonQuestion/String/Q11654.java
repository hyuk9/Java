package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q11654
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q11654 {
    public void answer(){
//        스캐너 인스턴스
        Scanner scanner = new Scanner(System.in);
//        String문자열을 next().charAt(0)으로 형변환(0) charAt()괄호안은 문자열 순서
        int num = scanner.next().charAt(0);
        System.out.println(num);
    }
}
