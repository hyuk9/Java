package javafullstack.chap07.verify.exam05;

/**
 * packageName : javafullstack.chap07.verify.exam05
 * fileName : OverridingApplication
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */
// 기본 무기의 살상 능력은 1
//    데포의 살상 능력은 10
public class OverridingApplication {
    public static void main(String[] args) {
//        부모클래스 호출
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

//        자식클래스 호출
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());

    }
}
