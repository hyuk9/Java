package javafullstack.chap05;

/**
 * packageName : chap05
 * fileName : Verify05
 * author : hyuk
 * date : 2022/09/27
 * description : 종합연습문제(배열/ 열거형)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         hyuk          최초 생성
 */
public class Verify05 {

//    4)주어진 배열에서 최대값 구하기
    public void exam04(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify05 exam04⭐️");
        System.out.println("--------------------");
        int max = 0;
        int[] array = {1,5,3,8,2};

//        최대값구하기
//        결과출력 : max :8
        for (int i=0; i< array.length; i++){
            if (max<array[i]){
                max = array[i];
            }
        }

        System.out.println("max : " + max);
    }

//    5) 2중 for문 이용 전체 합/평균 출력
//    sum : 881
//    avg : 88.1

    public void exam05(){
        System.out.println("--------------------");
        System.out.println("⭐️Verify05 exam05⭐️");
        System.out.println("--------------------");

        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
        int sum =0;
        double avg;
        int count =0;

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }

        System.out.println(count);
        avg = (double)sum/count;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }

// ‼️ 이거 사용법 완전히 몰랐음 ‼️
    public void exam0302(){
//        💡실무에서 상수들을 어떻게 사용하는지?💡 👉 상수형들은 추후에 변경 불가능
//        에러코드 : 개발자 에러코드를 정의 -> 프로그램의 업무용 문자메시지
        System.out.println("--------------------");
        System.out.println("⭐️Verify05 exam0302⭐️");
        System.out.println("--------------------");
//        열거형 값
        LoginResult result = LoginResult.FAIL_PASSWORD;

//        enum 클래스 정의
        if (result == LoginResult.SUCCESS){
            System.out.println("로그인 성공");
        } else if (result == LoginResult.FAIL_ID) {
            System.out.println("아이디가 틀립니다");
        } else if (result == LoginResult.FAIL_PASSWORD) {
            System.out.println("패스워드가 틀립니다");
        }
    }
}
