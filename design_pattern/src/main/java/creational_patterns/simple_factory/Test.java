package creational_patterns.simple_factory;


/**
 * 测试入口
 */
public class Test {
    public static void main(String[] args) {
        Sender sender = Fatory.mailSend();
        Sender sender1 = Fatory.smsSend();
        sender.send();
        sender1.send();
    }
}
