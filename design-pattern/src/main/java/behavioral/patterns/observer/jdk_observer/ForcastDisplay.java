package behavioral.patterns.observer.jdk_observer;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by dell on 2017/11/10.
 */
public class ForcastDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Observable observable;

    public ForcastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("fortemp : " + temp + "\t forhumidity : " + humidity + "\t forpressure : " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
