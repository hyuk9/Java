package jungsuk.chap14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName : jungsuk.chap14
 * fileName : Ex14_4
 * author : hyuk
 * date : 2022/10/11
 * description : 컬렉션(자료구조)과 함수형 인터페이스의 만남 p.564~565
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        0 ~ 9 향상된 배열 (ArrayList)
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        ➡️ list의 값을 모두 출력
//        내부적으로 반복문이 돌고 있는 함수 : .foreach(람다식)
        list.forEach(i -> System.out.print(i+","));
        System.out.println();
        System.out.println("=====================");

//        ➡️ list에서 2|3 배수 제거
        list.removeIf(i -> i%2 == 0 || i%3 ==0);
        System.out.println(list);
        System.out.println("=====================");

//        ✅ UnaryOperator : ex) T apply(T t) 형태 ( 매개변수 자료형 == 리턴값 자료형 )
//        ➡️ list의 각 요소에 10을 곱한 값을 바꾸기
        list.replaceAll(i -> i*10);
        System.out.println(list);
        System.out.println("=====================");

//        HashMap 자료구조 : (키, 값) 이루어진 자료구조
        Map<String, String> map = new HashMap<>();

//        map 값 추가
        map.put("1", "가");
        map.put("2", "나");
        map.put("3", "다");
        map.put("4", "라");

//        .forEach 이용해서 출력
        map.forEach((i, j) -> System.out.println("(" + i + ", " + j + ")"));

    }
}
