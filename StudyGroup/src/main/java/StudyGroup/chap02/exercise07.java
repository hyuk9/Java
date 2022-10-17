package StudyGroup.chap02;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap02
 * fileName : exercise07
 * author : hyuk
 * date : 2022/10/16
 * description : 연습문제7
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */
public class exercise07 {
    static final int VMAX = 21; // 공유상수 지정

    static class data {
        String name;
        int height;
        double vision;

        public data(String name, int height, double vision) {
//            생성자 지정
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(data[] dat) {
        double sum = 0;
        for (int i = 0; i < dat.length; i++){
            sum += dat[i].height;
        }
        return sum/dat.length;
    }

    static void distVision(data[] dat, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision*10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        인적사항
        data[] x = {
                new data("강민하", 162, 0.3),
                new data("김찬우", 173, 0.7),
                new data("박준서", 175, 2.0),
                new data("유서범", 171, 1.5),
                new data("이수연", 168, 0.4),
                new data("장경오", 174, 1.2),
                new data("황지안", 169, 0.8),
        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름   키      시력");
        System.out.println("==================");
        for (int i = 0; i < x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.print(i/10.0 + " ~: ");
            for (int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
