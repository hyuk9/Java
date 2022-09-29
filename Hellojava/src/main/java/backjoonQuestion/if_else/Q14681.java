package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q14681
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Q14681 {
    public void answer(){
//        흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
//        사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("두번째 정수를 입력하세요");
        int y = Integer.parseInt(scanner.nextLine());

        if (x>0 && y>0){
            System.out.println("1사분면 입니다");
        } else if (x<0 && y>0) {
            System.out.println("2사분면 입니다");
        } else if (x<0 && y<0) {
            System.out.println("3사분면 입니다");
        } else if (x>0 && y<0) {
            System.out.println("4사분면 입니다");
        }
    }
}
