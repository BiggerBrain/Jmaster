package creational.patterns.prototype;


import lombok.extern.log4j.Log4j2;

/**
 * 1、原型模式用于创建重复对象，同时又能保证性能
 * 2、原型模式实现了原型接口，该接口用于创建当前对象的克隆
 * 3、原型模式用了Object方法的Cloneable方法，该方法执行的浅拷贝
 */
@Log4j2
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = (Cat) AnimalProtoType.getShapeMap("1");
        Cat cat1 = (Cat) cat.clone();
        log.info(cat == cat1);//克隆，不是同一个对象的引用，false
        //-------------------------------------------------------------------------------------------------
        //第一个是优先级的trick
        log.info(cat.getId() + "==" + cat1.getId() + ":" + cat.getId() == cat1.getId());//false,执行的是浅拷贝
        log.info(cat.getId() + ":" + cat1.getId() + ":" + (cat.getId() == cat1.getId()));//1:1:true,执行的是浅拷贝
        //-------------------------------------------------------------------------------------------------
        log.info("Animal type:" + cat.getType());
        Dog dog = (Dog) AnimalProtoType.getShapeMap("2");
        log.info("Animal type:" + dog.getType());
    }
}
