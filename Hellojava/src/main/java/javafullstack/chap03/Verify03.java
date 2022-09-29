package javafullstack.chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : Verify03
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Verify03 {
    public void exam01() {
//        자바입력방법
        System.out.println("--------------------");
        System.out.println("⭐️Verify03 exam01⭐️");
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 : ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.println("두번째 수 : ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("-------------");
//        num2 0이 아니면 결과: num1/num2

        if (num2 != 0.0) {
            result = num1 / num2;
            System.out.println("결과 : " + result);
        } else {
            System.out.println("무한대입니다");
        }
    }

    public void exam02() {
        System.out.println("-------------");
        System.out.println("⭐️Verify03 exam02⭐️");
        int var1 = 10;
//        원의 넓이 구하기
        double result = var1 * var1 * 3.14;
        System.out.println(result);
    }

    public void exam03() {
        System.out.println("-------------");
        System.out.println("⭐️Verify03 exam03⭐️");
//        아이디 비번 입력받아 java 아니면 로그인실패
//        아이디 java, 비번체크 12345면 로그인 성공
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.nextLine();
//      숫자비교 == / 문자열 비교 변수.equals
        if (id.equals("java")) {
            System.out.print("비밀번호를 입력해주세요 : ");
            int pw = Integer.parseInt(scanner.nextLine());
            if (pw == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패 : 패스워드가 틀림");
            }
        } else {
            System.out.println("로그인 실패 : 아이디가 존재하지 않음");
        }
    }
}
