package javafullstack.chap07.sec02.exam02;

/**
 * packageName : javafullstack.chap07.sec02.exam02
 * fileName : HankookTire
 * author : hyuk
 * date : 2022/09/29
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class HankookTire extends Tire{
//    생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

//    재정의 함수 : 타이어 이름 => 한국 타이어로 수정
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " HankookTire: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
