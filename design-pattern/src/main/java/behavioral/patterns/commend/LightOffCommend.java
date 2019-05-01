package behavioral.patterns.commend;

import behavioral.patterns.commend.entity.Light;

/**
 * @author lishixiong on 2017/11/10.
 */
public class LightOffCommend implements Commend {
    Light light;

    public LightOffCommend(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
