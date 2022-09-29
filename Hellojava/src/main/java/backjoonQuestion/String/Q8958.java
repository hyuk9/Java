package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q8958
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// 예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

public class Q8958 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
//        테스트케이스 개수
        int num = Integer.parseInt(scanner.nextLine());
        String arr = scanner.nextLine();
        String[] tempArr = arr.split("");
        for (int i=0; i<num; i++){
//            String str =
        }

    }
}
