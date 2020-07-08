package xay_dung_lop_Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setColor("black");
        fan1.setRadius(3);
        fan1.setSpeed(1);
        System.out.println(fan1.toString() + "\n");

        fan2.setOn(false);
        fan2.setColor("red");
        fan2.setRadius(5);
        fan2.setSpeed(3);
        System.out.println(fan2.toString());
    }
}
