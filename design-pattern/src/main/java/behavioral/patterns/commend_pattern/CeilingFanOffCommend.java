package behavioral.patterns.commend_pattern;

import behavioral.patterns.commend_pattern.entity.CeilingFan;

/**
 * Created by dell on 2017/11/10.
 */
public class CeilingFanOffCommend implements Commend {
    CeilingFan ceilingFan;
    int speed;

    public CeilingFanOffCommend(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        if (speed == ceilingFan.HIGH) {
            ceilingFan.high();
        } else if (speed == ceilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (speed == ceilingFan.LOW) {
            ceilingFan.low();
        } else if (speed == ceilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
