package simple_factory_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class Fatory {
    public static Sender smsSend() {
        return new SmsSender();
    }

    public static Sender mailSend() {
        return new MailSender();
    }
}
