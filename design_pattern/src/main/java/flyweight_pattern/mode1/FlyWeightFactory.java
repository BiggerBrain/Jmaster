package flyweight_pattern.mode1;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dell on 2017/11/14.
 */
public class FlyWeightFactory {

    public static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String name) {
        if (allFlyWeight.get(name) == null) {
            synchronized (allFlyWeight) {
                if (allFlyWeight.get(name) == null) {
                    System.out.println("Instance of name = {} does not exist, creating it");
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    System.out.println("Instance of name = {} created");
                    allFlyWeight.put(name, flyWeight);
                }
            }
        }
        return allFlyWeight.get(name);
    }

    public static void setFlyWeight(String name) {
        allFlyWeight.put(name, new ConcreteFlyWeight(name));
    }

}
