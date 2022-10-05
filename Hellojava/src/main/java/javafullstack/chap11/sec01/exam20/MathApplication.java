package javafullstack.chap11.sec01.exam20;

/**
 * packageName : javafullstack.chap11.sec01.exam20
 * fileName : MathApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 수학함수들 .Math() 객체의 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class MathApplication {
    public static void main(String[] args) {
//        ✅ Math.abs(숫자) : 절대값 구하기 (음수 👉 양수)
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);

        System.out.println("v1 : " + v1);
        System.out.println("v2 : " + v2);

//        ✅ Math.ceil(숫자) : 수학에서 소수점 올림 함수
        double v3 = Math.ceil(5.3); // 6.0
        double v4 = Math.ceil(-5.3); // -5.0
        System.out.println("v3 : " + v3);
        System.out.println("v4 : " + v4);

//        ✅ Math.ceil(숫자) : 수학에서 소수점 내림 함수
        double v5 = Math.floor(5.3); // 5.0
        double v6 = Math.floor(-5.3); // -6.0
        System.out.println("v5 : " + v5);
        System.out.println("v6 : " + v6);

//        ✅ Math.max(a, b) : 두 수의 최대값 구하기
        int v7 = Math.max(5,9); // 9
        double v8 = Math.max(5.3, 2.5); // 5.3
        System.out.println("v7 : " + v7);
        System.out.println("v8 : " + v8);


//        ✅ Math.min(a, b) : 두 수의 최소값 구하기
        int v9 = Math.min(5,9); // 5
        double v10 = Math.min(5.3, 2.5); // 2.5
        System.out.println("v9 : " + v9);
        System.out.println("v10 : " + v10);


//        ✅ Math.random() : 아무 숫자 (0 ≤ x < 1)
        double v11 = Math.random();
        System.out.println(v11);

//        ✅ Math.round(숫자) : 실수 반올림
        long v14 = Math.round(5.3); // 5
        long v15 = Math.round(5.7); // 6
        System.out.println("v14 : " + v14);
        System.out.println("v15 : " + v15);

//        ✅ 세째자리에서 반올림 : 100을 곱해서 반올림하고 다시 100 나누기를 하면 됨 👉 자바에서 따로 지원을 하지 않아서 일종의 편법같은 느낌
        double value = 12.3456; // 세째자리에서 반올림 : 12.35
        double temp = value*100; // 1234.56
        double temp2 = Math.round(temp); // 1235
        double v16 = temp2/100.0; // 12.35

        System.out.println("v16 : " + v16);
    }
}
