import java.util.Scanner;

public class Ex00_011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int hap = 0;
        int i;

        System.out.printf(" ");
        a[0] = s.nextInt();

        System.out.printf(" ");
        a[1] = s.nextInt();

        System.out.printf(" ");
        a[2] = s.nextInt();

        System.out.printf(" ");
        a[3] = s.nextInt();

        System.out.printf(" ");
        a[4] = s.nextInt();

        int max = a[0];
        int min = a[0];

        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            hap = hap + a[i];
        }

        double avg = (double) hap / a.length;

        System.out.printf("가장 큰 값: %d / 가장 작은 값: %d / 평균 값: %.1f", max, min, avg);
    }
}
