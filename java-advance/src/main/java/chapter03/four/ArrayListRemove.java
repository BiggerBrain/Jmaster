package chapter03.four;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemove {
    /**
     * 不会报ConcurrentModificationException异常
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String ele = it.next();
            System.out.println(ele);
            /*
             * 当迭代倒数第2个元素时,下一步即将访问的元素的索引为size()-1
             * 如果此时通过List删除集合的任意一个元素，将导致集合size()变为size()-1,
             * 这将导致hasNext()方法返回false。
             * 也就是说，遍历将提前结束，Iterator不会访问List集合的最后一个元素
             *
             *
             *
             * 原因：因为不满足hasNext，所以程序不会调用Itr的next()方法访问集合的下一个元素。否则
             * ，Itr总是会引发ConcurrentModificationException异常。Itr的next()方法中调用checkForComodification()来检查集合是否被修改。
             *
             * 如果集合的修改次数和遍历之前的修改次数不相等报异常
             */
            if (ele.equals("222")) {
                // 直接删除集合中倒数第2个元素
                list.remove(ele);
            }
        }
        System.out.println(list);
    }
}
