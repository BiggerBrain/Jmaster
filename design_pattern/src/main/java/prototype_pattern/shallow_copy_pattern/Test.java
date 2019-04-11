package prototype_pattern.shallow_copy_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        testPrototype();
    }

    private static void testPrototype() {
        Prototype pro = new Prototype();
        pro.setName("original object");
        Prototype pro1 = (Prototype) pro.clone();

        // pro.setName("changed object1");

        System.out.println("original object:" + pro.getName());
        System.out.println("cloned object:" + pro1.getName());

    }
}
