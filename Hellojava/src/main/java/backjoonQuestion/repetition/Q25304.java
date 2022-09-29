package backjoonQuestion.repetition;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.repetition
 * fileName : Q25304
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q25304 {
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("총금액을 입력해주세요 : ");
        int total = Integer.parseInt(scanner.nextLine());
        System.out.print("구매한 개수를 입력해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int priceOfGoods = 0;

        for (int i=0; i<num; i++){
            System.out.print((i+1)+"번째 물건의 가격과 개수를 입력해주세요 : ");
            String price = scanner.nextLine();
            String[] tempArr = price.split(" ");
            priceOfGoods = (Integer.parseInt(tempArr[0]))*(Integer.parseInt(tempArr[1]));
            result += priceOfGoods;
        }

        if (total == result){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
