package behavioral_patterns.commend_pattern;

import behavioral_patterns.commend_pattern.entity.Light;

/**
 * Created by dell on 2017/11/10.
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
