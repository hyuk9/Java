package javafullstack.chap06.sec05.exam04;

/**
 * packageName : javafullstack.chap06.sec05.exam04
 * fileName : SingletonApplication
 * author : hyuk
 * date : 2022/09/28
 * description : 공유 객체 테스트(주소(방번호) 같은지 비교)(참고)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class SingletonApplication {
    public static void main(String[] args) {
//        공유객체 만들기
//        getInstance() 공유함수 : 클래스명.함수명();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

//        같은 주소(방번호)를 갖는지 확인
        if (singleton1 == singleton2){
            System.out.println("같은 Singleton 객체입니다");
        }else {
            System.out.println("다른 Singleton 객체입니다");
        }
    }
}
