package build_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class WomanBuilder implements PersonBuilder {
    Person person;

    public WomanBuilder() {
        person = new Woman();
    }

    public void buildBody() {
        person.setBody("建造女人的身体");
        System.out.println("建造女人的身体");
    }

    public void buildFoot() {
        person.setFoot("建造女人的脚");
        System.out.println("建造女人的脚");
    }

    public void buildHead() {
        person.setHead("建造女人的头");
        System.out.println("建造女人的头");
    }

    public Person buildPerson() {
        System.out.println("建造成功一个女人");
        return person;
    }
}  
