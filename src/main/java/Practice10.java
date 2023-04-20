//별찍기
public class Practice10 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 9; i++) {
            if (i <= 5) {
                j = 5 - i + 1;
            } else {
                j = i - 5;
            }

            while (j > 0) { 
                System.out.print("*");
                j--;
            }

            System.out.println();
        }
    }
}



