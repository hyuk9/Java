package javafullstack.chap11.sec01.exam13;

/**
 * packageName : javafullstack.chap11.sec01.exam13
 * fileName : StringToByteApplication
 * author : hyuk
 * date : 2022/10/05
 * description : String 👉 Byte 배열로 변환
 *              String Convert to Byte Array
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         hyuk          최초 생성
 */
public class StringToByteApplication {
    public static void main(String[] args) {
        String str = "안녕하세요";

//        문자열.getBytes() : String 👉 Byte 변환
//        EUC-KR, KSC5601, MS949 등 👉 UTF-8(한글깨짐)
//        UTF-8(언어셋) : 한글(3byte) 영어(1byte) 👉 3*5 = 15
        byte[] bytes = str.getBytes();
        System.out.println("bytes.length : " + bytes.length);
        String str2 = new String(bytes); // byte[] 👉 String 원복
        System.out.println(str2);

//        언어셋이 UTF-8이 아닐 경우 변환방법 : ⭐️예외처리 필요⭐ try catch문️
//        💡참고 : UTF-8, UTF8 : 똑같은 UTF-8(-있는게 표준표기)
//        문자열.getBytes("변경할 언어셋")
//        byte[] 👉 문자열 : new String(byte[], "UTF-8")
        try{
            byte[] bytes2 = str.getBytes("UTF-8");
            System.out.println("bytes.length : " + bytes2.length);
            String str3 = new String(bytes, "UTF-8"); // byte[] 👉 문자열 원복
        }catch (Exception e){
            System.out.println("에러입니다");
        }


    }
}
