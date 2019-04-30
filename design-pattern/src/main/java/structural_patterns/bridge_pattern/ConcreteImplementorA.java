package structural_patterns.bridge_pattern;


class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // 真正的实现
        System.out.println("具体实现A");
    }
}

