package javafullstack.chap05;

import java.util.Scanner;

/**
 * packageName : chap05
 * fileName : Sec0502
 * author : hyuk
 * date : 2022/09/26
 * description : 배열
 * 💡 요약  💡
 *      ✅배열 : 같은 자료형의 데이터를 연속된 공간에 저장, 내부적으로 인덱스번호가 부여됨
 *      ✅인덱스 : 0~n까지 부여된 숫자
 *      ✅배열 선언 : 자료형[] 변수; ex) int[] score1 / String[] score2
 *      ✅배열 생성 : 1) 자료형[] 변수 = {값1, ... 값n};
 *                 2) 자료형[] 변수 = new 자료형[길이]{값1, ... 값n};
 *              ⭐️3) 자료형[] 변수 = new 자료형[길이]; 👉강사님 추천‼️
 *                              변수[0] = 값1;
 *                              ...
 *                              변수[n] = 값n;⭐️
 *      ✅배열 길이 : 배열변수.length 👉읽기 전용‼️ 수정불가‼️
 *      ✅2차원 배열 : 자료형[][]변수 = new 자료형[크기][크기];
 *      ✅향상된 for문(증감식 없음‼️, 자동증가) : for(자료형 변수 : 배열변수명) {반복문}
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         hyuk          최초 생성
 */
public class Sec0502 {
//    학생의 성적을 저장하여 총합과 평균을 출력하는 프로그램 작성
//    자바 배열 선언 : 자료형[] 변수명 = {값1, ... , 값n};

    //    1)
    public void getStudent() {
        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};
        int result = 0;
//        사용시 주의점 : 한 라인으로 사용해야함(배열 변수 선언과 동시에 값을 넣어야 함)
//        ex) int[] score;
//            score = {83, 90, 87, 88, 89, 90, 91, 92, 93,75}; => 이런식으로 하면 에러발생!!!!

        for (int i = 0; i < score.length; i++) {
//            배열변수명(인덱스번호) 사용
//            인덱스번호 : 0~n까지 붙은 숫자
//            배열의 값을 가져오기 : 변수명 : score(인덱스번호)
//            배열의 값을 수정하기 : score(인덱스번호) = 10;
            result += score[i];
        }
        int avg = result / score.length;
        System.out.println("성적 총합은 : " + result + ", 평균은 : " + avg);
    }

    //    2) 배열 정의 및 생성 방법
    public void ArrayCreateByValueList() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0502 ArrayCreateValueList⭐️");
        System.out.println("--------------------");
//        💡new 연산자도 사용 가능 : 배열도 자바에서는 객체로 취급
//        int[] score = new int[] {83, 90, 87};
//        System.out.println(score);

//        💡2라인 이상으로 코딩 가능
        int[] score;
        score = new int[]{83, 90, 87};

//        기본 성적 출력하기
        System.out.println("score[0] : " + score[0]);
        System.out.println("score[1] : " + score[1]);
        System.out.println("score[2] : " + score[2]);

//        성적 합계

//        합계 계산용 함수 호출 : add()
        int total2 = add(score);
//        매개변수로 배열을 전달할 때 아래와 같이 사용하면 에러가 발생함;
//        ‼️int total3 = add({83, 90, 87}) // 에러 발생‼️
//        ⭐️참고 : 아래는 가능 => new 연산자와 같이 쓰는 경우는 가능⭐️
//        int total4 = add(new int[]{83,90,87});

        System.out.println("성적합계는 " + total2);

//        성적 평균
        double avg = (double) total2 / score.length;
        System.out.println("성적평균은 " + avg);
    }

