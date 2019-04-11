package behavioral_patterns.observer_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class ForcastDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public ForcastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("fortemp : " + temp + "\t forhumidity : " + humidity + "\t forpressure : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
