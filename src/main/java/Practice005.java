public class Practice005 {
    public static void main(String[] args) {
        int time = (int)(Math.random()*9)+8;
        System.out.println("[현재 시간:" + time + "시]");

        switch (time){
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 11:
                System.out.println("외근을 나갑니다.");
            case 12:
                System.out.println("점심 시간^^");
            case 13:
                System.out.println("점심 시간^^");
            case 14:
                System.out.println("회의를 합니다.");
            case 15:
                System.out.println("업무를 봅니다.");
            case 16:
                System.out.println("퇴근^^");
        }
    }
}
