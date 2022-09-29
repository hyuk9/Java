package javafullstack.chap06.sec04.exam02;

/**
 * packageName : javafullstack.chap06.sec04.exam02
 * fileName : ComputerApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        배열정의
        int[] value01 = {1,2,3};
//        리턴값이 있는 함수
        int result1 = computer.sum(value01);

        System.out.println("result1 : " + result1);

//        2)
        int[] value02 = new int[]{1,2,3,4,5};
        int result2 = computer.sum(value02);
        System.out.println("result2 : " + result2);

        int result3 = computer.multi(value01);
        int result4 = computer.multi(value02);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);


//    4) 새로운 ... 함수 호출하기
        int result5 = computer.sum2(1,2,3);
        System.out.println("result5 : " + result5);

        int result6 = computer.sum2(1,2,3,4,5);
        System.out.println("result^ : " + result6);

    }


}
