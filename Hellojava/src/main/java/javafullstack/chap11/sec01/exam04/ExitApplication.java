package javafullstack.chap11.sec01.exam04;

/**
 * packageName : javafullstack.chap11.sec01.exam04
 * fileName : ExitApplication
 * author : hyuk
 * date : 2022/10/05
 * description : system의 함수들 exit()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class ExitApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
//                break; // 반복문 중단
                System.exit(i); // 프로그램 강제 종료(kill), 밑에 코드가 실행안됨
            }
        }
        System.out.println("마무리 코드"); // 이거 실행안됨
    }
}
