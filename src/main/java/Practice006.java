public class Practice006 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.print("--" + i + "단--\t");
        }
        System.out.println();

        for (int k = 1; k <= 9; k++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i + "x" + k + "=" + (i * k) + "\t");
            }
            System.out.println();
        }
    }
}
