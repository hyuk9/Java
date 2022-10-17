package codeup100.service;

import codeup100.model.Solution;

import java.util.Scanner;

/**
 * packageName : codeup100.service
 * fileName : SolutionService 1 ~ 10
 * author : hyuk
 * date : 2022/10/11
 * description : 구현 클래스 - 업무로직 함수들 모임
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class SolutionServiceImpl implements SolutionService {
    @Override
    public void CodeUp1001(Solution solution) {
//        Setter / Getter 함수를 이용
//        속성은 접근 금지
//        속성에 값을 저장
        solution.setStrResult("Hello");
    }
    @Override
    public void CodeUp1002(Solution solution) {
        solution.setStrResult("Hello World");
    }

    @Override
    public void CodeUp1003(Solution solution) {
        solution.setStrResult("Hello\nWorld");
    }

    @Override
    public void CodeUp1004(Solution solution) {
        solution.setStrResult("'Hello'");
    }

    @Override
    public void CodeUp1005(Solution solution) {
        solution.setStrResult("\"Hello World\"");

    }

    @Override
    public void CodeUp1006(Solution solution) {
        solution.setStrResult("\"!@#$%^&*()\"");
    }

    @Override
    public void CodeUp1007(Solution solution) {
        solution.setStrResult("\"C:\\Download\\hello.cpp\"");
    }

    @Override
    public void CodeUp1008(Solution solution) {
        solution.setStrResult("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");
    }

    @Override
    public void CodeUp1009(Solution solution) {
//        ❌
    }

    @Override
    public void CodeUp1010(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        solution.setStrResult(String.valueOf(scanner.nextInt()));
    }
}
