package prototype_pattern.serialize_depp_copy_pattern;

import java.io.*;

/**
 * Created by dell on 2017/11/14.
 */
public class NewPrototypeSe implements Serializable {

    private String id;
    private PrototypeSe prototype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrototypeSe getPrototype() {
        return prototype;
    }

    public void setPrototype(PrototypeSe prototype) {
        this.prototype = prototype;
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}