package behavioral.patterns.observer;

/**
 * @author lishixiong on 2017/11/10.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
