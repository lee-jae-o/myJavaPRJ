public class Quiz_012 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        while (a < 10) {
            System.out.printf("%d * %d = %d \n", a, b, a * b);
            b++;
            if (b == 10)
            {
                b = 1;
                a++;
                System.out.println();
            }
        }

    }
}
