package javafullstack.chap07.verify.exam03;

/**
 * packageName : javafullstack.chap07.verify.exam03
 * fileName : Calculator
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public abstract class Calculator {
    //    두 정수의 합을 구하여 리턴
    public abstract int add(int a, int b);

    //    두 정수의 차를 구하여 리턴
    public abstract int subtract(int a, int b);

    // 배열에 저장된 정수의 평균을 구해 실수로 리턴
    public abstract double average(int[] a);

}