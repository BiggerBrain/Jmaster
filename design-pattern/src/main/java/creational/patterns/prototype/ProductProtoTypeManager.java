package creational.patterns.prototype;

import java.util.Hashtable;

public class ProductProtoTypeManager {
    private static Hashtable<String, Object> productProTypes
        = new Hashtable();

    static {
        //初始化cat
        ProductPrototype mailProduct = new MailProduct();
        mailProduct.setId("1");
        productProTypes.put(mailProduct.getId(), mailProduct);
        //初始化dog
        SmsProduct dog = new SmsProduct();
        dog.setId("2");
        productProTypes.put(dog.getId(), dog);
    }

    public static ProductPrototype getShapeMap(String id) throws CloneNotSupportedException {
        //注意，在这里执行原型的克隆
        ProductPrototype product = (ProductPrototype) productProTypes.get(id);
        product.clone();
        return product;
    }
}
