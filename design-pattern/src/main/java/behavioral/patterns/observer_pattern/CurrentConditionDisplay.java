package behavioral.patterns.observer_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp : " + temp + "\t humidity : " + humidity + "\t pressure : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
