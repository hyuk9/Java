package javafullstack.chap14.sec02.exam02;

import java.io.*;

/**
 * packageName : javafullstack.chap14.sec02.exam02
 * fileName : NonBufferVsBufferApplication
 * author : hyuk
 * date : 2022/10/07
 * description : 파일 복사 성능 테스트(NonBuffer Vs Buffer)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         hyuk          최초 생성
 */
public class NonBufferVsBufferApplication {
//    ➡️ 공유 변수
    static int data = -1;
//    ➡️ 파일 copy 용 공유 함수
    public static long copy(InputStream is, OutputStream os) throws Exception{
//        ➡️ 복사하는데 걸린 시간 체크
        long start = System.nanoTime(); // 시작 시간

//        ➡️ 복사 실행
        while (true){
//            ➡️ 1byte씩 데이터 읽기 ‼️데이터 다 읽으면 자동으로 -1 반환‼️
            data = is.read(); // 원본파일읽기
            if (data == -1)break;
            os.write(data); // 새로운 파일에 쓰기(복사본)
        }

//        ➡️ 종료 시간 체크
        long end = System.nanoTime(); // 종료 시간

        return (end - start); // 복사시 걸린 시간
    }

    public static void main(String[] args) throws Exception{
//        ➡️ 원본 이미지 경로 지정
        String orgImgPath = "src/main/resources/images/boy.jpeg";
        String orgImgPath2 = "src/main/resources/images/girl.jpeg";

//        ➡️ 복사본 이미지 저장 경로 지정
        String cpyImgPath = "src/main/resources/images/boy_copy.jpeg";
        String cpyImgPath2 = "src/main/resources/images/girl_copy.jpeg";

//        ➡️ 파일 읽기용으로 원본 이미지 열기
        FileInputStream fileInputStream = new FileInputStream(orgImgPath);

//        ➡️ 파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream = new FileOutputStream(cpyImgPath);

//        ➡️ 복사와 함께 시간 측정 : copy() 공유 함수 호출
        long nonBufferTime = copy(fileInputStream, fileOutputStream);
        System.out.println("버퍼를 사용하지 않았을 때 : " + nonBufferTime + "ns");

//        ➡️ 파일 닫기
        fileInputStream.close();
        fileOutputStream.close();

//        ===================================================================

        //        ➡️ 파일 읽기용으로 원본 이미지 열기
        FileInputStream fileInputStream2 = new FileInputStream(orgImgPath2);

//        ➡️ 파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream2 = new FileOutputStream(cpyImgPath2);

//        ➡️ 버퍼 : 보조스트림 👉 new 보조스트림(기본스트림)
//        ➡️ 기본스트림 + 버퍼기능추가
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);

//        ➡️ 복사와 함께 시간 측정 : copy() 공유 함수 호출
        long BufferTime = copy(bufferedInputStream, bufferedOutputStream);
        System.out.println("버퍼를 사용했을 때 : " + BufferTime + "ns");

//        ➡️ 파일 닫기
        bufferedInputStream.close();
        bufferedOutputStream.close();



    }
}
