package behavioral.patterns.observer;

/**
 * Created by dell on 2017/11/10.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();
}
