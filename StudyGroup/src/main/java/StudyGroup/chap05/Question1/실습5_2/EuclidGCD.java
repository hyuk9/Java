package StudyGroup.chap05.Question1.실습5_2;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap05.Question1.실습5_2
 * fileName : EuclidGCD
 * author : hyuk
 * date : 2022/11/07
 * description : 유클리드 호제법 p.168 ~ 169
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/07         hyuk          최초 생성
 */
public class EuclidGCD {
//    정수 x,y의 최대공약수를 구하여 반환
    static int gcd(int x, int y){
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다");

        System.out.print("첫번째 정수를 입력하세요 : "); int x = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요 : "); int y = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + "입니다");
    }
}
