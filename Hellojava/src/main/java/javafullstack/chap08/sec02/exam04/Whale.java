package javafullstack.chap08.sec02.exam04;

/**
 * packageName : javafullstack.chap08.sec02.exam04
 * fileName : Whale
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Whale implements Swimable{
    @Override
    public void swim() {
        System.out.println("고래 수영 중.. 이프!");
    }
}
