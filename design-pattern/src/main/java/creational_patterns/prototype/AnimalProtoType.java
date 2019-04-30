package creational_patterns.prototype;

import java.util.Hashtable;

public class AnimalProtoType {
    private static Hashtable<String, Animal> shapeMap
        = new Hashtable();
    static  {
        //初始化cat
        Animal cat=new Cat();
        cat.setId("1");
        shapeMap.put(cat.getId(),cat);
        //初始化dog
        Dog dog = new Dog();
        dog.setId("2");
        shapeMap.put(dog.getId(),dog);
    }
    public static  Animal getShapeMap(String id) throws CloneNotSupportedException {
        //注意，在这里执行原型的克隆
        return (Animal) shapeMap.get(id).clone();
    }
}
