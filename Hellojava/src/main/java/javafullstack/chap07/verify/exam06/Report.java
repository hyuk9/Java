package javafullstack.chap07.verify.exam06;

/**
 * packageName : javafullstack.chap07.verify.exam06
 * fileName : Report
 * author : hyuk
 * date : 2022/09/30
 * description : 전략 클래스(매개변수의 다형성 구현한 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Report {
    public void drawing(Graph graph){
        graph.draw();
    }
    public void drawing(StockGraph graph){
        graph.draw();
    }
}
