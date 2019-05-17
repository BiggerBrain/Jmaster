package chapter04.one.one;

/**
 * 对象在堆内存中运行时，根据它在对应有向图中的状态，可以把它所处的状态分成如下3种：
 * <p>
 * 可达状态：有一个以上的引用变量引用它。在有向图中可从起始顶点导航到该对象
 * 可恢复状态：如果程序中某个对象不再有任何引用变量引用它，它将先进入可恢复状态，此时从
 * 有向图的起始顶点不能导航到该对象。在这个状态下，系统的垃圾回收机制准备回收该对象所占用的内存。
 * 在回收该对象之前，系统会调用可恢复状态的对象的finalize方法进行资源清理，如果系统在调用finalize方法
 * 重新让一个以上引用变量引用该对象，则这个对象会再次变为可达状态；否则，该对象将进入不可大状态
 * 不可达状态：对象永久的失去引用（调用所有对象的finalize方法依然没有使该对象变成可达状态），被真正回收。
 */
class Node {
    Node next;
    String name;

    public Node(String name) {
        this.name = name;
    }
}

public class NodeTest {
    public static void main(String[] args) {
        Node n1 = new Node("第一个节点");
        Node n2 = new Node("第二个节点");
        Node n3 = new Node("第三个节点");

        n1.next = n2;
        n2 = null;
        n3 = n2;
    }
}
