package behavioral_patterns.templet_pattern;

/**
 * Created by dell on 2017/11/11.
 */
public abstract class CafeTeeBeverage {
    private void boilWater() {
        System.out.println("boiling water");
    }

    private void pourInCup() {
        System.out.println("pourIn cup");
    }

    abstract void brew();

    abstract void addCondiments();

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (getSureCondiments()) {
            addCondiments();
        }
    }

    // 这个就是钩子方法
    public boolean getSureCondiments() {
        return true;
    }
}
