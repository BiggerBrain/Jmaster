package behavioral_patterns.observer_pattern.jdk_observer;

import java.util.Observer;

/**
 * Created by dell on 2017/11/10.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer forcastDisplay = new ForcastDisplay(weatherData);
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        // weatherData.deleteObserver(forcastDisplay);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
        weatherData.setWeatherDate(11.2f, 22.3f, 33.1f);
    }
}