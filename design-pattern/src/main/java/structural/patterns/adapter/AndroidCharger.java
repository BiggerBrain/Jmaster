package structural.patterns.adapter;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 * @date 2019/4/16 0016 17:21
 */
@Log4j2
public class AndroidCharger implements ImicroUsb {

    @Override
    public void chargeWithMicroUsb() {
        log.info("使用MicroUsb型号的充电器充电...");
    }
}
