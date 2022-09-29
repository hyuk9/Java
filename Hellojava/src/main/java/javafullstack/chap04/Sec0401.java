package javafullstack.chap04;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : hyuk
 * date : 2022/09/23
 * description :
 *  * 요약 :
 *  *      if문 - if(조건식1){실행문}/else if(조건식2){실행문2}/else{실행문3}
 *  *      조건식1...2까지 각각 true/false인지 판단해서 실행할지 결정
 *  *      switch문 - switch(변수) { case 값1: 실행문1 case 값2:... default: 실행문n }
 *  *      변수의 값을 판단해서 변수값이 값1이면 실행문1이 실행... 모두 아니면 dafault 에 실행문 실행됨
 *  *      사용시 실행문 실행하고 break;로 빠져나와야 함
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 */
public class Sec0401 {
    public void exam01() {
        int score = 93;
        System.out.println("--------------------");
        System.out.println("⭐️Sec0401 exam01⭐️");
        if (score >= 90) {
            System.out.println(score + "이(가) 90보다큽니다");
            System.out.println("등급은 A입니다");
        } else {
            System.out.println(score + "이(가) 90보다 작습니다");
            System.out.println("등급은 B입니다");
        }
    }

    public void exam02() {
//        랜덤함수 : 0~1사이의 아무 실수로 뽑는 함수
//        랜덤 함수 : 0 <= X < 1 실수 (소수점 포함)
//        ex) 1 ~ 10까지의 정수를 뽑기
//        1) 0.0 <= Math.random() <1.0
//        2) 0.0*10 <= Math.random() *10 < 1.0 * 10
//        3) <= (int)(Math.random() *10) < 10.0
//        4) 0 + 1 <= (int)(Math.random() * 10) +1 <10+1
//        공식 : int num = (int)(Math.random()*끝숫자)+시작숫자;
        int num = (int) (Math.random() * 6) + 1;
//        1이면 1출력
        System.out.println("--------------------");
        System.out.println("⭐️Sec0401 exam02⭐️");
        if (num == 1) {
            System.out.println("주사위 숫자는 : " + 1);
        } else if (num == 2) {
            System.out.println("주사위 숫자는 : " + 2);
        } else if (num == 3) {
            System.out.println("주사위 숫자는 : " + 3);
        } else if (num == 4) {
            System.out.println("주사위 숫자는 : " + 4);
        } else if (num == 5) {
            System.out.println("주사위 숫자는 : " + 5);
        } else {
            System.out.println("주사위 숫자는 : " + 6);
        }
    }

//    8~11까지 정수 얻기
//    8 출근합니다
//    9 회의를 합니다
//    10 업무를 봅니다
//    그외 나머지 외근을 나갑니다
    public  void  exam06(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0401 exam06⭐️");

//        8 <= x < 12(8+4)
        int num = (int)(Math.random()*4)+8;

//        조건문 : 1) if문 사용
        if (num == 8){
            System.out.println(num + "출근합니다");
        } else if (num == 9) {
            System.out.println(num + "회의를 합니다");
        } else if (num == 10) {
            System.out.println(num + "업무를 봅니다");
        } else {
            System.out.println(num + "외근을 나갑니다");
        }

//        조건문 : 2) switch ~ case문 사용
//        switch(변수) : 변수의 값을 조사해서 각각 상황(case 값(상수))과 일치하는 조건문이 실행됨
//        문법 : switch(변수){
//                  case 값1 :
//                      실행문;
//                      break;
//                  default :
//                      실행문;
//                      break; -> 강제 종료됨
//        }
        switch (num){
            case 8:
                System.out.println(num + "출근합니다");
                break;
            case 9:
                System.out.println(num + "회의를 합니다");
                break;
            case 10:
                System.out.println(num + "업무를 봅니다");
                break;
            default:
                System.out.println(num + "외근을 나갑니다");
                break;
        }
    }

    public void exam07(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0401 exam07⭐️");
        char grade = 'B';

        switch (grade){
            case 'A' :
            case 'a' :
                System.out.println("우수 회원입니다");
                break;
            case 'B' :
            case 'b' :
                System.out.println("일반 회원입니다");
                break;
            default:
                System.out.println("손님입니다");
        }
    }

}
