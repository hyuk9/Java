package javafullstack.chap09.sec02.exam03;

/**
 * packageName : javafullstack.chap09.sec02.exam03
 * fileName : Calculator
 * author : hyuk
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         hyuk          최초 생성
 */
public interface Calculator {
     default int sum(){
         return 0;
     }
}
