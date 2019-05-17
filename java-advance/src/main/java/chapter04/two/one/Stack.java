package chapter04.two.one;

public class Stack {
    // 存放栈内元素的数组
    private Object[] elementData;
    // 记录栈内元素的个数
    private int size = 0;
    private int capacityIncrement;

    // 以指定初始化容量创建一个stack
    public Stack(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public Stack(int initialCapacity, int capacityIncrement) {
        this(initialCapacity);
        this.capacityIncrement = capacityIncrement;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        // 向栈顶压入10个元素
        for (int i = 0; i < 10; i++) {
            stack.push("元素" + i);
        }
        // 依次弹出10个元素
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }

    // 向"栈"顶压入一个元素
    public void push(Object object) {
        ensureCapacity();
        elementData[size++] = object;
    }

    /**
     * 并未清除elementData数组最后一个元素的引用，这样就会产生内存泄漏
     *
     * @return
     */
    /*public Object pop(){
        if(size == 0) {
            throw new RuntimeException("空栈异常");
        }
        return elementData[--size];
    }*/
    public Object pop() {
        if (size == 0) {
            throw new RuntimeException("空栈异常");
        }
        Object ele = elementData[--size];
        // 清除最后一个数组元素的引用，避免内存泄漏
        elementData[size] = null;
        return ele;
    }

    public int size() {
        return size;
    }

    // 保证底层数组能容纳栈内所有元素
    private void ensureCapacity() {
        // 增加堆栈的容量
        if (elementData.length == size) {
            Object[] oldElements = elementData;
            int newLength = 0;
            // 已经设置capacityIncrement
            if (capacityIncrement > 0) {
                newLength = elementData.length + capacityIncrement;
            } else {
                // 将长度扩充到原来的1.5倍
                newLength = (int) (elementData.length * 1.5);
            }
            elementData = new Object[newLength];
            // 将原数组的元素复制到新数组中
            System.arraycopy(oldElements, 0, elementData, 0, size);
        }
    }
}
