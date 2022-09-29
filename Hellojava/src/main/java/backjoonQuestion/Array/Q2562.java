package backjoonQuestion.Array;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.Array
 * fileName : Q2562
 * author : hyuk
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Q2562 {
    public void answer() {
//        첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int maxNum =0;
        int count =0;

        for (int i=0; i<9; i++){
//            System.out.println((i+1)+"번째 자연수를 입력하세요");
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (maxNum<arr[i]){
                maxNum = arr[i];
                count = i+1;
            }
        }
//        System.out.println("최대값은 " + maxNum);
//        System.out.println("최대값의 순서는 " + count);
        System.out.println(maxNum);
        System.out.println(count);
    }
}
