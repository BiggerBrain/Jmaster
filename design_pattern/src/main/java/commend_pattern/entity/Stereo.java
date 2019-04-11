package commend_pattern.entity;

/**
 * Created by dell on 2017/11/10.
 */
public class Stereo {
    public void on() {
        System.out.println("Stereo on!!!");
    }

    public void off() {
        System.out.println("Stereo off!!!");
    }

    public void setCD() {
        System.out.println("CD: love be long   FROM:mike jackson!!!");
    }

    public void setVolume(int volume) {
        System.out.println("VOLUME: volume has set" + volume);
    }
}
