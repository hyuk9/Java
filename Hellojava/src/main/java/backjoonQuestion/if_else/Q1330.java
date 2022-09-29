package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoon.조건문
 * fileName : Q1330
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Q1330 {
    public void answer(){
//        스캐너 선언 후 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 2개를 입력해주세요");
        String num = scanner.nextLine();
        String[] tempArr = num.split(" ");

        int num1 = Integer.parseInt(tempArr[0]);
        int num2 = Integer.parseInt(tempArr[1]);

        if (num1>num2){
            System.out.println(">");
        } else if (num1<num2) {
            System.out.println("<");
        }else {
            System.out.println("=");
        }
    }
}
