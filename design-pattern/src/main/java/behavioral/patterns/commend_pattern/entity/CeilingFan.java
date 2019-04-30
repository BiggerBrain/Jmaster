package behavioral.patterns.commend_pattern.entity;

/**
 * 电风扇
 * Created by dell on 2017/11/10.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String local;
    int speed;

    public CeilingFan(String local) {
        this.local = local;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("this fan was high,speed = " + getSpeed());
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("this fan was medium,speed = " + getSpeed());
    }

    public void low() {
        speed = LOW;
        System.out.println("this fan was low,speed = " + getSpeed());
    }

    public void off() {
        speed = OFF;
        System.out.println("this fan was off,speed = " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }
}
