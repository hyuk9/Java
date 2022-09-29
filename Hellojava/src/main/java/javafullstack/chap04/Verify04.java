package javafullstack.chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Verify
 * author : hyuk
 * date : 2022/09/26
 * description : 종합연습문제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */

// 리펙토링 refactoring : 클래스 정리정돈
//    클래스명, 변수명, 함수명 등을 의미에 맞게 고치는 활동 ( 성능 상관없음, 유지보수에 초점 )
public class Verify04 {
    public void exam02(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam02⭐️");
        int result = 0;
        for (int i=1; i<=100; i++){
            if (i%3==0){
                result += i;
            }
        }

        System.out.println("1부터 100까지의 3의 배수의 총합은 : " + result);
    }

    public void exam03(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam03⭐️");
        int result = 0;
        while (true){
            int balance1 = (int)(Math.random()*6)+1;
            int balance2 = (int)(Math.random()*6)+1;
            result = balance1+balance2;
            System.out.println("주사위 눈 : (" + balance1 + ", " + balance2+")");
            if (result == 5){
                break;
            }
        }
    }

    public void exam04(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam04⭐️");
//    4) 2중 for문을 이용해서 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해 보세요.
//    단 ,x와 y는 10 이하의 자연수( 1 ~ 10까지 )
        int result = 0;
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                if (4*i + 5*j == 60){
                    System.out.println("("+i+", "+j+")");
                }
            }
        }

    }

    public void exam05(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam05⭐️");

        for(int i=0; i<4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void exam06(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam06⭐️");
        for(int i=1; i<=4; i++){
            for (int j=4; j>i; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    7) while문과 Scanner를 이용해서 키보드로 입력된 데이터로
    //    예금, 출금, 조회, 종료 기능을 제공하는 코드를
//       []에 작성해 보세요. 프로그램을 실행하면 다음과 같은 결과가 나와야 함
//    단, Scanner 의 nextLine() 사용하세요.
//    실행결과 : 선택> 1
//           예금액> 10000
//             선택> 2
//           출금액> 2000
//             선택> 3
//             잔고> 8000
//             선택> 4
//             프로그램 종료
    public void exam07() {
        System.out.println("--------------------");
        System.out.println("⭐️Verify04 exam07⭐️");

        boolean run = true;

        int balance = 0;
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

//           아래 부분을 완성하세요 — 시작
            balance = Integer.parseInt(scanner.nextLine());
            if (balance == 1){
                System.out.print("예금액을 입력해주세요 : ");
                num1 = Integer.parseInt(scanner.nextLine());
                result += num1;
                System.out.println("예금액> " + result);
            } else if (balance == 2) {
                System.out.print("출금액을 입력해주세요 : ");
                num2 = Integer.parseInt(scanner.nextLine());
                result -= num2;
                System.out.println("출금액> " + result);
            } else if (balance == 3) {
                System.out.println("잔고> " + result);
            } else if (balance == 4) {
                run = false;
            } else {
                System.out.println("숫자를 잘못 입력했습니다.");
            }
//           끝
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
