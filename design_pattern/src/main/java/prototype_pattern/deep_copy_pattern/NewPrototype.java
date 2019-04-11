package prototype_pattern.deep_copy_pattern;

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
        NewPrototype ret = null;
        try {
            ret = (NewPrototype) super.clone();
            ret.prototype = (Prototype) this.prototype.clone();
            return ret;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
