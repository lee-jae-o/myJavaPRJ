//프로그램 언어 실습 7-13퀴즈 자바로도 풀어보기
import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int a,b,c;
        int i;

        System.out.printf("합계의 시작값:");
        a = s.nextInt();
        System.out.printf("합계의 끝값:");
        b = s.nextInt();
        System.out.printf("배수:");
        c = s.nextInt();

        for(i = a; i <= b; i++) {
            if (i % c == 0) {
                hap = hap + i;

            }
        }
        System.out.printf("%d부터 %d까지의 %d배수의 합계: %d",a,b,c,hap);

    }
}
