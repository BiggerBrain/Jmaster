package behavioral.patterns.commend_pattern;

import behavioral.patterns.commend_pattern.entity.Sprinkler;

/**
 * Created by dell on 2017/11/10.
 */
public class SprinklerOffCommend implements Commend {
    Sprinkler sprinkler;

    public SprinklerOffCommend(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.waterOff();
    }

    @Override
    public void undo() {
        sprinkler.waterOn();
    }
}
