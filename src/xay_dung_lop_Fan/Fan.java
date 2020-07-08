package xay_dung_lop_Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    boolean on = false;
    private int speed = SLOW;
    private double radius = 5;
    private String color = " blue ";

    public Fan(){

    }
    public boolean getOn() {
        return this.on;
    }
    public void setOn(boolean value) {
        this.on = value;
    }

    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return  this.radius;
    }
    public  void setRadius( double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return " Status: " + this.on + "\n Speed : " + this.speed + "\n Color : " + this.color + "\n Radius : " + this.radius;
    }


}
