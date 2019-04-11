package creational_patterns.simple_factory;

/**
 * 邮箱发送
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("---i'm mailSender,OK!!!---");
    }
}
