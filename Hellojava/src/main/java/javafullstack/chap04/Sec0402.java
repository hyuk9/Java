package javafullstack.chap04;

/**
 * packageName : chap04
 * fileName : Sec0402
 * author : hyuk
 * date : 2022/09/26
 * description : 반복문
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Sec0402 {
    public void exam01() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam01⭐️");
//        1 ~ 100까지의 합 출력하기
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);
    }

    public void exam() {
//        실수로 반복문을 실행하는 것은 가능하나 결과에 오차가 생길 수 있음 (권고하지 않음)
//        현대 코딩언어 : 부동소수점 법을 사용 ( 장점 : 실수를 엄청 많이 사용할 수 있음, 단점, 오차 발생)
//                    고정소수점 법을 사용 ( 장점 : 정확도 높음, 단점 : 실수를 많이 표현 못함)
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }

    public void exam02() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam02⭐️");
        for (int i = 2; i < 10; i++) {
            System.out.println("****" + i + "단***");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }

    public void exam07() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam07⭐️");

        int i = 1;
        int result = 0;
        while (i <= 100) {
            result += i;
            i++;
        }
        System.out.println(result);
    }

//    3) do-while문 형태
//        int i=1;
//        int result =0;
//        do{
//            result += i;
//            i++;
//        } while(i<=100){
//           System.out.println(result);
//        }

//    break : 반복문 강제로 빠져나오기

    public void exam08() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam08⭐️");
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println("랜덤으로 나온 숫자는 : " + num);
            if (num == 6) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    public void exam09() {
//        1~10중에서 짝수만 출력 코딩 : continue
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam09⭐️");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }

//    자바 8에서 새로 나온 문법
//    반복문 사용하는 라벨
//    2중 loop에서 바깥쪽 for문 'A' ~ 'Z' 반복하고
//                    안쪽 for문 'a' ~ 'z' 반복함
//                    안쪽 for문에서 소문자 g나오면 break;
//                    이러면 안쪽for문만 중단되고 바깥쪽 for문은 중단x
//                    break는 안쪽 for문 중단시키지만 바깥쪽 for문 중단시키지 않음
//    양쪽 다 중단 시키기 위해 라벨을 붙이면 바깥쪽까지 중단가능 : break 라벨명;

    public void exam10() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0402 exam10⭐️");
        Outter: // 라벨명 정의
        for (char upper = 'A'; upper <='Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g'){
                    break Outter; // break 라벨명 => 라벨링된 for문 전체 같이 중단
                }
            }
        }
    }


}
