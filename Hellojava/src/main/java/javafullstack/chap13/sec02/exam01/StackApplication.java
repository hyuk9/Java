package javafullstack.chap13.sec02.exam01;

import java.util.Stack;

/**
 * packageName : javafullstack.chap13.sec02
 * fileName : StackApplication
 * author : hyuk
 * date : 2022/10/06
 * description : Stack을 이용한 동전 케이스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */
// ✅ Stack : 구현 클래스
public class StackApplication {
    public static void main(String[] args) {
//        ➡️ 스택 객체 생성
        Stack<Coin> coinStack = new Stack<>();

//        ➡️ Coin coin = new Coin(100); 👉 계속해서 쓰면 객체가 늘어나서 그냥 바로 스택에 집어넣음
//        ➡️ Coin 객체가 Stack 4개가 들어감
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10)); // 먼저나옴 👉 LIFO 때문

//        ➡️ 스택객체.isEmpty() : 스택에 자료가 있는지 없는지 확인, 하나도 없으면 true,
//                             하나라도 있으면 false
        while(!coinStack.isEmpty()){
            Coin coin = coinStack.pop(); // 스택에서 한개(Coin 객체) 꺼내기
//            ➡️ coin.getValue() : Coin 객체의 getter 함수 ( 명명법 : get속성명() )
            System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
        }
    }
}
