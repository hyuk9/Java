package javafullstack.chap05;

import java.util.Scanner;

/**
 * packageName : chap05
 * fileName : Sec0502
 * author : hyuk
 * date : 2022/09/26
 * description : λ°°μ΄
 * π‘ μμ½  π‘
 *      βλ°°μ΄ : κ°μ μλ£νμ λ°μ΄ν°λ₯Ό μ°μλ κ³΅κ°μ μ μ₯, λ΄λΆμ μΌλ‘ μΈλ±μ€λ²νΈκ° λΆμ¬λ¨
 *      βμΈλ±μ€ : 0~nκΉμ§ λΆμ¬λ μ«μ
 *      βλ°°μ΄ μ μΈ : μλ£ν[] λ³μ; ex) int[] score1 / String[] score2
 *      βλ°°μ΄ μμ± : 1) μλ£ν[] λ³μ = {κ°1, ... κ°n};
 *                 2) μλ£ν[] λ³μ = new μλ£ν[κΈΈμ΄]{κ°1, ... κ°n};
 *              β­οΈ3) μλ£ν[] λ³μ = new μλ£ν[κΈΈμ΄]; πκ°μ¬λ μΆμ²βΌοΈ
 *                              λ³μ[0] = κ°1;
 *                              ...
 *                              λ³μ[n] = κ°n;β­οΈ
 *      βλ°°μ΄ κΈΈμ΄ : λ°°μ΄λ³μ.length πμ½κΈ° μ μ©βΌοΈ μμ λΆκ°βΌοΈ
 *      β2μ°¨μ λ°°μ΄ : μλ£ν[][]λ³μ = new μλ£ν[ν¬κΈ°][ν¬κΈ°];
 *      βν₯μλ forλ¬Έ(μ¦κ°μ μμβΌοΈ, μλμ¦κ°) : for(μλ£ν λ³μ : λ°°μ΄λ³μλͺ) {λ°λ³΅λ¬Έ}
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * βββββββββββββββββββββββββββββ
 * 2022/09/26         hyuk          μ΅μ΄ μμ±
 */
public class Sec0502 {
//    νμμ μ±μ μ μ μ₯νμ¬ μ΄ν©κ³Ό νκ· μ μΆλ ₯νλ νλ‘κ·Έλ¨ μμ±
//    μλ° λ°°μ΄ μ μΈ : μλ£ν[] λ³μλͺ = {κ°1, ... , κ°n};

    //    1)
    public void getStudent() {
        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};
        int result = 0;
//        μ¬μ©μ μ£Όμμ  : ν λΌμΈμΌλ‘ μ¬μ©ν΄μΌν¨(λ°°μ΄ λ³μ μ μΈκ³Ό λμμ κ°μ λ£μ΄μΌ ν¨)
//        ex) int[] score;
//            score = {83, 90, 87, 88, 89, 90, 91, 92, 93,75}; => μ΄λ°μμΌλ‘ νλ©΄ μλ¬λ°μ!!!!

        for (int i = 0; i < score.length; i++) {
//            λ°°μ΄λ³μλͺ(μΈλ±μ€λ²νΈ) μ¬μ©
//            μΈλ±μ€λ²νΈ : 0~nκΉμ§ λΆμ μ«μ
//            λ°°μ΄μ κ°μ κ°μ Έμ€κΈ° : λ³μλͺ : score(μΈλ±μ€λ²νΈ)
//            λ°°μ΄μ κ°μ μμ νκΈ° : score(μΈλ±μ€λ²νΈ) = 10;
            result += score[i];
        }
        int avg = result / score.length;
        System.out.println("μ±μ  μ΄ν©μ : " + result + ", νκ· μ : " + avg);
    }

    //    2) λ°°μ΄ μ μ λ° μμ± λ°©λ²
    public void ArrayCreateByValueList() {
        System.out.println("--------------------");
        System.out.println("β­οΈSec0502 ArrayCreateValueListβ­οΈ");
        System.out.println("--------------------");
//        π‘new μ°μ°μλ μ¬μ© κ°λ₯ : λ°°μ΄λ μλ°μμλ κ°μ²΄λ‘ μ·¨κΈ
//        int[] score = new int[] {83, 90, 87};
//        System.out.println(score);

//        π‘2λΌμΈ μ΄μμΌλ‘ μ½λ© κ°λ₯
        int[] score;
        score = new int[]{83, 90, 87};

//        κΈ°λ³Έ μ±μ  μΆλ ₯νκΈ°
        System.out.println("score[0] : " + score[0]);
        System.out.println("score[1] : " + score[1]);
        System.out.println("score[2] : " + score[2]);

//        μ±μ  ν©κ³

//        ν©κ³ κ³μ°μ© ν¨μ νΈμΆ : add()
        int total2 = add(score);
//        λ§€κ°λ³μλ‘ λ°°μ΄μ μ λ¬ν  λ μλμ κ°μ΄ μ¬μ©νλ©΄ μλ¬κ° λ°μν¨;
//        βΌοΈint total3 = add({83, 90, 87}) // μλ¬ λ°μβΌοΈ
//        β­οΈμ°Έκ³  : μλλ κ°λ₯ => new μ°μ°μμ κ°μ΄ μ°λ κ²½μ°λ κ°λ₯β­οΈ
//        int total4 = add(new int[]{83,90,87});

        System.out.println("μ±μ ν©κ³λ " + total2);

//        μ±μ  νκ· 
        double avg = (double) total2 / score.length;
        System.out.println("μ±μ νκ· μ " + avg);
    }

