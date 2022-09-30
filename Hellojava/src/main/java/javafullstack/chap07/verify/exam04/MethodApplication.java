package javafullstack.chap07.verify.exam04;

/**
 * packageName : javafullstack.chap07.verify.exam04
 * fileName : ShapeApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */

// 결과 :
//    Line
//    Shape
//    Rect
//    Circle
public class MethodApplication {
    static void paint(Shape p){
        p.draw();
    }
    public static void main(String[] args) {
        Line line = new Line();

        paint(line); //
        paint(new Shape());
        paint(new Rect());
        paint(new Circle());

//        반복문 이용해서 쓰는 방법
        Shape[] shapes = new Shape[]{new Line(), new Shape(), new Rect(), new Circle()};
        for (Shape shape : shapes) {
            paint(shape);
        }
    }
}
