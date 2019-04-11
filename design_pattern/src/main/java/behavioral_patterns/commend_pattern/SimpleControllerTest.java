package behavioral_patterns.commend_pattern;

import behavioral_patterns.commend_pattern.entity.Light;

/**
 * Created by dell on 2017/11/10.
 */
public class SimpleControllerTest {
    public static void main(String[] args) {
        SimpleController simpleController = new SimpleController();
        Commend commend = new LightOnCommend(new Light());
        simpleController.setSlot(commend);
        simpleController.pressButton();
    }
}
