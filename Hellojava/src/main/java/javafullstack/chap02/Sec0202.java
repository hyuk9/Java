package javafullstack.chap02;

public class Sec0202 {
    public void exam01(){
        int var1 = 0b1011; // 2진수(ob 붙이면 2진수)
        int var2 = 0206; // 8진수(0붙이면 8진수)
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수(0x붙이면 16진수)

//    sout 4개 출력 : var1:
        System.out.println("⭐Sec0202 exam01⭐");
        System.out.println("var1: "+ var1 + "\nvar2: " + var2 + "\nvar3: " + var3 + "\nvar4: " + var4);
    }
    public void exam02(){
//        int(4byte 정수형), byte(1byte 정수형) -> 크기 차이 때문에 int 정수형을 더 많이 씀
//        1byte : 8bit
//        bit : 0,1로 이루어진 최소단위(2진수로 컴퓨터가 소스를 인식함)
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 127;
//        byte var5 = 128; // byte형 -128~127까지 숫자만 쓸 수 있음 -> overflow
        System.out.println("⭐Sec0202 exam02⭐");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }

    public void exam03(){
//        int : 4byte 정수형, byte : 1byte 정수형
//        long : 8byte 정수형
        long var1 = 10; // int형 -> long변환
        long var2 = 20L; //
        long var4 =100000000L;

        System.out.println("⭐Sec0202 exam03⭐");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }

    public void exam04(){
//        문자형 : 1개의 문자를 지정하는 자료형
//        문자열형 : 1개 이상의 문자를 저장하는 자료형 -> 이쪽을 더 많이씀
        char c1 = 'A'; // 1개의 문자 저장(홑따옴표 사용)
        char c2 = 65; // 10진수를(아스키코드) 넣으면 문자로 자동변환됨
        char c3 = '\u0041'; //유니코드 숫자가 문자로 자동변환
        char c4 = '가';
        char c5 = '\uac00'; // 유니코드 숫자가 문자로 자동변환

        System.out.println("⭐️Sec0202 exam04⭐️");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }

    public void exam05(){
//        문자열 자료형 : string
        String name = "홍길동";
        String job = "프로그래머";

//        sout
        System.out.println("⭐️Sec0202 exam05⭐️");
        System.out.println(name); // 자동줄바꿈
        System.out.println(job);
        System.out.print(job); // 줄바꿈안하고 출력
    }

    public void exam06(){
        System.out.println("⭐️Sec0202 exam06⭐️");
        System.out.println("번호\t이름\t직업");
        System.out.println("행단위 출력\n");
        System.out.println("행단위 출력\n");
//        \:이스케이프 문자 -> 문자열 안에 ",\ 넣고 싶을때 앞에 사용
        System.out.println("우리는 \"개발자\" 입니다");
        System.out.println("봄\\여름\\가을\\겨울");
    }

    public void exam07(){
//        실수형(소수점 포함 숫자)
        float var2 = 3.14f; // float 실수형 끝에 f를 붙임 (4byte)
        double var3 = 3.14; // 소수점 포함 숫자 (8byte) -> 주로 이걸 많이 씀

        float var4 = 0.12345678901234f;
        double var5 = 0.123456789123456789;

        System.out.println("⭐️Sec0202 exam07⭐️");
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);

    }

    public void exam08(){
//        참과 거짓 저장하는 자료형
          boolean stop = true;
        System.out.println("⭐️Sec0202 exam08⭐️");
        if(stop){
              System.out.println("중지합니다");
          }else{
              System.out.println("시작합니다");
          }
    }
}

// ⭐️자료형 요약 : 정수형-> int / 문자형->String / 실수형->double / 참거짓 boolean⭐️




