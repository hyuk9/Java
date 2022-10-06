package javafullstack.chap13.sec01.exam06;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName : javafullstack.chap13.sec01.exam06
 * fileName : HashTable
 * author : hyuk
 * date : 2022/10/06
 * description : 아이디와 비밀번호 검사하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         hyuk          최초 생성
 */

//    ✅ Map : 인터페이스, 구현 클래스 (HashMap, HashTable)
//    ✅ HashTable : 멀티쓰레드 (프로그램 내에서 각각 비동기적으로 실행되는 것)
//    ✅ 동기화 문제 : 프로그램 순서가 바뀔 경우 이상한 결과가 나오는 것
//    ✅ HashMap == HashTable

public class HashTable {
    public static void main(String[] args) {
//        ✅ <> : 제네릭(지네릭 Generic), 객체타입제한
        Map<String, String> map = new Hashtable<>();

//        ✅ 아이디와 비밀번호 미리 저장 : (키, 값) 자료구조
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("autumn", "1234");
        map.put("winter", "12345");

//        ✅ 키보드 입력 : System.in (키보드)
//        💡 참고 : System.out (모니터)
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.print("아이디 : ");
//            한줄 입력받기 : id값
            String id = scanner.nextLine();

            System.out.print("비밀번호 : ");
//            비밀번호 입력받기
//            ✅ .nextLine() : 한줄입력받기
//            ✅ .next : 공백을 기준으로 한단어 입력받기
            String pw = scanner.nextLine();
            System.out.println(); // 줄바꿈

//            아이디와 키가 존재하는 확인
//            ✅ .containsKey(키값) : 키가 있으면 true, 없으면 false 리턴
            if (map.containsKey(id)){
//                아이디에 키값이 존재
//                .get(키) : return값(결과값) map의 값이 나옴
                if (map.get(id).equals(pw)){
                    System.out.println("로그인 되었습니다");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다");
            }
        }
    }
}
