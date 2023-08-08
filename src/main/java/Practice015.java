public class Practice015 {
    public static void main(String[] args) {

        int[] scores = {95,71,84,93,87};

        int hap=0;
        for(int score:scores){
            hap += score;
        }
        System.out.println("점수 총합= " +hap);

        double avg = (double) hap / scores.length;
        System.out.println("점수 평균= " +avg);
    }
}
