package prototype_pattern.shallow2_copy_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class NewPrototype implements Cloneable {

    private String id;
    private Prototype prototype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }


    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}