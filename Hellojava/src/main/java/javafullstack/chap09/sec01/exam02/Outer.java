package javafullstack.chap09.sec01.exam02;

/**
 * packageName : javafullstack.chap09.sec01.exam02
 * fileName : Outer
 * author : hyuk
 * date : 2022/10/04
 * description : 중첩 클래스의 공유 객체, 일반 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Outer {
//    ✅ 일반 속성 = 일반 중첩 클래스의 객체
    Attr attr = new Attr();
    Share share = new Share();

//    ✅ 일반 함수
    void method1(){
//      지역변수 : 함수 안에서만 사용되고 {}밖으로 나갈 수가 없는 변수
        Attr attr = new Attr();
        Share share = new Share();
    }

//    ✅ 공유 변수
//    static Attr attr3 = new Attr(); // 👉 불가능
    static Share share3 = new Share(); // 가능

//    ✅ 공유 함수
    static void method2(){
//        지역변수
//        Attr attr3 = new Attr(); // 👉 불가능
        Share share3 = new Share(); // 가능
    }


//    ✅ 일반 중첩 클래스
    class Attr{}

//    ✅ 공유 중첩 클래스
    static class Share{}

}
