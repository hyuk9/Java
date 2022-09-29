package javafullstack.chap07.sec01.exam01;

/**
 * packageName : javafullstack.chap07.exam01
 * fileName : DmbCellPhoneApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class DmbCellPhoneApplication {
    public static void main(String[] args) {
//        dmb 탑재 핸드폰 객체
        DmbCellphone dmbCellphone = new DmbCellphone("자바", "검정", 10);
//        상속받은 속성 출력하기
        System.out.println("모델 : " + dmbCellphone.model);//부모속성 : model
        System.out.println("색상 : " + dmbCellphone.color);//부모속성 : color
//        본인속성 출력하기
        System.out.println("채널 : " + dmbCellphone.channel);//본인속성

//        상속받은 함수 출력하기
        dmbCellphone.powerOn();
        dmbCellphone.bell();
        dmbCellphone.sendVoice("여보세요");
        dmbCellphone.receiveVoice("안녕하세요~ 반갑습니다");
        dmbCellphone.hangUp();
        dmbCellphone.powerOff();

        dmbCellphone.turnOnDmb();
        dmbCellphone.changeChannelDmb(123);
        dmbCellphone.turnOffDmb();
    }
}
