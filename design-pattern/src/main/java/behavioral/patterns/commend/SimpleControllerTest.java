package behavioral.patterns.commend;

import behavioral.patterns.commend.entity.Light;

/**
 * @author lishixiong on 2017/11/10.
 */
public class SimpleControllerTest {
    public static void main(String[] args) {
        SimpleController simpleController = new SimpleController();
        Commend commend = new LightOnCommend(new Light());
        simpleController.setSlot(commend);
        simpleController.pressButton();
    }
}
