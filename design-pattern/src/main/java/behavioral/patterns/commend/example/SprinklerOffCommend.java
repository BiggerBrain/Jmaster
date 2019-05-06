package behavioral.patterns.commend.example;

import behavioral.patterns.commend.example.entity.Sprinkler;

/**
 * @author lishixiong on 2017/11/10.
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
