package javafullstack.chap08.sec01.exam04;

/**
 * packageName : javafullstack.chap08.sec01.exam04
 * fileName : SoundableApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class SoundableApplication {
//    공유함수
    static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat()); //야옹
        printSound(new Dog()); //멍멍
    }
}
