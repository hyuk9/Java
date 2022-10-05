package javafullstack.chap10.sec02.exam02;

/**
 * packageName : javafullstack.chap10.sec02.exam02
 * fileName : TryCatch2Application
 * author : hyuk
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class TryCatch2Application {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try{
//            인텔리제이 main의 매개변수값이 들어오지 않음
//            에러(예외)가 발생함
            data1 = args[0];
            data2 = args[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개변수 값이 부족합니다.");
//            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (NumberFormatException e){
            System.out.println("숫자로 변환할 수 없습니다");
//            예외처리와 상관없이 무조건 실행되는 블럭
        }finally {
            System.out.println("다시 실행하세요");
        }
    }
}
