package structural.patterns.adapter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 17:22
 */
@Log4j2
public class AppleCharger implements ILightning {

    @Override
    public void chargeWithLightning() {
        log.info("使用Lighting型号的充电器充电...");
    }
}
