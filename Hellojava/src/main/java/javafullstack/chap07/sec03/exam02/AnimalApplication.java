package javafullstack.chap07.sec03.exam02;

/**
 * packageName : javafullstack.chap07.sec03.exam02
 * fileName : AnimalApplication
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class AnimalApplication {
    public static void main(String[] args) {
//        자식 객체들 생성
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        System.out.println("---------------");

//        다형성을 이용해서 animal.sound() 출력
        Animal animal = null;
        //멍멍
        animal = new Dog();
        animal.sound();
        //야옹
        animal = new Cat();
        animal.sound();

        System.out.println("---------------");


//        매개변수의 다형성

        animalSound(dog);
        animalSound(cat);
    }
//    공유함수
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
