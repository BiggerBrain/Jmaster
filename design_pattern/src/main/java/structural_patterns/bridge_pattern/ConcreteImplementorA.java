package structural_patterns.bridge_pattern;

/**
 * Created by dell on 2017/11/14.
 */
class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("具体实现A");
    }
}

