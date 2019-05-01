package structural.patterns.bridge_pattern;


class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("具体实现B");
    }
}
