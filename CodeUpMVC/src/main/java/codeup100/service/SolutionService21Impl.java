package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService21 21 ~ 30
 * author : hyuk
 * date : 2022/10/11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class SolutionService21Impl implements SolutionService{

    @Override
    public void CodeUp1001(Solution solution) {
//        21
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력해주세요");
        String str = scanner.nextLine();
        solution.setStrResult(str);
    }

    @Override
    public void CodeUp1002(Solution solution) {
//        22
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String str = scanner.nextLine();
        solution.setStrResult(str);
    }

    @Override
    public void CodeUp1003(Solution solution) {
//        23
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요");
        double num = scanner.nextDouble();
        String[] result = String.valueOf(num).split("\\.");
        solution.setStrResult(result[0]+"\n"+result[1]);
    }

    @Override
    public void CodeUp1004(Solution solution) {
//        24
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String[] str = scanner.nextLine().split("");
        String result="";
        for (int i = 0; i < str.length; i++) {
            result += "'"+str[i]+"'\n";
        }
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1005(Solution solution) {
//        25
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = scanner.nextInt();
        String str = String.valueOf(num);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) result += "["+str.charAt(i)+"0000]\n";;
            if (i == 1) result += "["+str.charAt(i)+"000]\n";
            if (i == 2) result += "["+str.charAt(i)+"00]\n";
            if (i == 3) result += "["+str.charAt(i)+"0]\n";
            if (i == 4) result += "["+str.charAt(i)+"]";
        }
        solution.setStrResult(result);
    }

    @Override
    public void CodeUp1006(Solution solution) {
//        26
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력해주세요");
        String[] time = scanner.nextLine().split(":");
        solution.setStrResult(time[2]);
    }

    @Override
    public void CodeUp1007(Solution solution) {
//        27
        Scanner scanner = new Scanner(System.in);
        System.out.println("연월일을 입력해주세요");
        String[] day = scanner.nextLine().split("\\n");
        String result = day[2]+"-"+day[1]+"-"+day[0];

        solution.setStrResult(result);

    }

    @Override
    public void CodeUp1008(Solution solution) {
//        28
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        long num = scanner.nextLong();
        solution.setStrResult(String.valueOf(num));
    }

    @Override
    public void CodeUp1009(Solution solution) {
//        29
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요");
        double num = scanner.nextDouble();
        solution.setStrResult(String.valueOf(num));
    }

    @Override
    public void CodeUp1010(Solution solution) {
//        30
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        long num = scanner.nextLong();
        solution.setStrResult(String.valueOf(num));
    }
}
