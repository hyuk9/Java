package backjoonQuestion.String;

import java.util.Scanner;

/**
 * packageName : backjoonQuestion.String
 * fileName : Q10809
 * author : hyuk
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Q10809 {
//    알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
//    단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
//    포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
    public void answer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("영어 문자열을 입력해주세요.");
        String str = scanner.nextLine();
        String[] tempArr = str.split("");
//        String[] alphabet = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,z};

        for (int i=0; i< tempArr.length; i++){
//            여기서 알파벳 따라서
        }

    }
}
