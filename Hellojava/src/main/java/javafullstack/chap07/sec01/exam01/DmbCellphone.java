package javafullstack.chap07.sec01.exam01;

/**
 * packageName : javafullstack.chap07.exam01
 * fileName : DmbCellphone
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
//  💡사용법 : public class 자식클래스명 extends 부모클래스명{}
public class DmbCellphone extends Cellphone{
//    String model, String color속성은 상속받으므로 정의할 필요❌
    int channel; // tv 채널 속성
//    powerOn(), powerOff(),bell() ... 정의할 필요없음‼️

//    생성자 만들기 : cmd + n

//    매개변수 3개짜리 생성자
    public DmbCellphone(String model, String color, int channel) {
        this.model = model; // 부모속성 = 매개변수값
        this.color = color; // 부모속성 = 매개변수값
        this.channel = channel;

    }

    //    tv 수신을 시작하는 함수
    void turnOnDmb(){
        System.out.println("채널 : " + channel + "번 방송 수신을 시작합니다");
    }
//    채널 바꾸기 함수
    void changeChannelDmb(int channel){
//        속성 = 매개변수값
        this.channel = channel;
        System.out.println("채널 : " + channel + "번으로 바꿉니다");
    }

//    tv 수신을 멈추는 함수
    void turnOffDmb(){
        System.out.println("수신을 멈춥니다");
    }

}
