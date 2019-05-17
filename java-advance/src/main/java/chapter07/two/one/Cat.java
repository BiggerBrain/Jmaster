package chapter07.two.one;

public class Cat {
    private String name;
    private double weight;
    private String color;

    public static void main(String[] args) {
        Cat c = new Cat();
        c.say();
    }

    /**
     * 添加void之后，不再是构造器，而是普通方法
     */
    public void Cat() {
        this.name = "Garfield";
        this.weight = 20;
        this.color = "orange";
    }

    public void say() {
        System.out.println("体重：" + weight + ",毛色：" + color);
        System.out.println(name + "要有了三个愿望：'第一个是要猪肉卷，" + "第二个还是猪肉卷，第三个，哦，你错啦，" + "我想要更多的愿望，那样我就能得到更多的猪肉卷啦。'");
    }
}
