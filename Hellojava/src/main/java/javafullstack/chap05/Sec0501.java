package javafullstack.chap05;

/**
 * packageName : chap05
 * fileName : Sec0501
 * author : hyuk
 * date : 2022/09/26
 * description : 참조타입(자료형)
 * 요약 : 기본자료형 : byte, short(2byte 정수형), int, log, float, double, boolean
 *              => 스택 메모리 방에 값이 바로 저장
*       참고자료형 : 객체, 배열, 열거형(enum),
 *              => 스택방의 값에 방번호(주소)가 저장, 힙메모리방에 객체 값이 저장됨
 *      JVM(자바) 메모리 구조 : 메소드방(코드, 클래스, 함수, 생성자, 전역변수),
 *                          스택방(지역변수/매개변수),
 *                          힙방(객체, 배열, 열거형)
 *      비교연산자(==) : 참조자료형은 방번호(주소)를 비교,
 *                    기본자료형은 값을 비교함
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Sec0501 {
//    속성 생략(멤버 변수)

//    함수(멤버 메소드)
    public void stringEqualExample(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0501 stringEqualExample⭐️");
//        4가지 자료형 : int, double, String, Boolean
        int age = 25;
        double price = 100.5;
//        스택 방(LIFO : 마지막에 들어간 변수가 먼저 나옴) -> Last In First Out
//        주소 : 변수명 | 값
//        2번방 : price | 100.5
//        1번방 : age | 25

//        메모리에 어떻게 저장이 될까요?
//        어느 메모리 공간에 저장이 될까요?
//        코딩언어 : 프로그램을 개발 -> 메모리에 로딩(적재) 실행
//        파일 관리 : 01_HTML 폴더 : html 들어감
//                 02_Vue 폴더 : Vue 관련 파일이 들어감
//                 03_Java 폴더 : Java 파일 들어감
//        A, B, C 세분화해서 위에 처럼 각각 용도에 맞게 관리가 됨
//        메모리(호텔) : ⭐️스택방(기본자료형, 지역변수/매개변수),
//                    메소드방(프로그램 코드, 클래스 코드들, 전역변수(정적변수), 함수) : 공유
//                    ⭐️힙방(참조자료형, 객체, 배열)

//        참조자료형(객체) 살펴보기 => 힙방
//        자바에서 String 객체에서 strVar1, strVar2,...의 값이 같으면 무조건 방번호를 일치
//        String 객체 '=' 이용해서 만들면 힙방(String 위한 전용 방)에 생성
        String strVar1 = "신민철"; // 10번 저장
        String strVar2 = "신민철"; // 10번 저장

//        참조자료형의 메모리 관리
//        스택방                               힙방
//        주소 : 변수명 | 값                 주소: 값
//        1번방 : strVal1 | 10번 <------ 10번 : "신"
//                                     11번 : "민"
//                                     12번 : "철"
//        2번방 : strVal2 | 10번 <------


//        1) 참조 자료형일 경우(객체, 배열) 두 변수의 주소값(방번호)을 비교
//        2) 기본 자료형이면 두 변수의 값을 비교
        if(strVar1 == strVar2){
            System.out.println("strVar1 == strVar2 입니다.");
        }else {
            System.out.println("strVar1 != strVar2 입니다");
        }

        if (strVar1.equals(strVar2)){
            System.out.println("strVar1와 strVar2 문자열이 같음");
        }else {
            System.out.println("strVar1와 strVar2 문자열이 다름");
        }


//        이번에는 String 객체 생성 (new 이용) -> 힙 메모리 방에 생성 : String 제외하고는 전부 이런 형식
        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

//        스택방                            힙 메모리방
//        주소 : 변수명 | 값                 주소: 값
//        1번방 : strVal3 | 10번 <------ 1번 : "신"
//                                     2번 : "민"
//                                     3번 : "철"
//        2번방 : strVal4 | 10번 <------ 10번 : "신"
//                                     11번 : "민"
//                                     12번 : "철"

//        => : 방번지(주소)가 틀림(false)
        if(strVar3 == strVar4){
            System.out.println("strVar3 == strVar4 입니다.");
        }else {
            System.out.println("strVar3 != strVar4 입니다");
        }

        if (strVar3.equals(strVar4)){
            System.out.println("strVar3와 strVar4 문자열이 같음");
        }else {
            System.out.println("strVar3와 strVar4 문자열이 다름");
        }

//        자바 언어의 문제점 : null 포인트 예외(에러) -> 시도 때도 없이 나옴
//        python -> null 값이 있어도 언어자체에서 막아줌
//        1) null 포인트 에러(예외)
        int[] intArray = null;
        intArray[0] = 10; //null 포인트 에러 발생

//        2) null 포인트 에러
        String str = null;
        System.out.println("총 문자수 : " + str.length()); //null 포인트 에러 발생

//        String strVar3 = null;
//        String strVar4 = null;

//        아래 스택방 | 힙방 : 자바 gc(쓰레기 수집기, garbage collection) 일정 시점에
//        메모리에서 자동으로 제거함 -> 메모리에는 계속 데이터가 남아있어서 메모리 누수가 되기 때문!

        //        스택방                            힙 메모리방
//        주소 : 변수명 | 값                 주소: 값
//        1번방 : strVal3 | null        1번 : "신"
//                                     2번 : "민"
//                                     3번 : "철"
//        2번방 : strVal4 | null        10번 : "신"
//                                     11번 : "민"
//                                     12번 : "철"
    }
}
