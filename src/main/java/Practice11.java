import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] aa = new int[5];

        for (int i = 0; i < aa.length; i++) {
            aa[i] = s.nextInt();
        }

        for (int i = 0; i < aa.length - 1; i++) {
            for (int j = i + 1; j < aa.length; j++) {
                if (aa[i] < aa[j]) {
                    int temp = aa[i];
                    aa[i] = aa[j];
                    aa[j] = temp;
                }
            }
        }

        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
    }
}
