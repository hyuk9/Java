package javafullstack.chap07.verify.exam06;

/**
 * packageName : javafullstack.chap07.verify.exam06
 * fileName : StopGraphApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */

// 문제 : 다형성 예제 + 상속
//    아래 소스를 보고 Graph와 StockGraph 완성
// 디자인 패턴 : (Strategy(전략) 패턴)

public class StockGraphApplication {
    public static void main(String[] args) {
        StockGraph stockGraph = new StockGraph();
        Graph graph = new Graph();

        Report r = new Report();
        r.drawing(stockGraph);
        r.drawing(graph);
    }
}
