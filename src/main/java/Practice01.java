import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.printf("입력 문자열:");
            String a = s.nextLine();

            if(a.equals("q")){
                break;
            }
            System.out.println("출력 문자열:"+a);
        }
        System.out.println("종료");
    }
}

