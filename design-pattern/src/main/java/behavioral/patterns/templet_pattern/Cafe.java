package behavioral.patterns.templet_pattern;

import java.util.Scanner;

/**
 * Created by dell on 2017/11/11.
 */
public class Cafe extends CafeTeeBeverage {
    @Override
    void brew() {
        System.out.println("drop cafe");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }

    @Override
    public boolean getSureCondiments() {
        if (getUserInput()) {
            return true;
        }
        return false;
    }

    boolean getUserInput() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("if you want Condiments please enter Y !!!");
        if (str.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }

    private void sss() {
        System.out.println("------------------------------");
    }
}
