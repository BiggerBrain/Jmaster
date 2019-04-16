package structural_patterns.adapter;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 17:21
 */
public class AndroidCharger implements ImicroUsb{

    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb型号的充电器充电...");
    }
}
