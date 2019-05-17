package chapter02.four.four;

/**
 * 通用接口
 */
interface Active {
    void drink();
}

public class Milk {

    public final static String name = "纯牛奶";//名称

    private static int num = 16;//数量

    public Milk() {
        System.out.println(name + "：16/每箱");
    }

    /**
     * 闭包
     *
     * @return 返回一个喝牛奶的动作
     */
    public Active HaveMeals() {
        return new Active() {
            public void drink() {
                if (num == 0) {
                    System.out.println("木有了，都被你丫喝完了.");
                    return;
                }
                num--;
                System.out.println("喝掉一瓶牛奶");
            }
        };
    }

    /**
     * 获取剩余数量
     */
    public void currentNum() {
        System.out.println(name + "剩余：" + num);
    }
}

class Person {
    public static void main(String[] args) {
        //买一箱牛奶
        Milk m = new Milk();
        Active haveMeals = m.HaveMeals();
        //没事喝一瓶
        haveMeals.drink();
        //有事喝一瓶
        haveMeals.drink();
        //看看还剩多少？
        m.currentNum();
        m = null;
        /*
         * 闭包会导致资源不被回收
         * 以下仍能被执行
         */
        haveMeals.drink();
    }

}