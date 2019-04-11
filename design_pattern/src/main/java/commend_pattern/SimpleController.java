package commend_pattern;

/**
 * Created by dell on 2017/11/10.
 */
public class SimpleController {
    Commend slot;

    public SimpleController() {
    }

    public void setSlot(Commend slot) {
        this.slot = slot;
    }

    public void pressButton() {
        slot.execute();
    }
}
