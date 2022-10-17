package jungsuk.chap11;

import java.util.ArrayList;
import java.util.List;

//  Collections 클래스의 공유함수들 import
//  import 라이브러리패키지.* : * 모든 클래스를 의미
import static java.util.Collections.*;

/**
 * packageName : jungsuk.chap11
 * fileName : Ex11_19
 * author : ds
 * date : 2022-10-07
 * description : Collection(자바의 자료구조) 에 유용한 함수들
 *         Collection : List, Set, Map
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
//    1) SSR : 서버사이트 프로그램(백엔드 통합) : 형태(JSP(타임리프html) / Springboot) : 부산에서 많이 사용함
//        👉 옛날 방식
//          타임리프(html) : 10% + Springboot 사용법(90%)
//    2) CSR : 클라이언트 사이트 프로그램 + 백엔드 연동 => 💡목표 : 클라이언트(Vue/React) + 백엔드서버(Springboot)
//        👉 요즘 개발 트렌드 : Rest API 웹 프로그램 개발
//    3) 안드로이드 (한번 살펴보는 형태) 3주?
//    4) 팀프로젝트 : 포트폴리오 완성 (우리 + 강사님) 한달(기획)

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);
//        자료구조 : 배열 👉 개선한 여러가지 데이터를 다루는 구조(함수형태 데이터 추가/삭제/검색)
//        List / Set / Map 👉 배열보다 개선된 형태

//        Collections(자료구조) : List / Set / Map 대표하는 클래스
//        Collections의 클래스에는 유용한 공유함수들이 많음
        System.out.println("---- 데이터 넣기 ------");
//        자료구조 : Data Structure
//        ✅ 사용법 : addAll(자료구조객체, 배열원소)
        addAll(list, 1,2,3,4,5);
//        출력 : 자료구조객체를 바로 매개변수로 넣으면 값이 출력됨(배열과 다름)
        System.out.println(list);

        System.out.println("----- 오른쪽으로 두 칸씩 이동 ------");
//        ✅ 사용법 : rotate(자료구조객체, 오른쪽 칸이동)
        rotate(list, 2);
        System.out.println(list);

        System.out.println("---- 첫번째외 세번째 요소 교환(swap) -----");
//        ✅ 사용법 : swap(자료구조객체, 원본요소자리, 바꿀요소)
        swap(list, 0, 2);
//
        System.out.println(list);

        System.out.println("---- 저장된 요소의 위치를 임의로 변경 : 섞기 -----");
//        ✅ 사용법 : suffle(자료구조객체)
        shuffle(list);
        System.out.println(list);

        System.out.println("---- 역순정렬 reverse(list)와 동일 -----");
        sort(list, reverseOrder()); // 내림차순
        System.out.println(list);

        System.out.println("---- 정렬 : 오름차순 ----");
        sort(list); // 오름차순
        System.out.println(list);

        System.out.println("---- binary search (이진검색) ----");
//        사용법 : binarySearch(자료구조객체, 검색할값), 결과 : index 번호가 나옴
        int idx = binarySearch(list, 3); // 3의 값이 있는 인덱스 위치 리턴
        System.out.println("3의 위치 : " + idx);

        System.out.println("---- max/min ----");
        System.out.println("max = " + max(list)); // list에서 최댓값을 찾기
        System.out.println("max = " + min(list)); // list에서 최솟값을 찾기


        System.out.println("---- fill ----");
//        사용법 : fill(자료구조객체, 채울값)
        fill(list, 9);
        System.out.println("list = " + list);

        System.out.println("---- copy ----");
        List newList = new ArrayList<>(); // 빈 리스트 생성
        addAll(newList, list); // newList 끝에다 추가(copy)
        System.out.println("newList = " + newList);

        System.out.println("---- replaceAll(모두 바꾸기) ----");
        replaceAll(list, 9, 1); // 9 -> 1로 모두 변경
        System.out.println("list = " + list);


    }
}