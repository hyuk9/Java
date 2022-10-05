package javafullstack.chap10.sec01.exam04;

/**
 * packageName : javafullstack.chap10.sec01.exam04
 * fileName : ClassCastApplication
 * author : hyuk
 * date : 2022/10/04
 * description : Class Cast Exception
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class ClassCastApplication {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog); // 가능

//        animal에는 Dog 변활할 수 없음
        Cat cat = new Cat();
        changeDog(cat); // 예외 발생 (Class Cast Exception
    }

//    공유함수
    public static void changeDog(Animal animal){
        Dog dog = (Dog)animal;
    }
}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}