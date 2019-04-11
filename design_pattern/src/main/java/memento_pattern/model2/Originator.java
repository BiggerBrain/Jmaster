package memento_pattern.model2;

/**
 * Created by dell on 2017/11/14.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public MementoIF createMemento() {
        return new Memento(state);
    }

    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(MementoIF memento) {
        this.setState(((Memento) memento).getState());
    }

    private class Memento implements MementoIF {

        private String state;

        /**
         * 构造方法
         */
        private Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}