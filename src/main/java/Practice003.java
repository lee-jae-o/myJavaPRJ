import java.util.Scanner;

public class Practice003 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int a;

        System.out.printf("점수 입력: ");
        a = s.nextInt();

        char grade = (a>=90)?  'A' : ((a>=80)? 'B':'C');

        System.out.println(grade);
    }
}
