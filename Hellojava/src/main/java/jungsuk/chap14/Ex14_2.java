package jungsuk.chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * packageName : jungsuk.chap14
 * fileName : Ex14_2
 * author : hyuk
 * date : 2022/10/11
 * description : 람다와 스트림(*) (함수형 프로그래밍이 언어 차용한 문법)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         hyuk          최초 생성
 */
//    ✅ 람다식(화살표함수) 사용할 수 있는 경우 : 1) 함수형 인터페이스에 사용가능
//                                      2) 익명객체를 사용할 때
public class Ex14_2 {
    //    제네릭 함수 : 제네릭을 매개변수에 사용하는 함수, 반환타입 앞에 <T>를 붙임
    //    제네릭 함수 : static <T> 반환타입 함수명(매개변수타입 매개변수명...) {}
    //    1~100까지 중 10개의 랜덤 숫자 넣기
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }

    //    List에 저장된 요소의 값이(i) 짝수인것만 화면에 출력
    static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        for (T i: list) {
            if(p.test(i)) { // 람다식은 함수 이름이 없으므로 p의 람다식을 대리해서 사용
                c.accept(i); // 람다식은 함수 이름이 없으므로 c의 람다식을 대리해서 사용
            }
        }
        System.out.println(); // 줄바꿈
    }
    //    1의 자리를 없앤 새로운 배열을 만들어서 List에 저장(1의 자리는 0으로 변경)
    //    ✅ 제네릭 함수 : 함수의 리턴값 앞에 <T>, 제네릭 표현식을 사용하는 함수

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i: list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    public static void main(String[] args) {
//        ✅ 함수형 인터페이스 : 모든 코딩은 함수로 코딩한다.(매개변수, 리턴값) (철학)
//        클로저 언어(제일 인기있는 함수형 프로그래밍 언어) 👉 우리나라는 아직 ❌ : 통신(AT&T)
//        ex) 함수().함수2().함수3()
//        ✅ Runnable 함수 : 매개변수와 반환값이 없는 함수 ex) void run()
//        ✅ Supplier 함수 : 매개변수는 없고, 반환값만 있는 함수 ex) T get()
//        ✅ Consumer 함수 : 매개변수는 있고, 반환값이 없는 함수 ex) void accept(T t)
//        ✅ Function 함수 : 일반적인 함수, 매개변수와 반환값이 있는 함수 ex) T apply(T t)
//        ✅ Predicate 함수 : 매개변수가 있고, 반환값이 boolean값으로 리턴하는 함수 ex) boolean test(T t)

        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1 ~ 100까지 랜덤수 함수
        Consumer<Integer> c = i -> System.out.println(i + ", "); // i + ", " 출력 함수
        Predicate<Integer> p = i -> i%2 == 0; // 2의 배수만 리턴하는 함수
        Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앰 ex) 97 -> 90

        List<Integer> list = new ArrayList<>();
//        공유함수
        makeRandomList(s,list);
        System.out.println(list); // 1~100중에 10개의 랜덤숫자가 나옴
        System.out.println("=================================");
        printEventNum(p,c,list);
        System.out.println("=================================");
        List<Integer> newList = doSomething(f,list);
        System.out.println(newList);
    }
}
