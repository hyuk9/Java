package javafullstack.chap09.sec02.exam01;

/**
 * packageName : javafullstack.chap09.sec02.exam01
 * fileName : Anonymous
 * author : hyuk
 * date : 2022/10/04
 * description : 익명 클래스의 사용법
 * 💡 ======================== 요약 ==========================💡
 *      ✅ 익명 자식 객체 : 자식 클래스가 재사용되지않고, 특정 위치에서 1번만 사용될 경우
 *      자식 클래스를 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *      익명 객체 생성자는 만들지 않음
 *      ✅ 사용법 : 부모클래스 객체변수 = new 부모클래스(매개변수...){
 *                                  // 속성
 *                                  // 함수
 *                                }
 *      ✅ 익명 구현(자식) 객체 : 구현(자식) 클래스가 재사용되지않고, 특정 위치에서 1번만 사용될 경우
 *                          구현(자식) 클래스 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *      ✅ 사용법 : 인터페이스 인터페이스변수 = new 인터페이스(){
 *                                  // 재정의 함수
 *                                  // 속성
 *                                }
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public class Anonymous {
    //    ✅ 일반 속성에 익명 객체 사용
//  Composition(구성, 집합) 👉 다른 클래스를 속성처럼 사용, 상속이랑 비슷
//    💡 사용법 : {} 자식클래스고(이름없음) 앞에 부모클래스를 상속받음 💡
//    부모클래스 객체변수 = new 부모클래스(){}
    Person field = new Person() { // 익명 객체의 경우 Person이 부모, 중괄호 안이 자식객체 취급(이름이 없는 익명객체)
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    }; // 익명 객체로 만들 때 중괄호 뒤에 세미콜론 필요함‼️

//    함수의 로컬 변수에 사용가능
    void method1(){
//        로컬(지역) 변수값으로 익명 객체 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        }; // 세미콜론 사용해야함‼️
        localVar.wake(); // 지역변수(Person 객체)의 함수호출
    }

    void method2(Person person){
        person.wake();
    }
}
