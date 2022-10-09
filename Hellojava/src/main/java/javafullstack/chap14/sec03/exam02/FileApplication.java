package javafullstack.chap14.sec03.exam02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName : chap14.sec03.exam02
 * fileName : FileApplication
 * author : ds
 * date : 2022-10-07
 * description : File 클래스를 이용한 파일 및 폴더 정보 보기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         ds          최초 생성
 */
public class FileApplication {
    public static void main(String[] args) throws Exception {
//        폴더 정보
        File dir = new File("src/main/resources/images");
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");
        File file3 = new File("src/main/resources/file3.txt");

        if(dir.exists() == false) {
            dir.mkdirs(); // 폴더 없으면 폴더 만들기 실행
        }

        if(file1.exists() == false) {
            file1.createNewFile(); // 없으면 파일 만들기
        }

        if(file2.exists() == false) {
            file2.createNewFile(); // 없으면 파일 만들기
        }

        if(file3.exists() == false) {
            file3.createNewFile(); // 없으면 파일 만들기
        }

//        파일객체 현재 디렉토리의 목록보기 함수
        File temp = new File("src/main/resources/");
        File[] contents = temp.listFiles();

//        파일 정보 보기 좋게 출력
        System.out.println("시간\t\t\t형태\t\t크기\t이름");
        System.out.println("----------------------------------");
//        날짜 포맷 변경 : yyyy-MM-dd a HH:mm
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for(File file : contents) {
//            파일 또는 정보를 출력
            System.out.print(sdf.format(new Date(file.lastModified()))); // 1열 ( 최근에 파일이 수정된 시간 )
//          file / 폴더 : file 폴더이면
            if(file.isDirectory()) {
//               폴더이면 <DIR> 출력
                System.out.print("\t<DIR>\t\t\t" + file.getName());       // 2열
            } else {
//               아니면 그냥 출력
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 3열 + 4열
            }
            System.out.println(); // 줄바꿈
        }
    }
}







