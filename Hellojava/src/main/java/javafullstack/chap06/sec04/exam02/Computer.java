package javafullstack.chap06.sec04.exam02;

/**
 * packageName : javafullstack.chap06.sec04.exam02
 * fileName : Computer
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class Computer {
//    매개변수 : 배열 전달하는 함수
//    실무에서 함수 설계하는데 현재 매개변수 2개, 나중에 5~10개 쓸지 모르겠음(고객 요구사항에 따라서)
//    해결책 : 매개변수를 배열로 만들면 됨
//    모든 매개변수 값을 더하는 함수

    int sum (int[] value){
        int sum = 0;
//        매개변수 배열의 개수까지 모두 더하는 로직
        for (int i=0; i< value.length; i++){
            sum += value[i];
        }
        return sum;
    }

    //    2) 곱하기 함수 만들기
    int multi(int[] value){
        int sum = 1;
        for (int i=0; i<value.length; i++){
            sum *= value[i];
        }
        return sum;
    }

//    자바의 새로운 문법
//    매개변수 더하기 함수2
//    ... : 매개변수 배열 형태를 자동으로 만들어 주는 연산자
    int sum2(int ... values){
        int sum = 0;
        for (int i =0; i<values.length; i++){
            sum += values[i];
        }
        return  sum;
    }

}


