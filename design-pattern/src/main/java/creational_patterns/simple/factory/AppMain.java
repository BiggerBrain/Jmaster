package creational_patterns.simple.factory;

/**
 * @author lishixiong
 * @version 1: ProductEnum.java, v 0.1 2019年04月30日 15:13 lishixiong Exp $
 */
public class AppMain {
    public static void main(String[] args) {
        Product product = Fatory.createProduct(ProductEnum.SMS);
        product.use();
    }
}
