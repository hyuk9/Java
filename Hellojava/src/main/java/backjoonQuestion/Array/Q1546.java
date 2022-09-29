package backjoonQuestion.Array;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.Array
 * fileName : Q1546
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Q1546 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
//        시험본과목의개수
        int num = Integer.parseInt(scanner.nextLine());
//        시험점수
        String score = scanner.nextLine();
        String[] tempArr = score.split(" ");

        int maxNum = 0;
        int sum = 0;
        double avg = 0.0;
        for (int i=0; i<num; i++){
            if (maxNum<(Integer.parseInt(tempArr[i]))){
                maxNum = Integer.parseInt(tempArr[i]);
            }
            sum += Integer.parseInt(tempArr[i]);
        }
        System.out.println(maxNum);
        System.out.println(sum);
        avg = ((sum/maxNum)*100)/num;
        System.out.println(avg);
    }
}