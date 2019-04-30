package creational_patterns.abstract_factory;


public class Test {
    public static void main(String[] args) {
        FactoryProduce factoryProduce = new MailFactory();
        factoryProduce.produce().send();
        FactoryProduce factoryProduce1 = new SmsFactory();
        factoryProduce1.produce().send();
    }
}
