package javafullstack.chap11.sec01.exam11;

/**
 * packageName : javafullstack.chap11.sec01.exam11
 * fileName : ByteToStringApplication
 * author : hyuk
 * date : 2022/10/05
 * description : Byte λ°°μ΄ π String λ°°μ΄λ‘ λ³ννκΈ°
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * βββββββββββββββββββββββββββββ
 * 2022/10/05         hyuk          μ΅μ΄ μμ±
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

//        byte λ°°μ΄μ λ¬Έμμ΄λ‘ λ³ννκΈ°
//        String μμ±μμ λ§€κ°λ³μ = byte[] λ°°μ΄
        String str1 = new String(bytes);
        System.out.println(str1);

//        μ°Έκ³ ) μΈλ±μ€ μμΉλΆν° lengthλ§νΌλ§ μλΌμ λ³΄μ¬μ£ΌκΈ°
//        μ¬μ©λ² : String(byteλ°°μ΄, μμ μΈλ±μ€ μμΉ, μλ₯Όκ°μ)
        String str2 = new String(bytes, 6, 4);
        System.out.println(str2);
    }
}
