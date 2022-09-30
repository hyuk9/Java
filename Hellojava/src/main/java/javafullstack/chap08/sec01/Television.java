package javafullstack.chap08.sec01;

/**
 * packageName : javafullstack.chap08
 * fileName : Television
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Television implements RemoteControl{
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
        if (volumn > RemoteControl.MAX_VOLUMN){
            this.volumn = RemoteControl.MAX_VOLUMN;
        } else if (volumn < RemoteControl.MIN_VOLUMN){
            this.volumn = RemoteControl.MIN_VOLUMN;
        } else {
            this.volumn = volumn;
        }
        //        현재볼륨출력
        System.out.println("현재 텔레비전 볼륨 : " + this.volumn);
    }
}
