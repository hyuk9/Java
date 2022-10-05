package javafullstack.chap09.sec01.exam06;

/**
 * packageName : javafullstack.chap09.sec01.exam06
 * fileName : ButtonApplication
 * author : hyuk
 * date : 2022/10/04
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class ButtonApplication {
    public static void main(String[] args) {
        Button button = new Button();

//        ✅ 다형성 : 함수 호출 모양은 같은데 결과가 달라지는 것
        button.setOnListener(new CallListener());
        button.touch(); //CallListioner의 재정의된 onClick() 함수가 실행

        button.setOnListener(new MessageListener());
        button.touch(); //MessageListener의 재정의된 onClick() 함수가 실행
    }
}
