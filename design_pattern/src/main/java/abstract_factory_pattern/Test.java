package abstract_factory_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Test {
    public static void main(String[] args) {
        FactoryProduce factoryProduce = new MailFactory();
        factoryProduce.produce().send();

        FactoryProduce factoryProduce1 = new SmsFactory();
        factoryProduce1.produce().send();
    }
}
