package codeup100.service;

import codeup100.model.Solution;

/**
 * packageName : codeup100.service
 * fileName : JavaApplication
 * author : hyuk
 * date : 2022/10/11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class JavaApplication {
    public static void main(String[] args) {
        Solution solution = new Solution(); // 모델 생성
//        다형성 이용 : 서비스 생성
//        SolutionService solutionService = new SolutionServiceImpl();
//        SolutionService solutionService = new SolutionService11Impl();
//        SolutionService solutionService = new SolutionService21Impl();
//        SolutionService solutionService = new SolutionService31Impl();
//        SolutionService solutionService = new SolutionService41Impl();
//        SolutionService solutionService = new SolutionService51Impl();
        SolutionService solutionService = new SolutionService61Impl();

//        solutionService.CodeUp1001(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1002(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1003(solution);
//        System.out.println(solution.getStrResult());
        solutionService.CodeUp1004(solution);
        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1005(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1006(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1007(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1008(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1009(solution);
//        System.out.println(solution.getStrResult());
//        solutionService.CodeUp1010(solution);
//        System.out.println(solution.getStrResult());
    }
}
