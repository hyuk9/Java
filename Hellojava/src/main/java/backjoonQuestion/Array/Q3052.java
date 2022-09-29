package backjoonQuestion.Array;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.Array
 * fileName : Q3052
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Q3052 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int rest = 0;
        for (int i=0; i<10; i++){
//            System.out.println((i+1)+"번째 숫자를 입력해주세요");
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (arr[i]%42 != rest){
                count++;
            }
        }
        System.out.println(count);
    }
}
