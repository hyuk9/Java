package javafullstack.chap08.sec01.exam04;

/**
 * packageName : javafullstack.chap08.sec01.exam04
 * fileName : Cat
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Cat implements Soundable{
    @Override
    public String sound() {
        return "야옹";
    }
}
