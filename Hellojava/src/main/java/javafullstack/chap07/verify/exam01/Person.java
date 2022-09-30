package javafullstack.chap07.verify.exam01;

/**
 * packageName : javafullstack.chap07.verify.exam01
 * fileName : Person
 * author : hyuk
 * date : 2022/09/30
 * description : 부모 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
public class Person {
    static int age;
    static String name;
    static int height;

    static int weight;

    public static void setWeight(int weight) {
        Person.weight = weight;
    }

}
