package javafullstack.chap10.sec01.exam02;

/**
 * packageName : javafullstack.chap10.sec01.exam02
 * fileName : OutOfBoundApplication
 * author : hyuk
 * date : 2022/10/04
 * description : Array Index Out Of Bound 예외
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */

public class OutOfBoundApplication {
    public static void main(String[] args) {
//        OutOfBoundApplication 1 2 ...
//        배열에 인덱스에 해당하는 값이 없는데 접근하면 발생하는 예외
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]" + data1);
        System.out.println("args[1]" + data2);
    }
}
