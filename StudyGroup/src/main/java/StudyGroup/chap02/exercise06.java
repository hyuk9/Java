package StudyGroup.chap02;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap02
 * fileName : exercise06
 * author : hyuk
 * date : 2022/10/16
 * description : 연습문제 6
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */
public class exercise06 {
    static int cardConv(int x, int r, char[] arr){
//        정수값 x를 r진수로 변환하여 배열 arr에 아래자리부터 넣어 두고 자리수를 반환
        int count = 0; // 변환후의 자리수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            arr[count++] = dchar.charAt(x % r);
            x/=r;
        } while (x != 0);

        for (int i = 0; i< count/2; i++ ){
            char t = arr[i];
            arr[i]= arr[count -i-1];
            arr[count -i -1] = t;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환후의 자리수
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자 배열

        System.out.println("10진수를 기수 변환합니다");
        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = scanner.nextInt();
        } while (no < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
            cd = scanner.nextInt();
        } while (cd < 2 || cd > 36);

        dno = cardConv(no, cd, cno);


        for (int i = 0; i<dno; i++) {
            if (i==0){
                System.out.print(cd + "|        " + no);
                System.out.println();
                System.out.println(" +----------");
            }else {
                System.out.print(cd + "|        " + no + " ··· " + cno[i]);
                System.out.println();
                System.out.println(" +----------");
            }

            no = no/cd;

            if (i==dno-1){
                System.out.print("          " + no + " ··· " + cno[i]);
                System.out.println();
            }

        }

        System.out.print("2진수로 ");
        for (int i = 0; i<dno; i++) {
            System.out.print(cno[i]);
        }   System.out.println("입니다");
    }
}
