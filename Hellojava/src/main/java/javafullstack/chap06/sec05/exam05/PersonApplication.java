package javafullstack.chap06.sec05.exam05;

/**
 * packageName : javafullstack.chap06.sec06
 * fileName : PersonApplication
 * author : hyuk
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         hyuk          최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("1234567-1234567", "장동혁");
        System.out.println(person.nation); // 상수출력
        System.out.println(person.ssn); //
        System.out.println(person.name); //

        person.name = "강감찬";
//        person.nation = "CANADA"; // 👉 상수라서 변경불가‼️

    }
}
