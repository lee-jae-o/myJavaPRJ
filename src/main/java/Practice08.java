//별찍기
public class Practice08 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j < k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            k--;
            System.out.println();
        }
    }
}