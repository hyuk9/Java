package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q2753
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Q2753 {
    public void answer(){
//        연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("연도를 입력하세요");
        int num = Integer.parseInt(scanner.nextLine());

        if ((num%4 ==0 && num%100!=0) || num%400==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
