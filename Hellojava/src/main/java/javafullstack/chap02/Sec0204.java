package javafullstack.chap02;

/**
 * packageName : chap02
 * fileName : Sec0204
 * author : hyuk
 * date : 2022/09/23
 * description : 클래스(객체 정의) 설명
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         hyuk          최초 생성
 * 날짜 적고            누가썼고            메모하기
 * 2022/09/23         hyuk          exam01() 함수추가
 */
public class Sec0204 {
//    속성(멤버 변수)
//    exam01()
    public void exam01(){
        int value = 123;
//        sout: 줄바꿈 출력
        System.out.println("⭐️Sec0204 exam01⭐️");
        System.out.println(value);
//        포맷에 맞추어서 출력하는 함수 : printf() -> 잘 안쓰게됨
        System.out.printf("상품의 가격 : %d\n", value);
        System.out.printf("상품의 가격 : %6d\n", value); // 총6칸 오른쪽공백채움
        System.out.printf("상품의 가격 : %-6d\n", value); //총6칸 왼쪽공백채움
        System.out.printf("상품의 가격 : %06d\n", value); //총6칸 0으로 채움

//        원의 넓이 : 반지름 * 반지름 * 반지름
        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area); //%d는 정수가 들어가야함


//        문자열
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }

    public void exam02() throws java.io.IOException{
        int KeyCode;

        KeyCode = System.in.read();
        System.out.printf("KeyCode : " + KeyCode);
    }

    public void exam03() throws java.io.IOException{
        int KeyCode;

        while (true){
            KeyCode = System.in.read();
            System.out.println("KeyCode : " + KeyCode);
//            무한루프(반복문) 탈출조건
            if (KeyCode == 113){
                break;
            }
        }
    }
}