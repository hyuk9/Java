package jungsuk.chap11;

import java.util.ArrayList;
import java.util.List;

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
public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

//        Collections(자료구조) 공유 함수들
        System.out.println("---- 데이터 넣기 ------");
        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        System.out.println("----- 오른쪽으로 두 칸씩 이동 ------");
        rotate(list, 2);
        System.out.println(list);

        System.out.println("---- 첫번째외 세번째 요소 교환(swap) -----");
        swap(list, 0, 2);
        System.out.println(list);
    }
}











