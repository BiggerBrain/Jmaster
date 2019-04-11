package abstract_factory_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class MailFactory implements FactoryProduce {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
