package javafullstack.chap07.verify.exam02;

/**
 * packageName : javafullstack.chap07.verify.exam02
 * fileName : ColorPoint
 * author : hyuk
 * date : 2022/09/30
 * description : 자식
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class ColorPoint extends Point {
    String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.print(color); // 색깔 출력
        showPoint(); // 부모클래스의 함수 호출 (3,4)
    }
}

