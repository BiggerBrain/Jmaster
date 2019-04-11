package memento_pattern.model1;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {

        Originator o = new Originator();
        Caretaker c = new Caretaker();
        //改变负责人对象的状态
        o.setState("On");
        //创建备忘录对象，并将发起人对象的状态储存起来
        c.saveMemento(o.createMemento());
        //修改发起人的状态
        o.setState("Off");
        //恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getState());
    }
}
