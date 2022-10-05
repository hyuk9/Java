package javafullstack.chap13.sec01.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : javafullstack.chap13.sec01.exam01
 * fileName : ArrayApplication
 * author : hyuk
 * date : 2022/10/05
 * description : 컬렉션 프레임워크 (자바에서 사용하는 자료구조들)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
// List : 인터페이스, 배열을 모방해서 개선한 자료구조,
//      구현(자식) 클래스 : ArrayList⭐️⭐️⭐️⭐️⭐️, Vector, LinkedList 등
//    ✅ List 특징 : 인덱스를 사용하고(순서가 있음), 중복저장가능
//    ✅ 배열의 단점 : 자동으로 크기 증가 되지 않음(개선)
//    ✅ List 자료구조 : 배열과 유사하고 자동으로 크기 증가함
//    ✅ ArrayList 단점 : 중간에 추가/삭제되면 한칸씩 밀리거나 당겨짐(속도저하)
//    ✅ ArrayList객체.add(객체) : 추가함수
//    ✅ ArrayList객체.get(인덱스번호) : 인덱스번호에 해당하는 자료 조회하기
public class ArrayApplication {
    public static void main(String[] args) {
//        ✅ 다형성 : 인터페이스(부모) 변수명 = new 구현클래스();
//        ✅ list 객체 👈 ArrayList, Vector, LinkedList
//        ✅ <제한할 자료형>(제네릭) : 객체 자료형을 제한하기 위해서 사용
        List<String> list = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>(); 👈 이거보단 위에 방식이 향후에 바꿔쓰기 좋음

//        개선된 배열 : ArrayList
//        객체.add(문자열) : 개선된 배열에 자료 생성하는 함수
        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
//        JPA(Java Persistence API) / myBATIS : JPA(단순 질의) + myBatis(복잡한 질의)
        list.add("myBATIS"); // Springboot framework 데이터베이스와 연결하기 위한 용도의 프레임워크

//        배열 크기 가져오기
        int size = list.size();
        System.out.println("총 객체수 : " + size);
        System.out.println();

//        2번째 자료 가져오기
        String skill = list.get(2);
        System.out.println();

//        ArrayList 안의 자료 모두 출력하기
        for (int i = 0; i < list.size(); i++) {
//            객체.get(인덱스번호) : 인덱스 번호에 해당하는 자료 조회하기(검색하기)
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

//        삭제하기
//        객체.remove(인덱스번호) : 배열의 인덱스번호에 해당하는 자료 삭제하기
//        ArrayList : 중간에 삭제되면 뒤에 자료가 그 공간으로 자동 당겨짐
//                    중간에 추가되면 뒤에 한칸씩 밀림
        list.remove(2);
        list.remove(2);
        list.remove("myBATIS");
    }
}
