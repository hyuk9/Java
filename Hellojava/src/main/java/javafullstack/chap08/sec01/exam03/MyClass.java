package javafullstack.chap08.sec01.exam03;

/**
 * packageName : javafullstack.chap08.sec01.exam03
 * fileName : MyClass
 * author : hyuk
 * date : 2022/09/30
 * description : 내 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class MyClass {
    RemoteControl remoteControl;

    public MyClass(RemoteControl remoteControl){
        this.remoteControl = remoteControl;

//        리모콘 켜기
        remoteControl.turnOn();
//        볼륨 조절 기능
        remoteControl.setVolumn(7);


    }

////    다형성을 이용하지 않으면 아래와 같이 코드 작성해야함
//    public MyClass(Television television){
////        this.remoteControl = remoteControl;
//
////        리모콘 켜기
//        television.turnOn();
////        볼륨 조절 기능
//        television.setVolumn(7);
//
//
//    }
}
