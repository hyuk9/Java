package backjoonQuestion.basic;

import java.util.Scanner;

public class Q10950 {

    public static void main(String[] args) {
//        스캐너
        Scanner num = new Scanner(System.in);
//        몇번 반복할지 입력값 받기
        int test = Integer.parseInt(num.nextLine());
//        반복문 작성
        for (int i=0; i<test; i++) {
//            한줄씩 공백 띄워서 숫자 입력받기
            String x = num.nextLine();

            String[] tempArr = x.split(" ");
            System.out.println(Integer.parseInt(tempArr[0]) + Integer.parseInt(tempArr[1]));
        }
    }
}