//    π‘μ±μ  λ°°μ΄μ λ§€κ°λ³μλ‘ μ λ¬λ°μ ν©κ³λ₯Ό κ³μ°ν΄μ λ¦¬ν΄νλ ν¨μ =>
//    π‘μ΄κ±Έ μμ£Όμ΄λ€λ©΄ λ°λ‘ ν¨μλ₯Ό λ§λ€μ΄ λμ κ² (μ¬μ¬μ© λͺ©μ )
    public int add(int[] scores){
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return total;
    }


    public void ArrayCreateByNew() {
        System.out.println("--------------------");
        System.out.println("β­οΈSec0502 ArrayCreateByNewβ­οΈ");
        System.out.println("--------------------");
//        3) λ°°μ΄ μ μ λ° μμ± λ°©λ²
//        μ΄κΈ°κ°μ μ§μ νμ§ μμΌλ©΄ μλμΌλ‘ μλ£νμ ν΄λΉνλ κ°μΌλ‘ μ μ₯λ¨
//        μ μ(int) : 0, μ€μ(double) : 0.0, λ¬Έμμ΄(String) : null
        int[] arr1 = new int[3]; // λ°°μ΄μ κ°μ μ μ₯ν  κ³΅κ° 3κ° λ§λ€μ΄ λκΈ°

//        λ°°μ΄ μ΄κΈ°κ° μΆλ ₯ν΄λ³΄κΈ°
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

//        μ€μ  νμ μ±μ κ°μ λ°°μ΄μ λ£μ΄λ³΄κΈ° 10,20,30
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
        System.out.println("β­οΈSec0502 exam01β­οΈ");
        System.out.println("--------------------");
//        μ€μλ°°μ΄ 0.1 0.2 0.3
        double[] arr2 = {0.1, 0.2, 0.3};

        for (int i=0; i<arr2.length; i++){
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
    }

    public void exam02(){
        System.out.println("--------------------");
        System.out.println("β­οΈSec0502 exam02β­οΈ");
        System.out.println("--------------------");
//        λ¬Έμμ΄ λ°°μ΄ 1μ 2μ 3μ
        String[] arr3 = {"1μ", "2μ", "3μ"};

        for (int i=0; i<arr3.length; i++){
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }

//    2μ°¨μ λ°°μ΄ : λ°°μ΄ μμ λ°°μ΄
    public void ArrayInArray(){
        System.out.println("--------------------");
        System.out.println("β­οΈSec0502 ArrayInArrayβ­οΈ");
        System.out.println("--------------------");
//        μλ°μμ 2μ°¨μ λ°°μ΄ μ μ λ° μμ±
//        1) 2μ°¨μ λ°°μ΄ μ μ λ° μμ±
        int[][] matchScores = {{1,2,3},{11,12,13}};
//        2) 2μ°¨μ λ°°μ΄ μ μ λ° μμ±
//        νλ ¬ : 2μ°¨μ λ°°μ΄κ³Ό μ μ¬ν¨
//        int[][] matchScores2 = new int[νκ°μ][μ΄κ°μ];
//        for(){ // λ°κΉ₯forλ¬Έ == λ°κΉ₯μ€κ΄νΈ 2λ²
//              for(){ // μμͺ½forλ¬Έ == μμͺ½μ€κ΄νΈ 3λ²
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
//       1) 2μ°¨μ λ°°μ΄(μ°Έκ³ )
        int[][] englishScores = {{95, 92},{93,91,90}};

//        2μ°¨μ λ°°μ΄(λΉλμΉ­) μΆλ ₯νκΈ°
        for (int i=0; i<englishScores.length; i++){
            for (int j=0; j<englishScores[i].length; j++){
                System.out.println("englishScores["+i+"]["+j+"] : " + englishScores[i][j]);
            }
        }

        System.out.println("-----------englishScores2-------------");

//       2) 2μ°¨μ λ°°μ΄(μ°Έκ³ ) : λΉλμΉ­(κ· ν μ‘νμ§ μμ) λ°°μ΄
        int[][] englishScores2 = new int[2][];
        englishScores2[0] = new int[]{1,2};
        englishScores2[1] = new int[]{11, 12, 13};

//        2μ°¨μ λ°°μ΄(λΉλμΉ­) μΆλ ₯νκΈ°
        for (int i=0; i<englishScores2.length; i++){
            for (int j=0; j<englishScores2[i].length; j++){
                System.out.println("englishScores2["+i+"]["+j+"] : " + englishScores2[i][j]);
            }
        }
    }

//    λ°μ΄ν° λ³΅μ¬ λ°©λ² :
//    1) μΉ΄νΌλ³Έμ μμ±ν΄μ λ³΅μ¬νλ λ°©λ²(κΉμ λ³΅μ¬, Deep Copy) : new λ°°μ΄ μμ±, forλ¬Έ μ€ν, System.arraycopy()ν¨μ μ¬μ©
//    2) λ°©λ²νΈ(μ£Όμκ°)λ§ λ³΅μ¬νλ λ°©λ²(μμ λ³΅μ¬, Swallow Copy) : λ°°μ΄λ³μ2 = λ°°μ΄λ³μ1
    public void ArrayCopyByForExample(){

//        κΉμ λ³΅μ¬ : λ³΅μ¬λ³Έ μμ±ν΄μ λ°μ΄ν° λ³΅μ¬νκΈ°
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5]; // κ°μ μ μ₯ν  μλ‘μ΄ λ°©μ λ§λ€κΈ°

        for (int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
            System.out.println("newIntArray[" +i+"] : " + newIntArray[i]);
        }

//        μλ° ν¨μ μ¬μ©ν΄μ κΉμ λ³΅μ¬νκΈ°
        String[] oldStrArray = {"Java", "Python", "C"};
        String[] newStrArray = new String[5]; // κ°μ μ μ₯ν  μλ‘μ΄ λ°©μ λ§λ€κΈ°

//        κΉμ λ³΅μ¬ ν¨μ μ¬μ©
//        System.arraycopy(μλ³Έλ°°μ΄λ³μλͺ, μλ³Έμμindexκ°, λ³΅μ¬λ°°μ΄λ³μλͺ, λ³΅μ¬λ³Έμμindexκ°, μλ³Έλ°°μ΄κΈΈμ΄)
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i=0; i<newStrArray.length; i++){
            System.out.println("newStrArray[" +i+"] : " + newStrArray[i]);

        }
    }


//        μλ°μ€ν¬λ¦½νΈ : κ°μ λ(ν₯μλ) forλ¬Έ
//        μλ° : κ°μ λ(ν₯μλ) forλ¬Έ

    public void advancedForExample(){
        int[] scores = {95, 71, 72, 73, 80};

//        μ μ μ΄ν©κ³Ό νκ·  κ΅¬νκΈ° : ν₯μλ forλ¬Έ
//        μ¬μ©λ² : for(μλ£ν λ³μλͺ : λ°°μ΄λ³μλͺ){λ°λ³΅λ¬Έ}
//        λ°°μ΄μ λκΉμ§ μνν΄μ λμ λ€λ€λ₯΄λ©΄ λ°λ³΅λ¬Έ μ’λ£ => μ¦κ°μμ΄ λ°λ‘ μμ
        int sum = 0;
        for(int score : scores){
            sum += score;
        }

        System.out.println("μ μ μ΄ν© : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("μ μ νκ·  : " + avg);
    }
}
