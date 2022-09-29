package javafullstack.chap07.sec03.exam02;

/**
 * packageName : javafullstack.chap07.sec03.exam02
 * fileName : Cat
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Cat extends Animal{
    public Cat() {
        this.kind = "포유류";
    }

//    추상함수 구현(재정의)
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
