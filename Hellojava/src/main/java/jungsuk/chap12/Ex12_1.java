package jungsuk.chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * packageName : jungsuk.chap12
 * fileName : Ex12_1
 * author : hyuk
 * date : 2022/10/11
 * description : Generics <제한할 자료형> : 객체의 자료형을 제한할 목적으로 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */

class Product{} // 부모 클래스

class Tv extends Product{
    String name = "동성 Tv";

//    속성의 값을 반환하는 함수
    public String getName() {
        return name;
    }

//    intellij에서 만들어준 코드(재정의)
//    .equal()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(name, tv.name);
    }

//    .hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class Audio extends Product{
    String name = "동성 Audio";

//    Getter
    public String getName() {
        return name;
    }

//    .equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return Objects.equals(name, audio.name);
    }

//    .hashcode()
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Ex12_1 {
//    실행 함수
    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();
//        ArrayList<Product> productArrayList = new ArrayList<Product>(); 👉 뒤에 제네릭 안에는 생략가능
        ArrayList<Tv> tvArrayList = new ArrayList<>();
//        ArrayList<Product> tvList = new ArrayList<Tv>(); // 👉 제네릭은 다형성 안됨, 에러남‼️
        List<Tv> tvList2 = new ArrayList<>(); // 👉 이 다형성은 가능

//        .add() : 자료형이 Product 뿐만 아니라 자식클래스도 가능
        productArrayList.add(new Tv());
        productArrayList.add(new Audio());

//        tv의 속성 / audio 속성 출력
//        강제 형변환 : 원복
        Tv tv = (Tv)productArrayList.get(0);
        Audio audio = (Audio)productArrayList.get(1);

        System.out.println("list 0번 : " + tv.name);
        System.out.println("list 1번 : " + audio.name);

//        Tv 자식클래스 제네릭 걸린 ArrayList
        tvArrayList.add(new Tv());
        tvArrayList.add(new Tv());

//        공유함수의 매개변수로 전달
        printAll(productArrayList);
//        printAll(tvArrayList); // 제네릭이 걸린 매개변수에 전달 못함, 에러남‼️
    }

//    공유 함수
    public static void printAll(ArrayList<Product> list){
        for (Product p:
             list) {
            System.out.println(p);
        }
    }
}

