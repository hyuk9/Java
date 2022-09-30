package javafullstack.chap07.verify.exam03;

/**
 * packageName : javafullstack.chap07.verify.exam03
 * fileName : GoodCalc
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class GoodCalc extends Calculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        double sum =0;
        for (int i : a) {
            sum += i;
        }
        return sum/a.length;
    }
}
