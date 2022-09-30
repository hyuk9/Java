package javafullstack.chap07.verify.exam02;

/**
 * packageName : javafullstack.chap07.verify.exam02
 * fileName : ShowPoint
 * author : hyuk
 * date : 2022/09/30
 * description : 부모
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Point {
    int value1;
    int value2;

    void showPoint(){
        System.out.println("(" + value1 +","+ value2+")");
    }

    void set(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
}
