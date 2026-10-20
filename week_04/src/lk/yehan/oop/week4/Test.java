package lk.yehan.oop.week4;

public class Test {
    public static void main (String[] args){
        Car car1 = new Car("CBR1569","Toyota", "Raize",
                150,4,4,"Auto");

        System.out.println(car1.getModel());

        Vehicle v = car1;

        System.out.println(v.getModel());
        System.out.println(v.getMake());
        v.setModel("Nissan");
        System.out.print(v.getModel());
    }
}
