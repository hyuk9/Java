package javafullstack.chap08.sec01.exam02;

/**
 * packageName : javafullstack.chap08.sec01.exam02
 * fileName : SmartTelevison
 * author : hyuk
 * date : 2022/09/30
 * description : 검색 기능이 있는 텔레비전
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class SmartTelevison implements RemoteControl, Searchable{
    private int volumn;

    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다");

    }

    @Override
    public void setVolumn(int volumn) {
//        속성 = 매개변수값
        if (volumn > MAX_VOLUMN){
            this.volumn = MAX_VOLUMN;
        } else if (volumn < javafullstack.chap08.sec01.exam01.RemoteControl.MIN_VOLUMN){
            this.volumn = javafullstack.chap08.sec01.exam01.RemoteControl.MIN_VOLUMN;
        } else {
            this.volumn = volumn;
        }
        //        현재볼륨출력
        System.out.println("현재 텔레비전 볼륨 : " + this.volumn);
    }

    @Override
    public void serch(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
