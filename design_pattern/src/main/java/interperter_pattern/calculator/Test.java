package interperter_pattern.calculator;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        // 解释计算123+124+125+126的运算结果
        Calculator calculator = new Calculator("123 + 124 + 125 - 126 * 2 / 3");
        System.out.println("setBtnClick: -->" + calculator.calculate());
    }
}
