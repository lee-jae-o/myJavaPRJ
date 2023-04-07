//for문 한번써서 구구단 출력하기 복습
public class Ex구구단1 {
    public static void main(String[] args){
        int a, b=1;
        for(a = 2; a <= 9;) {
            if (b < a){
                b++;
                System.out.printf("%d * %d = %d \n",a,b,a*b);}
            else {
                b = 0;
                a++;
                System.out.printf("");
            }
        }
    }
}
