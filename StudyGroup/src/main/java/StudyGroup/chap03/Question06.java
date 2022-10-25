package StudyGroup.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * packageName : StudyGroup.chap03
 * fileName : Question06
 * author : hyuk
 * date : 2022/10/24
 * description : 연습문제 Q8 p.127
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/24         hyuk          최초 생성
 */
public class Question06 {
    static class PhyscData {
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

//        생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

//        문자열로 만들어 반환하는 메서드
        public String toString(){
            return name + " " + height + " " + vision;
        }

//        시력의 내림차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData>{
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
//                return (d1.vision < d2.vision) ? 1 :
//                        (d1.vision > d2.vision) ? -1 : 0;
                return Double.compare(d2.vision, d1.vision);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = { // 시력의 내림차순으로 정렬
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("장경우", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("강민하", 162, 0.3)
        };

        System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
        double vision = scanner.nextDouble();
        int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if (idx < 0){
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
