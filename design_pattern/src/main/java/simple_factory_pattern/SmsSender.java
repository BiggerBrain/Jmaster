package simple_factory_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("===I'm smsSender,OK!!!!===");
    }
}
