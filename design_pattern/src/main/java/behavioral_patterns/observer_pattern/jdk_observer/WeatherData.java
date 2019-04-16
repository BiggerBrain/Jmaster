package behavioral_patterns.observer_pattern.jdk_observer;


import java.util.Observable;

/**
 * Created by dell on 2017/11/10.
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void messageChange() {
        setChanged();
        notifyObservers();
    }

    public void setWeatherDate(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        messageChange();
    }

}