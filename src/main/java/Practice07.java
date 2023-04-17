//백준 8393번
import java.util.Scanner;
public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int hap = 0;
        for (int i = 1; i <= a; i++) {
            hap = i + hap;
        }

        System.out.println(hap);
    }
}
