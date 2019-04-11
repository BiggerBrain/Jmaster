package creational_patterns.prototype;


/**
 * 1、原型模式用于创建重复对象，同时又能保证性能
 * 2、原型模式实现了原型接口，该接口用于创建当前对象的克隆
 * 3、原型模式用了Object方法的Cloneable方法，该方法执行的浅拷贝
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat=(Cat) AnimalProtoType.getShapeMap("1");
        Cat cat1= (Cat) cat.clone();
        System.out.println(cat==cat1);//克隆，不是同一个对象的引用，false
        //-------------------------------------------------------------------------------------------------
        //第一个是优先级的trick
        System.out.println(cat.getId()+"=="+cat1.getId()+":"+cat.getId()==cat1.getId());//false,执行的是浅拷贝
        System.out.println(cat.getId()+":"+cat1.getId()+":"+(cat.getId()==cat1.getId()));//1:1:true,执行的是浅拷贝
        //-------------------------------------------------------------------------------------------------
        System.out.println("Animal type:"+cat.getType());
        Dog dog=(Dog) AnimalProtoType.getShapeMap("2");
        System.out.println("Animal type:"+dog.getType());
    }
}
