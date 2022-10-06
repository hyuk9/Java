package javafullstack.chap13.sec02.exam01;

/**
 * packageName : javafullstack.chap13.sec02
 * fileName : Coin
 * author : hyuk
 * date : 2022/10/06
 * description :
 * 💡 ======================= 요약 ========================== 💡
 *          ✅ Stack : LIFO(후입선출) 구현클래스 (Stack 클래스)
 *          ✅ Queue : FIFO(선입선출) 인터페이스 (구현클래스 : LinkedList 사용)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
//    ✅ 모델(Model) : 데이터를 저장 또는 조회용도로 사용하는 클래스(객체)
//                  👉 속성 / 생성자 / Getter / Setter
//    ✅ 스택(Stack) : 자바에서 스택이라는 자료구조를 구현해 놓음
//                  👉 LIFO(Last In First Out) : 나중에 들어온 자료가 먼저 나가는 구조 (후입선출)
//                  ➡️ 주요 함수 : 1) .push(객체) : 주어진 객체를 스택에 넣기
//                              2) .pop() : 스택의 맨 위에 있는 객체를 꺼내서 제거함
//                              3) .peek() : 스택의 맨 위 객체의 정보를 조회, 제거하지 않음
//                  ➡️ 스택 응용 : 계산기 프로그램 (스택을 이용)
public class Coin {
//    ✅ 속성
    private int value;

//    ✅ 생성자
    public Coin(int value) {
        this.value = value;
    }

//    ✅ getter : 속성의 값을 조회하는 함수
    public int getValue() {
        return value;
    }

//    ✅ setter : 속성의 값을 저장하는 함수
    public void setValue(int value) {
        this.value = value;
    }
}