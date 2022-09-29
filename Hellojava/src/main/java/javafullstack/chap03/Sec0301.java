package javafullstack.chap03;

/**
 * packageName : chap03
 * fileName : Sec0301
 * author : hyuk
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Sec0301 {
    public void exam02(){
        int x = 10;
        int y = 10;
        int z;

        System.out.println("⭐️Sec0301 exam02⭐️");
        System.out.println("------------------");
        x++;
        ++x;
        System.out.println("x = "+x);
        System.out.println("------------------");
        y++;
        ++y;
        System.out.println("y = "+y);
        System.out.println("------------------");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }

    public void exam03(){
        boolean play = true;
        System.out.println("------------------");
        System.out.println("⭐️Sec0301 exam03⭐️");
        System.out.println(play);

//        자바 : ! (not)
        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }

    public void exam04(){
        char c1 = 'A' + 1;
        char c2 = 'A';
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
    }

    public void exam07(){
//        비교 연산자 : 자바스크립트 통일
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("------------------");
        System.out.println("⭐️Sec0301 exam07⭐️");
        System.out.println("result1 : "+ result1);
        System.out.println("result2 : "+ result2);
        System.out.println("result3 : "+ result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4 : " + result4);
    }

//    exam09
    public void exam09(){
        int charCode = 'A';

//      1)  charCode가 대문자면 "대문자이군요"
//        소문자면 "소문자이군요"
        System.out.println("--------------------");
        System.out.println("⭐️Sec0301 exam09⭐️");
        System.out.println("--------------------");
        System.out.println("1번 문제");
        if(charCode>=65 && charCode<=90){
            System.out.println("대문자이군요");
        }else if(charCode>=97 && charCode<=122) {
            System.out.println("소문자이군요");
        }else if(charCode>=48 || charCode<=57){
            System.out.println("숫자이군요");
        }

//      2)
        int value = 6;
//        2또는 3의 배수
//        아니면
        System.out.println("--------------------");
        System.out.println("2번 문제");
        if(value%2==0 || value%3==0){
            System.out.println("2 또는 3의 배수이군요");
        }else {
            System.out.println("2 또는 3의 배수가 아니군요");
        }
    }

    public void exam10(){
//        사칙연산 축약식 (자바스크립트 동일)
        int result = 10;
//        result = result+10;
        System.out.println("--------------------");
        System.out.println("⭐️Sec0301 exam10⭐️");
        result += 10;
        System.out.println("result : " + result);
        result -= 5;
        System.out.println("result : " + result);
    }

    public void exam11(){
//        3항 연산자
        int score = 85;
//        char grade = 3항 연산자의 결과를 넣어주세요
//        score > 90 'A' 아니면 score > 80 'B' 아니면 'C'
        System.out.println("--------------------");
        System.out.println("⭐️Sec0301 exam11⭐️");
        char grade = (score > 90) ? 'A':((score>80) ? 'B': 'C');
        System.out.println(score + "점은 "+grade+"등급입니다");
    }


}
