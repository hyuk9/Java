package javafullstack.chap09.sec02.exam03;

/**
 * packageName : javafullstack.chap09.sec02.exam03
 * fileName : Anonymous
 * author : hyuk
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Anonymous {
    private int field;

//    일반 함수내에서 지역변수로 익명객체 사용
    public void method(int arg1, int arg2){
//        지역변수, 매개변수 전부 상수
        int var1 = 0; // 👉 final 생략
        int var2 = 0; // 👉 final 생략

//        var1, var2, arg1, arg2 변경 👉 불가능
//        var1 = 1;
//        var2 = 2;
//        arg1 = 1;
//        arg2 = 2;

        field = 10; // 속성
//        지역변수 = new 부모인터페이스(){익명객체}
        Calculator calculator = new Calculator() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };
        System.out.println(calculator.sum()); // 익명객체의 함수 사용
    }
}
