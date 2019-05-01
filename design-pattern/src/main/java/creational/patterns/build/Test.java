package creational.patterns.build;

/**
 * 1、建造者模式使用多个简单的对象一步一步构建一个复杂的对象
 * 2、建造者模式的核心是在解耦对象的建造，适用于大型复杂对象的开发与构建
 * 3、建造者设计模式属于创建型设计模式
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person manPerson = pd.constructPerson(new ManBuilder());
        Person womanPerson = pd.constructPerson(new WomanBuilder());
    }
}
