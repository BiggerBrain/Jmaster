package behavioral.patterns.observer;

/**
 * Created by dell on 2017/11/10.
 */
public interface Observer {
    // 更新温度湿度气压
    public void update(float temp, float humidity, float pressure);
}
