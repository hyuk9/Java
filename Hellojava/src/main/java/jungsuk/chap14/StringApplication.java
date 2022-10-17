package jungsuk.chap14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * packageName : jungsuk.chap14
 * fileName : StringApplication
 * author : hyuk
 * date : 2022/10/11
 * description : Stream의 유용한 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class StringApplication {
    public static void main(String[] args) {
//        ➡️ 샘플 배열
        String[] strArr = {"Hwang", "Hong", "Kang"};

//        ➡️ 배열 👉 List 변환 : Arrays.asList()
        List<Integer> integerList = Arrays.asList(1,2,3); // 정수형 배열 👉 List 생성
        List<String> strList = Arrays.asList(strArr); // 문자열 배열 👉 List 생성

//        ➡️ Arrays sort
        Arrays.sort(strArr); // 배열 정렬
        Collections.sort(strList); // 자료구조(List) 정렬

//        ➡️ List 출력
        for (String str : strList){
            System.out.println(str); // 정렬된 List 출력
        }

        System.out.println("========== stream forEach ==========");
//        ✅ stream : 추상화된 가상된 구조 -> 유용한 함수 다수 포진 (함수형 프로그래밍의 함수 차용)
//        ✅ stream의 대상 : 주로 자료구조(List, Map, Set)를 이용
//        ➡️ 정렬+출력
        strList.stream().sorted(). // 정렬
                forEach(i -> System.out.println(i)); // 출력


        System.out.println("========== stream filter ==========");
//        ✅ filter : 원본배열 조건에 해당하는 배열만 재생성
//        ➡️ 정수배열 : 3보다 작은 정수를 갖는 배열로 재생성
        integerList.stream().filter(i -> i < 3).forEach(i -> System.out.println(i));

        System.out.println("========== stream distinct ==========");
//        ✅ distinct : 중복값 제거한 자료구조 생성
        Arrays.asList(1,2,3,2,5).stream().distinct()
//                .forEach(i -> System.out.print(i +" "));
                .forEach(System.out::print); // 👉 이렇게도 사용가능

        System.out.println();
        System.out.println("========== stream map ==========");
//        ✅ map : 스트림의 각 요소마다 수행할 연산을 구현할 때 사용 : 새로운 자료구조(List)를 만들 때 사용
        integerList.stream().map(i -> i*i).forEach(i -> System.out.println(i));

        System.out.println("========== stream limit ==========");
//        ✅ limit(제한값) : 시작 요소로부터 매개변수값으로 전달된 인덱스까지만 추출
        integerList.stream().limit(2).forEach(i -> System.out.println(i));

        System.out.println("========== stream skip ==========");
//        ✅ skip : 매개변수값으로 전달된 인덱스까지 제외한 나머지 추출
        integerList.stream().skip(2).forEach(i -> System.out.println(i));

        System.out.println("========== stream sort ==========");
//        ✅ .sort() : 오름차순 정렬
        Arrays.asList(1,4,3,2).stream().sorted().forEach(i-> System.out.print(i));

        System.out.println();

//        ✅ .sort(Comparator.reverseOrder()) : 내림차순 정렬
        Arrays.asList(1,4,3,2).stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.print(i));

        System.out.println();

    }
}
