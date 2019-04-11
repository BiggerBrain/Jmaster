package behavioral_patterns.commend_pattern;

import behavioral_patterns.commend_pattern.entity.Stereo;

/**
 * Created by dell on 2017/11/10.
 */
public class StereoOnCommend implements Commend {
    Stereo stereo;

    public StereoOnCommend(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
