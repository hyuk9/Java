package javafullstack.chap09.sec01.exam04;

/**
 * packageName : javafullstack.chap09.sec01.exam04
 * fileName : Outer
 * author : hyuk
 * date : 2022/10/04
 * description : 로컬(지역) 클래스에서 사용 제한
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Outer {
    public void method2(int arg){
//       ✅ 지역 변수 👉 지역 클래스가 있을 경우 상수로 변환됨
        int localVariable = 1; // final이 생략되어있음
//        localVariable = 100; // 이렇게하면 밑에 에러남 👉 중간에 값을 변경 불가 💡 상수로 자동 변환
//       ✅ 지역 클래스
        class Inner{
            public void method(){
                int result = arg+localVariable; // 가능
            }
        }
    }
}
