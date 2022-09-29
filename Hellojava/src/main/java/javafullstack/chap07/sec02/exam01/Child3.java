package javafullstack.chap07.sec02.exam01;

/**
 * packageName : javafullstack.chap07.sec02.exam01
 * fileName : Child
 * author : hyuk
 * date : 2022/09/29
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class Child3 extends Parents{
    @Override
    public void method2() {
        System.out.println("Child3-method2()");
    }
    public void method3() {
        System.out.println("Child3-method3()");
    }
}
