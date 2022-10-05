package javafullstack.chap10.sec01.exam01;

/**
 * packageName : javafullstack.chap10.sec01.exam01
 * fileName : NullApplication
 * author : hyuk
 * date : 2022/10/04
 * description : null point exception(널 예외처리)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
//    예외 : == 에러
//    예외처리 : == 에러처리 잘하는 방법을 배우는 법
public class NullApplication {
    public static void main(String[] args) {
        String data = null;
//        변수 값이 null이면 속성이나 함수를 부를 수 없음
//        예외 : nullpointexception
//        String data = ""; 👉 에러 발생❌
        System.out.println(data.toString()); // 에러 발생
    }
}
