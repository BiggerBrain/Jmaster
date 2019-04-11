package prototype_pattern.serialize_depp_copy_pattern;

import java.io.Serializable;

/**
 * Created by dell on 2017/11/14.
 */
public class PrototypeSe implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}