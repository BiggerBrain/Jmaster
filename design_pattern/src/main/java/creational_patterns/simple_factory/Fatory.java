package creational_patterns.simple_factory;

/**
 * 工厂模式
 */
public class Fatory {
    public static Sender smsSend() {
        return new SmsSender();
    }

    public static Sender mailSend() {
        return new MailSender();
    }
}
