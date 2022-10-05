package javafullstack.chap10.sec02.exam03;

/**
 * packageName : javafullstack.chap10.sec02.exam03
 * fileName : CatchByCatchApplication
 * author : hyuk
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class CatchByCatchApplication {
    public static void main(String[] args) {
        try {
//            값이 없음 : 에러(예외) 발생
//            아래 라인이 실행되지 않고, catch 블럭 감
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개변수의 수가 부족합니다");
        } catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}
