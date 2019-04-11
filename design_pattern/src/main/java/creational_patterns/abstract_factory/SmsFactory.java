package creational_patterns.abstract_factory;

/**
 * Created by dell on 2017/11/10.
 */
public class SmsFactory implements FactoryProduce {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
