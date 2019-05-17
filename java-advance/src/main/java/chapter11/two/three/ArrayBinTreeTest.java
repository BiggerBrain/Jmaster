package chapter11.two.three;

public class ArrayBinTreeTest {

    public static void main(String[] args) {
        ArrayBinTree<String> binTree = new ArrayBinTree<>(4, "根");
        binTree.add(0, "第二层右子节点", false);
        binTree.add(2, "第三层右子节点", false);
        binTree.add(6, "第四层右子节点", false);
        System.out.println(binTree);
    }
}
