package javafullstack.chap11.sec01.exam19;

/**
 * packageName : javafullstack.chap11.sec01.exam19
 * fileName : BoxingApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Wrapper Class, Boxing/UnBoxing 예제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class BoxingApplication {
    public static void main(String[] args) {
//        ✅ 기본 자료형 : byte, short, int, long, double, float, char, string, boolean
//        ✅ 위의 기본 자료형을 객체로 변환해야 할 때가 있음
//        int 👉 Integer 객체 있음
//        double 👉 Double 객체 있음
//        boolean 👉 Boolean 객체 있음

//        기본자료형 👉 객체 변환 : Boxing
        Integer obj1 = new Integer(100); // 객체 정수형(Wrapper Class) 👉 옛날 방식
        Integer obj2 = 100; // 기본자료형 👉 객체 자동변환(AutoBoxing),요즘방식

//        객체 👉 기본자료형 : UnBoxing
        int value1 = obj1.intValue(); // 원복
        int value2 = obj2; // 자동 변환(객체 👉 기본자료형)


        System.out.println(obj1); // 100
        System.out.println(value1); // 100
        System.out.println(value2); // 100
    }
}
