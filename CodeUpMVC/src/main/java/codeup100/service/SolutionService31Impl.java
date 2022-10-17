package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService31Impl
 * author : hyuk
 * date : 2022/10/12
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/12         hyuk          최초 생성
 */
public class SolutionService31Impl implements SolutionService{
    @Override
    public void CodeUp1001(Solution solution) {
//        31
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = Integer.toOctalString(num);
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1002(Solution solution) {
//        32
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = Integer.toHexString(num);
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1003(Solution solution) {
//        33
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = Integer.toHexString(num).toUpperCase();
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1004(Solution solution) {
//        34
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = Integer.parseInt(num, 8);
        int result2 = Integer.parseInt(String.valueOf(result), 10);
        solution.setStrResult(String.valueOf(result2));
    }

    @Override
    public void CodeUp1005(Solution solution) {
//        35
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = Integer.parseInt(num, 16);
        int result2 = Integer.parseInt(String.valueOf(result), 8);
        solution.setStrResult(String.valueOf(result2));

    }

    @Override
    public void CodeUp1006(Solution solution) {
//        36
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        solution.setStrResult(String.valueOf(num));
    }

    @Override
    public void CodeUp1007(Solution solution) {
//        37
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char chr = (char) num;
        solution.setStrResult(String.valueOf(chr));
    }

    @Override
    public void CodeUp1008(Solution solution) {
//        38
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int result = num1+num2;

        solution.setStrResult(String.valueOf(result));
    }

    @Override
    public void CodeUp1009(Solution solution) {
//        39
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요");
        String[] num = scanner.nextLine().split(" ");

        long num1 = Integer.parseInt(num[0]);
        long num2 = Integer.parseInt(num[1]);
        long result = num1+num2;

        solution.setStrResult(String.valueOf(result));

    }

    @Override
    public void CodeUp1010(Solution solution) {
//        40
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 1개를 입력해주세요");
        int num = scanner.nextInt();
        int result = num*-1;
        solution.setStrResult(String.valueOf(result));
    }
}
