package javafullstack.chap06.sec06.exam06;

/**
 * packageName : javafullstack.chap06.sec06.exam06
 * fileName : Car
 * author : hyuk
 * date : 2022/09/29
 * description : 접근 제한자(제어자) / Setter / Getter
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Car {
//    public : 공용, 모든 클래스에서 사용 허용
    // 다른 클래스에서는 사용 불가 (오직 자신의 클래스안에서만 사용 가능)
    private int speed;
    private boolean stop; // => boolean값에서 호출할땐 get대신 is씀

//    👉Setter / Getter
//    💡Getter 함수 : 속성의 값(정보)를 확인할 때 사용
//    ✅함수 명명법 : get속성명
    public int getSpeed(){
        return speed;
    }

//    💡Setter 함수 : speed 값을 수정하고 싶을 때 사용
//    ✅함수 명명법 : set속성명

    public void setSpeed(int speed){
        if (speed>0){
            this.speed = speed;
        }else {
            this.speed = 0;
        }
    }

//    Getter / Setter 자동화기능 이용해서 만들기 : cmd + n -> Getter/Setter
//    💡사용하는 목적 💡
//    객체지향에서는 속성은 다른 객체에서 사용하지 못하게 막고,
//    함수는 다른 객체에서 사용할 수 있도록 코딩 (캡슐화)
//    ex) 자동차의 속도는 음수가 나오면 안되는데 다른 객체에서 자동차.speed=-100;‼️
//        👉프로그램의 신뢰성 저하(무결성 깨짐)

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }


}
