import java.util.Scanner;

public class Practice020 {
    public static void main(String[] args) {

        int a, b;
        int hap = 0;
        String q;

        Scanner s = new Scanner(System.in);


        while(true) {
            System.out.print("첫번째 더할 수: ");
            a = s.nextInt();

            System.out.print("두번째 더할 수: ");
            b = s.nextInt();

            System.out.printf("합: %d\n\n",a+b);

            System.out.print("계속 하시겠습니까? (y/n)");
            q = s.next();

            if (q.equals("n")) {
                System.out.println("계산 끝");
                break;
            } else if (q.equals("y")) {
                System.out.println("계산 중...");
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}
