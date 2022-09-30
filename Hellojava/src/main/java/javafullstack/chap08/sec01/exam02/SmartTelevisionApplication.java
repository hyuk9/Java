package javafullstack.chap08.sec01.exam02;

/**
 * packageName : javafullstack.chap08.sec01.exam02
 * fileName : SmartTelevisionApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class SmartTelevisionApplication {
    public static void main(String[] args) {
        SmartTelevison smartTelevison = new SmartTelevison();

        RemoteControl rc = smartTelevison;
        Searchable searchable = smartTelevison;

        rc.turnOn();
        rc.setVolumn(10);
        searchable.serch("www.google.com");
        rc.turnOff();

    }
}
