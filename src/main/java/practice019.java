import java.util.Scanner;

public class practice019 {
    public static void main(String[] args) {

        int i;
        int hap = 0;
        int a,b,c;

        Scanner s = new Scanner(System.in);

        System.out.printf("시작값: ");
        a = s.nextInt();

        System.out.printf("끝값: ");
        b = s.nextInt();

        System.out.printf("증가값: ");
        c = s.nextInt();

        for(i=a; i<=b; i+=c){
            hap += i;
        }

        System.out.printf("%d부터 %d까지 %d씩 증가한걸 더한 값: %d",a,b,c,hap);


    }
}
