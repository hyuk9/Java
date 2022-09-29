package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q2480
 * author : hyuk
 * date : 2022/09/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/24         hyuk          최초 생성
 */

//1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
public class Q2480 {
    public void answer(){
//        주사위 눈 3개 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("주사위 눈 3개를 입력해주세요");
        String num = scanner.nextLine();
        String[] tempArr = num.split(" ");

        int num1 = Integer.parseInt(tempArr[0]);
        int num2 = Integer.parseInt(tempArr[1]);
        int num3 = Integer.parseInt(tempArr[2]);
        int result = 0;

//        주사위 눈 3개가 같을 때
        if (num1 == num2 && num2 == num3 && num3 == num1){
            result = 10000+num1*1000;
            System.out.println("상금은 "+result);
//            주사위 눈 2개가 같을 때
        } else if (num1 == num2 || num2 == num3 || num3 == num1) {
            if (num1==num2){
                result = 1000+num1*100;
                System.out.println("상금은 "+result);
            } else if (num2==num3) {
                result = 1000+num2*100;
                System.out.println("상금은 "+result);
            } else if (num3==num1) {
                result = 1000+num3*100;
                System.out.println("상금은 "+result);
            }
//            모두 다른 눈이 나오는 경우
        } else if (num1 != num2 && num2 != num3 && num3 != num1) {
            if (num1>num2 && num1>num3){
                result = num1*100;
                System.out.println("상금은 "+result);
            } else if (num2>num1 && num2>num3) {
                result = num2*100;
                System.out.println("상금은 "+result);
            } else if (num3>num1 && num3>num2) {
                result = num3*100;
                System.out.println("상금은 "+result);
            }
        }
    }
}
