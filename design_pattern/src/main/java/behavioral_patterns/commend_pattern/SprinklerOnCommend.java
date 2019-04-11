package behavioral_patterns.commend_pattern;

import behavioral_patterns.commend_pattern.entity.Sprinkler;

/**
 * Created by dell on 2017/11/10.
 */
public class SprinklerOnCommend implements Commend {
    Sprinkler sprinkler;

    public SprinklerOnCommend(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOn();
    }

    @Override
    public void undo() {
        sprinkler.waterOff();
    }
}
