package javafullstack.chap07.sec03.exam01;

/**
 * packageName : javafullstack.chap07.sec03.exam01
 * fileName : SmartPhone
 * author : hyuk
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         hyuk          최초 생성
 */
public class SmartPhone extends Phone{
//    생성자

    public SmartPhone(String owner) {
        super(owner);
    }

    //    인터넷 검색함수
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다");
    }
}
