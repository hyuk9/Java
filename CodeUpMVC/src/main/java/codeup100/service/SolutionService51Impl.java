package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService51Impl
 * author : hyuk
 * date : 2022/10/13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/13         hyuk          최초 생성
 */
public class SolutionService51Impl implements SolutionService{
    @Override
    public void CodeUp1001(Solution solution) {
//        51
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] str = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        if (num2 >= num1) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1002(Solution solution) {
//        52
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] str = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        if (num2 != num1) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1003(Solution solution) {
//        53‼️‼️‼️‼️‼️‼️
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 1개를 입력해주세요");
        int num = scanner.nextInt();
//        System.out.printf("%d", !0);
    }

    @Override
    public void CodeUp1004(Solution solution) {
//        54
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        if (num1 == 1 && num2 == 1) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1005(Solution solution) {
//        55
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        if (num1 == 1 || num2 == 1) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1006(Solution solution) {
//        56 ‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        if (!new Boolean(String.valueOf(num1)).equals(new Boolean(String.valueOf(num2)))) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1007(Solution solution) {
//        57 ‼️‼️‼️‼️‼️‼️‼️‼️‼️‼️

    }

    @Override
    public void CodeUp1008(Solution solution) {
//        58 ‼️

    }

    @Override
    public void CodeUp1009(Solution solution) {
//        59
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수하나를 입력해주세요");
        int num = scanner.nextInt();
        String str = String.valueOf(~num);
        int result = Integer.parseInt(str, 10);
        System.out.printf("%2d", result);
    }

    @Override
    public void CodeUp1010(Solution solution) {

    }
}
