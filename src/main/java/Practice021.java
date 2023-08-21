import java.util.Scanner;

public class Practice021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row, col;

        System.out.print("행 개수 입력: ");
        row = s.nextInt();
        System.out.print("열 개수 입력: ");
        col = s.nextInt();

        int[][] aa = new int[row][col];

        int i, k;
        int val = 1;

        for (i = 0; i < row; i++) {
            for (k = 0; k < col; k++) {
                aa[i][k] = val;
                val++;
            }
        }
        System.out.printf("\n\n");

        for (i = 0; i < row; i++) {
            for (k = 0; k < col; k++) {
                System.out.printf("%3d", aa[i][k]);
            }
            System.out.print("\n");
        }
    }
}
