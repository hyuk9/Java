package javafullstack.chap10.sec01.exam03;

/**
 * packageName : javafullstack.chap10.sec01.exam03
 * fileName : NumberFormatApplication
 * author : hyuk
 * date : 2022/10/04
 * description : Number Format Exception (숫자 형태가 잘못될 경우 발생)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1); // 100숫자로 바뀜
//        숫자로 바꿀 수 없는 값을 강제 변활할 경우 발생
        int value2 = Integer.parseInt(data2); // a100 숫자로 바뀔 수가 없음

        int result = value1 + value2;
        System.out.println(data1 + " + " + data2 + " = " + result);
    }
}
