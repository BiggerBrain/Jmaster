package structural.patterns.adapter;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 17:22
 */
public class AppleCharger implements ILightning {

    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lighting型号的充电器充电...");
    }
}
