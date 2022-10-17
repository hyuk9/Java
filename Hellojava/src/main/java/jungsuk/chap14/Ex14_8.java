package jungsuk.chap14;

import java.util.Optional;

/**
 * packageName : jungsuk.chap14
 * fileName : Ex14_8
 * author : hyuk
 * date : 2022/10/11
 * description : Optional 사용하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
public class Ex14_8 {
    public static void main(String[] args) {
//        Optional : null 방지 클래스
//        null point exception 너무 많이 발생 👈 자바 문제점 👉 Optional 클래스
//        기본 자료형 int 👉 Wrapper 클래스 👉 Integer(정수 객체)
//        String객체 👉 Wrapper 클래스 👉 Optional<String> : null 방지
//        ✅ Optional.of(값) : Optional 객체에 값 넣기
        Optional<String> optStr = Optional.of("abcde"); // abcde 문자열 객체 생성
//        Optional 값을 가져오기
        System.out.println("optStr : " + optStr.get());
        System.out.println("========================");

        Optional optional = Optional.of(0); // 0을 저장
        Optional optional2 = Optional.empty(); // 빈값 저장

//        Optional 안에 객체(값)가 있는지 없는지 체크
        System.out.println(optional.isPresent()); // 있으면 true
        System.out.println(optional2.isPresent()); // 있으면 false ‼️뭐지
        System.out.println("========================");

        System.out.println(optional.get()); // 값 가져오기
//        System.out.println(optional2.get()); // 값 가져오기, 에러발생
        System.out.println(optional2.orElse("없음"));

//        String str = null;
//        System.out.println(str.length());
//        if (str == null){
////            이걸 넣기 싫어서 optional을 씀
//        }
    }
}


