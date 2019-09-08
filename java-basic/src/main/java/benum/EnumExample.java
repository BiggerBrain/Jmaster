
package benum;

import lombok.extern.log4j.Log4j2;

/**
 * enum的好处：类型安全和可读性
 */
enum Color {
    RED, YELLOW, GREEN, BLACK
}

enum Color1 {
    RED("红色", 2),
    YELLOW("黄色", 2),
    GREEN("绿色", 3),
    BLACK("黑色", 4);
    // 成员变量
    private String name;
    private int index;

    // 构造方法，默认就是private修饰
    Color1(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

/**
 * @author lishixiong
 * @version 1.0: EnumExample.java, v 0.1 2019年04月30日 16:08 lishixiong Exp $
 */
@Log4j2
class AppMain {
    public static void main(String[] args) {
        log.info(Color.RED);
        log.info(Color.RED == Color.RED);
        log.info(Color.RED.equals(Color.RED));
        //为enum添加属性和方法
        log.info(Color1.RED.getIndex());
        //enum 默认的equals是比较内存地址
        log.info(Color1.RED.equals(Color1.YELLOW));
    }
}