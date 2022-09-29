package javafullstack.chap07.sec02.exam02;

/**
 * packageName : javafullstack.chap07.sec02.exam02
 * fileName : Tire
 * author : hyuk
 * date : 2022/09/29
 * description : 부모 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Tire {
    //필드
    public int maxRotation;     			//최대 회전수(최대 수명)
    public int accumulatedRotation;		//누적 회전수
    public String location;       			//타이어의 위치

    //생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //메소드
    public boolean roll() {
        ++accumulatedRotation; // 현재 얼마나 타이어가 회전되었는가 속성(현재 회전수)
//        타이어가 최대회전수에 도달하면 펑크나고(리턴값:false), 아니면 현재회전수를 출력(리턴값:true)
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }
}
