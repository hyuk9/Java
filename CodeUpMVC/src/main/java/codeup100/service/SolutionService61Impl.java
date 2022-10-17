package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService61Impl
 * author : hyuk
 * date : 2022/10/14
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         hyuk          최초 생성
 */
public class SolutionService61Impl implements SolutionService{
    @Override
    public void CodeUp1001(Solution solution) {
//        61

    }

    @Override
    public void CodeUp1002(Solution solution) {
//        62

    }

    @Override
    public void CodeUp1003(Solution solution) {
//        63
//        삼항연산자 활용
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 2개를 입력해주세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int result = (num1 > num2) ? num1 : num2;

        solution.setStrResult(String.valueOf(result));
    }

    @Override
    public void CodeUp1004(Solution solution) {
//        64 세 정수 입력받아 중간값 찾기
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 세개를 입력해주세요");
        String[] num = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);
        int num3 = Integer.parseInt(num[2]);

        if (num1 >= num2){
            if (num2 >= num3){
                solution.setStrResult(String.valueOf(num2));
            }else if (num3 >= num1){
                solution.setStrResult(String.valueOf(num1));
            }else {
                solution.setStrResult(String.valueOf(num3));
            }
        } else if (num1 > num3) {
            solution.setStrResult(String.valueOf(num1));
        } else if (num2 > num3) {
            solution.setStrResult(String.valueOf(num3));
        } else {
            solution.setStrResult(String.valueOf(num2));
        }
    }

    @Override
    public void CodeUp1005(Solution solution) {

    }

    @Override
    public void CodeUp1006(Solution solution) {

    }

    @Override
    public void CodeUp1007(Solution solution) {

    }

    @Override
    public void CodeUp1008(Solution solution) {

    }

    @Override
    public void CodeUp1009(Solution solution) {

    }

    @Override
    public void CodeUp1010(Solution solution) {

    }
}
