package behavioral.patterns.commend;

import behavioral.patterns.commend.entity.CeilingFan;

/**
 * @author lishixiong on 2017/11/10.
 */
public class CeilingFanMediumCommend implements Commend {
    CeilingFan ceilingFan;
    int speed;

    public CeilingFanMediumCommend(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        speed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
