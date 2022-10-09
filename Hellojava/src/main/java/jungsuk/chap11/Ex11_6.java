package jungsuk.chap11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : jungsuk.chap11
 * fileName : Ex11_6
 * author : ds
 * date : 2022-10-07
 * description : Arrays 의 유용한 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = { {11,12,13}, {21,22,23}};

//        배열을 값을 출력
//        Arrays : 자바에서 배열을 대표하는 클래스
//           유용한 함수들
//        사용법 : Arrays.toString(배열) -> 배열의 값이 보임
        System.out.println("arr=" + Arrays.toString(arr)); // 1차원 배열 값 보기
        System.out.println("arr2D=" + Arrays.deepToString(arr2D)); // 2차원 배열 값 보기

        System.out.println("------------- 배열 copy ---------------");

//        .copyOf(원본배열, 원본배열길이) : 리턴값이 복사본 배열
        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr의 전체 내용 copy
        int[] arr3 = Arrays.copyOf(arr, 3); // arr의 0 ~ 2번까지 copy
        int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // arr의 2번 ~ (4-1)번까지 copy

//        배열의 값 출력
        System.out.println("arr2=" + Arrays.toString(arr2));
        System.out.println("arr3=" + Arrays.toString(arr3));
        System.out.println("arr4=" + Arrays.toString(arr4));

//        배열을 어떤 값으로 채우기
        System.out.println("----------- 어떤 값 fill -----------");
        int[] arr7 = new int[5];

//        일정한 숫자로 모두 채우기
        Arrays.fill(arr7, 9); // arr7=[9,9,9,9,9]
        System.out.println("arr7=" + Arrays.toString(arr7));

        System.out.println("---- 배열 동등 비교 ------");
        System.out.println(Arrays.equals(arr, arr2)); // 1차원 배열 같으면 true

//        2차원 배열 동등 비교 (arr2D / arr2D2 )비교
        int[][] arr2D2 = { {11,12,13}, {21,22,23}};
        System.out.println(Arrays.deepEquals(arr2D, arr2D2)); // 2차원 배열 같으면 true

        System.out.println("------ sort/binarySearch -------");

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("chArr=" + Arrays.toString(chArr)); // 배열의 값 출력
        System.out.println("---- sort -----");
        Arrays.sort(chArr); // 오름차순 정렬
        System.out.println("chArr=" + Arrays.toString(chArr)); // 정렬된 배열 출력
        System.out.println("---- 이진탐색(Binary Search) ------");
        System.out.println("B의 인덱스번호 : " + Arrays.binarySearch(chArr, 'B'));

//        배열을 -> List 변환
        System.out.println("------- 배열을 리스트로 변환 ---------");
        List list = new ArrayList(Arrays.asList(1,2,3,4,5)); // 배열을 리스트로 변환
        list.add(6); // 값 추가
        System.out.println(list.toString()); // List 의 값 보기
    }
}









