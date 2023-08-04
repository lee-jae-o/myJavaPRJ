public class Practice011 {
    public static void main(String[] args) {

        int[] scores;
        scores = new int[]{83, 90, 87};

        int hap = 0;
        for (int i = 0; i < 3; i++) {
            hap += scores[i];
        }
        System.out.println("총합: " + hap);

        printItem(new int[]{83, 90, 87});
    }

    public static void printItem(int[] scores){

        for(int i=0; i<3; i++){
            System.out.println("score[" +i+"]: "+scores[i]);
        }
    }
}
