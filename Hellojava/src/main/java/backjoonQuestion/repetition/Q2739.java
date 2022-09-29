package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q2739
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q2739 {
    public void answer(){
//        스캐너 인스턴스 호출
        Scanner scanner = new Scanner(System.in);

//        구구단 몇단인지 입력받기
        System.out.println("단 수를 입력해주세요");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=1; i<10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
