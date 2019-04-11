package creational_patterns.simple_factory;

/**
 * 短信发送
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("===I'm smsSender,OK!!!!===");
    }
}
