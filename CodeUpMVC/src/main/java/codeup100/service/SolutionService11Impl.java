package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService11Impl 11 ~ 20
 * author : hyuk
 * date : 2022/10/11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class SolutionService11Impl implements SolutionService{
    @Override
    public void CodeUp1001(Solution solution) {
//        11
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        solution.setStrResult(scanner.nextLine());
    }

    @Override
    public void CodeUp1002(Solution solution) {
//        12
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요");
        double num = scanner.nextDouble();
        solution.setStrResult(String.valueOf(num));
    }

    @Override
    public void CodeUp1003(Solution solution) {
//        13
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두개를 입력해주세요");
        String num = scanner.nextLine();
        solution.setStrResult(num);
    }

    @Override
    public void CodeUp1004(Solution solution) {
//        14
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자 두개를 입력해주세요");
        String str = scanner.nextLine();
        String[] tempArr = str.split(" ");
        solution.setStrResult(tempArr[1] + " " + tempArr[0]);

//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        solution.setStrResult(str2 + " " + str1);
    }

    @Override
    public void CodeUp1005(Solution solution) {
//        15
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요");
        double num = scanner.nextDouble();
        double num1 = num*100;
        double num2 = Math.round(num1);
        double num3 = num2/100;

        String result = String.valueOf(num3);

//        double result = Math.round(num*100)/100.0;
        solution.setStrResult(result);
//        solution.setStrResult(String.valueOf(result));
    }

    @Override
    public void CodeUp1006(Solution solution) {
//        16❌
    }

    @Override
    public void CodeUp1007(Solution solution) {
//        17
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int num = scanner.nextInt();
        String result = num + " " + num + " " + num;
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1008(Solution solution) {
//        18
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력해주세요");
        String hour = scanner.nextLine();
        solution.setStrResult(hour);
    }

    @Override
    public void CodeUp1009(Solution solution) {
//        19
        Scanner scanner = new Scanner(System.in);
        System.out.println("연월일을 입력해주세요");
        String[] day = scanner.nextLine().split("\\.");


        int iresult = Integer.parseInt(day[0]);
        int iresult2 = Integer.parseInt(day[1]);
        int iresult3 = Integer.parseInt(day[2]);
        String result = String.format("%04d.%02d.%02d", iresult + iresult2 + iresult3);
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1010(Solution solution) {
//        20
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호를 입력해주세요");
        String[] ssn = scanner.nextLine().split("-");
        solution.setStrResult(ssn[0] + ssn[1]);
    }
}
