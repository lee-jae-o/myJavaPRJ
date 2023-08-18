import java.util.Scanner;

public class Practice018 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.print("숫자 입력: ");
        a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
