package adapter_pattern.object_adapter_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gogo() {
        System.out.println("i'm a turkey,and gugugu");
    }

    @Override
    public void fly() {
        System.out.println("i'm fly hard,because i'm a WildTurkey");
    }
}
