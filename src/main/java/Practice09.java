//별찍기
public class Practice09 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 9; i++) {
            if (i <= 5) {
                j = i;
            } else {
                j = 10 - i;
            }

            while (j > 0) {
                System.out.print("*");
                j--;
            }

            System.out.println();
        }
    }
}

