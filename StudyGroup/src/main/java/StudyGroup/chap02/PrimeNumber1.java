package StudyGroup.chap02;

/**
 * packageName : StudyGroup.chap02
 * fileName : Question2_7
 * author : hyuk
 * date : 2022/10/16
 * description : Question2_7
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int count =0;
        for (int n = 0; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                count++;
                if (n%i==0)
                    break;
            }
            if (n==i)
                System.out.println(n);
        }
        System.out.println("나눈셈을 수행한 횟수 : " + count);
    }
}
