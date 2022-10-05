package javafullstack.chap13.sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName : javafullstack.chap13.sec01.exam03
 * fileName : LinkedListApplication
 * author : hyuk
 * date : 2022/10/05
 * description : ArrayList와 LinkedList의 속도 비교
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
//  ✅ LinkedList : ArrayList의 단점 개선, 중간에 데이터 삭제/추가 시 속도저하를 개선
//          구분      | 순차적으로 추가/삭제 | 중간에 추가/삭제 |
//    ✅ ArrayList  | 빠르다            | 느리다
//    ✅ LinkedList | 느리다            | 빠르다
public class LinkedListApplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

//        1) 처음 시간
        startTime = System.nanoTime();
//        2) ArrayList 실행
        for (int i = 0; i < 10000; i++) {
            list.add(0,String.valueOf(i)); // 정수 👉 문자열로 변환해서 추가
        }
//        3) 끝 시간
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : " + (endTime-startTime)+"ns");


//        1) 처음 시간
        startTime = System.nanoTime();
//        2) ArrayList 실행
        for (int i = 0; i < 10000; i++) {
//            중간에 추가
            list2.add(0,String.valueOf(i)); // 정수 👉 문자열로 변환해서 추가
        }
//        3) 끝 시간
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간 : " + (endTime-startTime)+"ns");
    }
}
