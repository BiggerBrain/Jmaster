package creational_patterns.build;

/**
 * Created by dell on 2017/11/14.
 */
public class ManBuilder implements PersonBuilder {
    Person person;

    public ManBuilder() {
        person = new Man();
    }

    public void buildBody() {
        person.setBody("建造男人的身体");
        System.out.println("建造男人的身体");
    }

    public void buildFoot() {
        person.setFoot("建造男人的脚");
        System.out.println("建造男人的脚");
    }

    public void buildHead() {
        person.setHead("建造男人的头");
        System.out.println("建造男人的头");
    }

    public Person buildPerson() {
        System.out.println("建造成功一个男人");
        return person;
    }
}
