package javafullstack.chap08.sec01;

/**
 * packageName : javafullstack.chap08
 * fileName : Audio
 * author : hyuk
 * date : 2022/09/30
 * description : 구현 클래스(자식클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Audio implements RemoteControl{
    private int volumn;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다");
    }

    @Override
    public void setVolumn(int volumn) {
//        속성 = 매개변수값
//        조건문 체크 : MAX_VOLUMN, MIN_VOLUMN
//        공유상수(상수) : 클래스명.상수명, 인터페이스명.상수명
        if (volumn > RemoteControl.MAX_VOLUMN){
            this.volumn = RemoteControl.MAX_VOLUMN;
        } else if (volumn < RemoteControl.MIN_VOLUMN){
            this.volumn = RemoteControl.MIN_VOLUMN;
        } else {
            this.volumn = volumn;
        }
//        this.volumn = volumn;
//        현재볼륨출력
            System.out.println("현재 오디오 볼륨 : " + this.volumn);

    }
}
