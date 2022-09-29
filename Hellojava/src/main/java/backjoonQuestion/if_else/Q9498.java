package backjoonQuestion.if_else;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.if_else
 * fileName : Q9498
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Q9498 {
    public void answer(){
//        시험 점수를 입력받아 90 ~ 100점은 A,
//        80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
//        나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        Scanner scanner = new Scanner(System.in);

        System.out.println("시험 점수를 입력하세요");
        int num = Integer.parseInt(scanner.nextLine());

        if (num>=90 && num<=100){
            System.out.println("학점은 A입니다");
        } else if (num>=80 && num<90) {
            System.out.println("학점은 B입니다");
        } else if (num>=70 && num<80) {
            System.out.println("학점은 C입니다");
        } else if (num>=60 && num<70) {
            System.out.println("학점은 D입니다");
        } else {
            System.out.println("학점은 F입니다");
        }

    }
}
