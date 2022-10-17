package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService41Impl
 * author : hyuk
 * date : 2022/10/13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/13         hyuk          최초 생성
 */
public class SolutionService41Impl implements SolutionService{
    @Override
    public void CodeUp1001(Solution solution) {
//        41
        Scanner scanner = new Scanner(System.in);
        System.out.println("영문자 하나를 입력해주세요");
//        char타입으로 입력받기
        char chr = scanner.next().charAt(0);
//        chr에+1하기
        int num = chr+1;
//        num을 형변환
        char chr2 = (char) num;

        solution.setStrResult(String.valueOf(chr2));
    }

    @Override
    public void CodeUp1002(Solution solution) {
//        42
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
//        숫자 2개 입력받고 공백기준으로 나누기
        String[] num = scanner.nextLine().split(" ");
//        각각 정수로 형변환
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
//        계산식 작성
        int result = num1/num2;

        solution.setStrResult(String.valueOf(result));
    }

    @Override
    public void CodeUp1003(Solution solution) {
//        43
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
//        숫자 2개 입력받고 공백기준으로 나누기
        String[] num = scanner.nextLine().split(" ");
//        각각 정수로 형변환
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
//        계산식 작성
        int result = num1%num2;

        solution.setStrResult(String.valueOf(result));

    }

    @Override
    public void CodeUp1004(Solution solution) {
//        44
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 1개를 입력해주세요");
        long num = scanner.nextLong();
        long result = num+1;

        solution.setStrResult(String.valueOf(result));
    }

    @Override
    public void CodeUp1005(Solution solution) {
//        45
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력하세요");
//        숫자 2개 입력받고 공백기준으로 나누기
        String[] num = scanner.nextLine().split(" ");
//        각각 정수로 형변환
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
//        계산식 작성
        int plus = num1+num2;
        int minus = num1-num2;
        int multiple = num1*num2;
        int divide = num1/num2;
        double result1 = (double) num1%num2;
        double divide2 = (double) num1/num2;

        solution.setStrResult(plus + "\n" + minus +  "\n" + multiple + "\n" + divide + "\n" + result1 +  "\n" + divide2);
    }

    @Override
    public void CodeUp1006(Solution solution) {
//        46
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력해주세요");
//        정수 3개 입력받고 공백기준으로 나누기
        String[] num = scanner.nextLine().split(" ");
//        각각 정수로 형변환
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int num3 = Integer.parseInt(num[2]);

        int sum = num1+num2+num3;
        double avg = (double) sum/num.length;

        solution.setStrResult(sum + "\n" + avg);
    }

    @Override
    public void CodeUp1007(Solution solution) {
//        47
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 1개를 입력해주세요");
        int num = scanner.nextInt();
        System.out.printf("%d", num<<1);
    }

    @Override
    public void CodeUp1008(Solution solution) {
//        48
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] str = scanner.nextLine().split(" ");
        int num1= Integer.parseInt(str[0]);
        int num2= Integer.parseInt(str[1]);

        System.out.printf("%d", num1<<num2);
    }

    @Override
    public void CodeUp1009(Solution solution) {
//        49
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] str = scanner.nextLine().split(" ");
        int num1= Integer.parseInt(str[0]);
        int num2= Integer.parseInt(str[1]);

        if (num1 > num2) solution.setStrResult("1");
        else solution.setStrResult("0");
    }

    @Override
    public void CodeUp1010(Solution solution) {
//        50
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] str = scanner.nextLine().split(" ");
        int num1= Integer.parseInt(str[0]);
        int num2= Integer.parseInt(str[1]);

        if (num1 == num2) solution.setStrResult("1");
        else solution.setStrResult("0");
    }
}
