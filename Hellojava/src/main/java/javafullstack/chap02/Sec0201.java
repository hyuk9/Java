package javafullstack.chap02;

public class Sec0201 {
//      속성(멤버변수)
//      함수(멤버메소드)
//      public : 접근자(접근제어자)
//      void : 반환값이 없음(return값이 없는 함수)
//      접근자 void(자료형)
//      function 함수명()
    public void exam01() {
        int value = 20;
        int result = value +20;
        System.out.println("⭐Sec0201 exam01⭐");
        System.out.println(result);
//        result + 20 출력하기
//        main 함수 안에 객체를 생성해서 함수 호출해서 출력
    }

//      exam02() 함수(메소드)

    public void exam02(){
//        숫자자료형(정수형) : int 변수명 = 값;
        int hour = 3;
        int minute = 5;
        System.out.println("⭐Sec0201 exam02⭐");
//        3시간 5분
        System.out.println(hour+"시간 "+minute+"분");
//        185분 출력
        int total = hour*60+minute;
        System.out.println("총"+total+"분");
    }


    public void exam03(){
        int x = 3;
        int y = 5;
        System.out.println("⭐Sec0201 exam03⭐");
//        x:3,y:5
        System.out.println("x:"+x+" y:"+y);
//        x:5, y:3
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:"+x+" y:"+y);
    }



//    exam04() 함수
    public void exam04(){
        int v1 = 15; // 지역변수 (if문 안에도 사용가능)
//      조건문
//      v1 > 10 : 10보다큼
//      else : 10보다 작음
        System.out.println("⭐Sec0201 exam04⭐");
        if (v1>10){
            int v2 = 10; // 지역변수 (if문 밖에선 사용불가능)
            System.out.println("10보다 큼");
        }else {
            System.out.println("10보다 작음");
        }
//        int result = v2 +20; // 에러 발생
    }
}
