package javafullstack.chap12.sec01.exam07;

/**
 * packageName : javafullstack.chap12.sec01.exam07
 * fileName : User1
 * author : hyuk
 * date : 2022/10/06
 * description : 작업쓰레드2 (상속받아 만듦)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class User2 extends Thread{
    public Calculator calculator;

//    setter
    public void setCalculator(Calculator calculator) {
        this.setName("User2"); // 쓰레드 이름 부여
        this.calculator = calculator;
    }

//    run() : 실행함수
    @Override
    public void run() {
        calculator.setMemory(100); // Calculator setter 호출
    }
}
