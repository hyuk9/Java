package javafullstack.chap06.sec04.exam03;

/**
 * packageName : javafullstack.chap06.sec04.exam03
 * fileName : Car
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
// gas 체크해서 차가 출발을 합니다.
//    gas 있으면 출발합니다
//    .run() 실행 // gas--;
//    다시 gas >0체크 "gas를 주입할 필요가없습니다"
//    else
public class Car {
    int gas;

//    gas의 속성을 저장하는 함수
    void setGas(int gas){
        this.gas = gas;
    }

//    1)
    boolean isLeftGas(){
//        조건문
        if (gas ==0){
            System.out.println("gas가 없습니다");
            return false;
        }else {
            System.out.println("gas가 있습니다");
            return true;
        }
    }

    void run(){
        while (true) {
//            gas>0 달립니다 gas잔량 :5
//            else 멈춥니다 gas잔량 :0

            if (gas>0){
                System.out.println("달립니다 (gas잔량 : " + this.gas + ")");
                this.gas--;
            }else {
                System.out.println("멈춥니다 (gas잔량 : " + this.gas + ")");
                break;
            }
        }
    }

}
