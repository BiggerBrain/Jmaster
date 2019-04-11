package prototype_pattern.serialize_depp_copy_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PrototypeSe po = new PrototypeSe();
        po.setName("test1");
        NewPrototypeSe se = new NewPrototypeSe();
        se.setPrototype(po);

        NewPrototypeSe deepClone = (NewPrototypeSe) se.deepClone();
        deepClone.getPrototype().setName("test2");

        System.out.println("original name:" + se.getPrototype().getName());
        System.out.println("cloned name:" + deepClone.getPrototype().getName());

    }
}
