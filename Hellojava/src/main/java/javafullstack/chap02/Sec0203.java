package javafullstack.chap02;

public class Sec0203 {
//    속성 : 생략
//    함수 (메소드)
    public void exam01(){
//        자동 형변환 형태
//        int(4byte 정수형) <- byte(1byte 정수형) = int(4byte 정수형) 자동 형변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("⭐️Sec0203 exam01⭐️");
        System.out.println("int <= byte 넣었을 때 intValue : " + intValue);

//        char(1문자 저장형) ⭐️특수 케이스⭐️
        char charValue = 'A';
        intValue = charValue; // 영어->아스키코드(숫자) 자동변환 // 한글->유니코드 자동변환
        System.out.println("int <= char 넣었을 때 intValue : " + intValue);


//        long(8byte 정수형) <= int(4byte 정수형)
        intValue = 50;
        long longValue = intValue;
        System.out.println("long <= int 넣었을 때 longValue : " + longValue);

//        float실수형 <= 정수형 : 자동 float 실수형으로 형변환
        longValue = 100;
        float floatValue = longValue;
        System.out.println("float <= long 넣었을 때 floatValue : " + floatValue);

//        double (8byte 실수형) <= float (4byte) 실수형
        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("double <= float 넣었을 때 doubleValue : " + doubleValue);

        //        ⭐️작은 자료형에서 큰 자료형으로의 형변환은 자유롭다⭐️
    }

//    exam02
    public void exam02(){
//        char(2byte) <- int(4byte) ‼️큰 자료형에서 작은 자료형으로의 형변환은 자유롭지 않음‼️
        int intValue = 44032;
//        char charValue = inValue; <- 이렇게 하면 에러남
//        캐스팅연산자(형변환연산자) : (바꿀자료형)
        char charValue = (char) intValue;
        System.out.println("⭐️Sec0203 exam02⭐️");
        System.out.println("캐스팅 연산자(형변환 연산자)이용해서 형변환 : " + charValue);

//        int <- long :
        long longValue = 500L;
//        inValue = longValue; <- 이렇게 하면 에러남
        intValue = (int)longValue;
        System.out.println("캐스팅 연산자(형변환 연산자)이용해서 형변환 : " + intValue);
    }

    public void exam03(){
        byte result1 = 10 + 20;
        System.out.println("⭐️Sec0203 exam03⭐️");
        System.out.println(result1);

//        내부적으로 byte  + byte = 자동으로 int형변환
        byte x = 20;
        byte y = 10;
        int result2 = x+y;
        System.out.println(result2);

//        정수자료형 모두 사용하기 => 가장큰 자료형으로 만들어줘야함(long)
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result);

//        int + double
        int x1 = 1;
        int y1 = 2;
        double result3 = (double) x1/y1;
        System.out.println(result3);
    }
    public void exam06(){
//        문자열 = 문자열 + 숫자
        int value = 10 + 2 + 8;
        System.out.println("⭐️Sec0203 exam06⭐️");
        System.out.println("value : " + value);

        String str4 = "10" + (2+8);
        System.out.println("str4 : " + str4);
    }

    public void exam07(){
//        숫자문자열 -> 숫자 형변환
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("⭐️Sec0203 exam07⭐️");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

//        숫자 -> 문자열 바꾸는 함수
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