//    💡성적 배열을 매개변수로 전달받아 합계를 계산해서 리턴하는 함수 =>
//    💡이걸 자주쓴다면 따로 함수를 만들어 놓은 것 (재사용 목적)
    public int add(int[] scores){
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total;
    }


    public void ArrayCreateByNew() {
        System.out.println("--------------------");
        System.out.println("⭐️Sec0502 ArrayCreateByNew⭐️");
        System.out.println("--------------------");
//        3) 배열 정의 및 생성 방법
//        초기값을 지정하지 않으면 자동으로 자료형에 해당하는 값으로 저장됨
//        정수(int) : 0, 실수(double) : 0.0, 문자열(String) : null
        int[] arr1 = new int[3]; // 배열의 값을 저장할 공간 3개 만들어 놓기

//        배열 초기값 출력해보기
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

//        실제 학생 성적값을 배열에 넣어보기 10,20,30
//        arr1 = new int[]{10, 20, 30};
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
    }

    public void exam01(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0502 exam01⭐️");
        System.out.println("--------------------");
//        실수배열 0.1 0.2 0.3
        double[] arr2 = {0.1, 0.2, 0.3};

        for (int i=0; i<arr2.length; i++){
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
    }

    public void exam02(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0502 exam02⭐️");
        System.out.println("--------------------");
//        문자열 배열 1월 2월 3월
        String[] arr3 = {"1월", "2월", "3월"};

        for (int i=0; i<arr3.length; i++){
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }

//    2차원 배열 : 배열 속의 배열
    public void ArrayInArray(){
        System.out.println("--------------------");
        System.out.println("⭐️Sec0502 ArrayInArray⭐️");
        System.out.println("--------------------");
//        자바에서 2차원 배열 정의 및 생성
//        1) 2차원 배열 정의 및 생성
        int[][] matchScores = {{1,2,3},{11,12,13}};
//        2) 2차원 배열 정의 및 생성
//        행렬 : 2차원 배열과 유사함
//        int[][] matchScores2 = new int[행개수][열개수];
//        for(){ // 바깥for문 == 바깥중괄호 2번
//              for(){ // 안쪽for문 == 안쪽중괄호 3번
//              }
//        }
        int[][] matchScores2 = new int[2][3];
        System.out.println("-----------matchScores-------------");
        for (int i=0; i<matchScores.length; i++){
            for (int j=0; j<matchScores[i].length; j++){
                System.out.println("matchScores["+i+"]["+j+"] : " + matchScores[i][j]);
            }
        }

        System.out.println("-----------englishScores-------------");
//       1) 2차원 배열(참고)
        int[][] englishScores = {{95, 92},{93,91,90}};

//        2차원 배열(비대칭) 출력하기
        for (int i=0; i<englishScores.length; i++){
            for (int j=0; j<englishScores[i].length; j++){
                System.out.println("englishScores["+i+"]["+j+"] : " + englishScores[i][j]);
            }
        }

        System.out.println("-----------englishScores2-------------");

//       2) 2차원 배열(참고) : 비대칭(균형 잡히지 않은) 배열
        int[][] englishScores2 = new int[2][];
        englishScores2[0] = new int[]{1,2};
        englishScores2[1] = new int[]{11, 12, 13};

//        2차원 배열(비대칭) 출력하기
        for (int i=0; i<englishScores2.length; i++){
            for (int j=0; j<englishScores2[i].length; j++){
                System.out.println("englishScores2["+i+"]["+j+"] : " + englishScores2[i][j]);
            }
        }
    }

//    데이터 복사 방법 :
//    1) 카피본을 생성해서 복사하는 방법(깊은 복사, Deep Copy) : new 배열 생성, for문 실행, System.arraycopy()함수 사용
//    2) 방번호(주소값)만 복사하는 방법(얇은 복사, Swallow Copy) : 배열변수2 = 배열변수1
    public void ArrayCopyByForExample(){

//        깊은 복사 : 복사본 생성해서 데이터 복사하기
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5]; // 값을 저장할 새로운 방을 만들기

        for (int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
            System.out.println("newIntArray[" +i+"] : " + newIntArray[i]);
        }

//        자바 함수 사용해서 깊은 복사하기
        String[] oldStrArray = {"Java", "Python", "C"};
        String[] newStrArray = new String[5]; // 값을 저장할 새로운 방을 만들기

//        깊은 복사 함수 사용
//        System.arraycopy(원본배열변수명, 원본시작index값, 복사배열변수명, 복사본시작index값, 원본배열길이)
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i=0; i<newStrArray.length; i++){
            System.out.println("newStrArray[" +i+"] : " + newStrArray[i]);

        }
    }


//        자바스크립트 : 개선된(향상된) for문
//        자바 : 개선된(향상된) for문

    public void advancedForExample(){
        int[] scores = {95, 71, 72, 73, 80};

//        점수 총합과 평균 구하기 : 향상된 for문
//        사용법 : for(자료형 변수명 : 배열변수명){반복문}
//        배열의 끝까지 순회해서 끝에 다다르면 반복문 종료 => 증감식이 따로 없음
        int sum = 0;
        for(int score : scores){
            sum += score;
        }

        System.out.println("점수 총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 : " + avg);
    }
}
