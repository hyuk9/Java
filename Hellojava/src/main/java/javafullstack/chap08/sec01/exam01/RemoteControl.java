package javafullstack.chap08.sec01.exam01;

/**
 * packageName : javafullstack.chap08
 * fileName : RemoteControl
 * author : hyuk
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         hyuk          최초 생성
 */

// ✅ 인터페이스 : 추상 클래스와 비슷, 내부에 정의되는 함수 전부 추상함수 => 추상함수의 집합
//              ‼️일반함수는 정의할 수 없음‼️
//      ✅ 함수 : 전부 추상함수
//      ✅ 속성 : 전부 상수(공유상수)
//      ✅ 목적 : 명명규칙 일반화, 표준화, 다형성 활용하기 위한 목적으로 생성
//    구현 클래스(자식 클래스)
public interface RemoteControl {
    // 상수(공유상수) 👉 static final 생략됨
    int MAX_VOLUMN = 10; // 리모콘의 최대볼륨 크기
    int MIN_VOLUMN = 1; // 리모콘의 최저볼륨 크기

//    ✅ 함수 만들기 : 추상함수들 👉 abstract 생략됨
//    ✅ 추상함수 : 실행블럭{}이 없음
    void turnOn(); // 리모콘 켜기 함수
    void turnOff(); // 리모콘 끄기 함수
    void setVolumn(int volumn); // 볼륨 조정 함수
}
