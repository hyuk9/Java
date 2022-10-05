package javafullstack.chap13.sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * packageName : javafullstack.chap13.sec01.exam06
 * fileName : HashMapApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Map 인터페이스, 구현클래스 HashMap, HashTable, Linked
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
// ✅ Map : 인터페이스, 키와 값으로 구성된 자료구조 ((키, 값) : Entry)
//    ✅ 키 : 유일(중복되면 안됨)
//    ✅ 값 : 중복 허용
//    ✅ 동일한 키값으로 저장하면 기존 값을 새 값으로 대치해서 저장됨
public class HashMapApplication {
    public static void main(String[] args) {
//        Map 자료 구조 생성
        Map<String, Integer> map = new HashMap<>(); // HashMap 또는 ArrayList 취사 선택하는 경우 많음

//        ✅ map객체.put(키, 값) : 객체 추가
        map.put("신용권", 85); // Entry 1개
        map.put("홍길동", 90); // Entry 2개
        map.put("동장군", 80); // Entry 3개
        map.put("홍길동", 95); // Entry 4개

//        ✅ map.size() : map 객체 크기 보기
        System.out.println("총 Entry 수 : " + map.size());

//        ✅ map.get(키) : Entry 보기
        System.out.println("홍길동 : " + map.get("홍길동")); // 👉 중복된 값은 마지막에 들어간 값으로 조회됨‼️
        System.out.println("=====================================");
//        ✅ 객체를 뽑아서 출력하기
        Set<String> keySet = map.keySet(); // Map 👉 Set 변환 : 키값만 있는 집합
//        ✅ 반복문을 실행할 때 : Iterator 객체 이용하면 간편하게 실행할 수 있음
        Iterator<String> keyIterator = keySet.iterator(); // Iterator로 변환
//        keyIterator.hasNext() : Iterator 객체안에 값이 있으면
        while (keyIterator.hasNext()){
//            1st .next() 호출 : 최초 자료
//            2nd .next() 호출 : 두번째 자료
//            ...
//            nth .next() 호출 : n번째 자료

            String key = keyIterator.next(); // 그 값을 임시 key 변수에 넣기
            Integer value = map.get(key); // 키로 값을 조회
            System.out.println(key + " : " + value);
        }
        System.out.println("====================================="); // 줄바꿈

//        자료삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

//        자료모두삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
