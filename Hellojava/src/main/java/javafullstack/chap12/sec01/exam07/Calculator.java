package javafullstack.chap12.sec01.exam07;

/**
 * packageName : javafullstack.chap12.sec01.exam07
 * fileName : Calculator
 * author : hyuk
 * date : 2022/10/06
 * description : 공유 객체 (2개의 쓰레드에서 공유함수 호출)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
public class Calculator {
    private int memory;

//    ✅ getter : 속성의 값을 조회하는 함수
    public int getMemory() {
        return memory;
    }

//    ✅ setter : 속성의 값을 저장하는 함수
//    각각의 쓰레드에서 호출하는 함수
//    ✅ synchronized : 동기화 문제 해결하는 키워드(임계영역)
//    속도저하 (1개의 쓰레드가 사용완료할 때 까지 다른 쓰레드 대기)
public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초 지연
        } catch (Exception e){
//
        }
//          ✅ Thread.currentThread().getName() : 현재 실행되는 쓰레드의 이름 가져오기
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}
