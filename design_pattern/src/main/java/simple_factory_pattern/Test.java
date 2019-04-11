package simple_factory_pattern;


/**
 * Created by dell on 2017/11/10.
 */
public class Test {
    public static void main(String[] args) {
        Sender sender = Fatory.mailSend();
        Sender sender1 = Fatory.smsSend();
        sender.send();
        sender1.send();
    }
}
