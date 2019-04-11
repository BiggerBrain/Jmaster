package status_pattern.rebuilding;

/**
 * Created by dell on 2017/11/14.
 */
public interface State {
    public void insertQuarter();

    // 退回硬币
    public void ejectQuarter();

    // 转动曲柄
    public void turnCrank();

    //发放糖果
    public void dispense();
}
