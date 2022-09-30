package javafullstack.chap07.verify.exam01;

/**
 * packageName : javafullstack.chap07.verify.exam01
 * fileName : Student
 * author : hyuk
 * date : 2022/09/30
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
// Q: 아래 자식 클래스 정보를 보고 부모 클래스 완성
public class Student extends Person{
    public void set(){
        age = 30; //부모 속성
        name = "장동혁"; //부모속성
        height = 175; // 부모속성
        setWeight(99); //부모함수


    }
}
