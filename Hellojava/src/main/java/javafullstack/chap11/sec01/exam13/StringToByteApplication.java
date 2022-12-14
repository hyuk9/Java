package javafullstack.chap11.sec01.exam13;

/**
 * packageName : javafullstack.chap11.sec01.exam13
 * fileName : StringToByteApplication
 * author : hyuk
 * date : 2022/10/05
 * description : String π Byte λ°°μ΄λ‘ λ³ν
 *              String Convert to Byte Array
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * βββββββββββββββββββββββββββββ
 * 2022/10/05         hyuk          μ΅μ΄ μμ±
 */
public class StringToByteApplication {
    public static void main(String[] args) {
        String str = "μλνμΈμ";

//        λ¬Έμμ΄.getBytes() : String π Byte λ³ν
//        EUC-KR, KSC5601, MS949 λ± π UTF-8(νκΈκΉ¨μ§)
//        UTF-8(μΈμ΄μ) : νκΈ(3byte) μμ΄(1byte) π 3*5 = 15
        byte[] bytes = str.getBytes();
        System.out.println("bytes.length : " + bytes.length);
        String str2 = new String(bytes); // byte[] π String μλ³΅
        System.out.println(str2);

//        μΈμ΄μμ΄ UTF-8μ΄ μλ κ²½μ° λ³νλ°©λ² : β­οΈμμΈμ²λ¦¬ νμβ­ try catchλ¬ΈοΈ
//        π‘μ°Έκ³  : UTF-8, UTF8 : λκ°μ UTF-8(-μλκ² νμ€νκΈ°)
//        λ¬Έμμ΄.getBytes("λ³κ²½ν  μΈμ΄μ")
//        byte[] π λ¬Έμμ΄ : new String(byte[], "UTF-8")
        try{
            byte[] bytes2 = str.getBytes("UTF-8");
            System.out.println("bytes.length : " + bytes2.length);
            String str3 = new String(bytes, "UTF-8"); // byte[] π λ¬Έμμ΄ μλ³΅
        }catch (Exception e){
            System.out.println("μλ¬μλλ€");
        }


    }
}
