package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();
        System.out.println("모델명:"+myCar.model);
        System.out.println("시동 여부:"+myCar.start);
        System.out.println("현재 속도:"+myCar.speed+"km");

        myCar.speed = 90;
        System.out.println("수정된 속도:"+myCar.speed+"km");
    }
}
