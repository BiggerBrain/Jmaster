package prototype_pattern.shallow2_copy_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testPrototype();
    }

    private static void testPrototype() {
        Prototype pro = new Prototype();
        pro.setName("original object");
        NewPrototype newObj = new NewPrototype();
        newObj.setId("test1");
        newObj.setPrototype(pro);

        NewPrototype copyObj = (NewPrototype) newObj.clone();
        copyObj.setId("testCopy");
        copyObj.getPrototype().setName("changed object");

        System.out.println("original object id:" + newObj.getId());
        System.out.println("original object name:" + newObj.getPrototype().getName());

        System.out.println("cloned object id:" + copyObj.getId());
        System.out.println("cloned object name:" + copyObj.getPrototype().getName());

    }
}
