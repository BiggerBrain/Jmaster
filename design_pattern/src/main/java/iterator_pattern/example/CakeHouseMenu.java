package iterator_pattern.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dell on 2017/11/11.
 */
public class CakeHouseMenu implements MenuIterator {
    List<Menu> menuItems = new ArrayList<>();

    public CakeHouseMenu() {
        addItem("k&b's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false, 2.99);
        addItem("BlueBerry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Waffles", "Waffles, with your choice of blueberries or starawberries", true, 3.59);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        Menu menu = new Menu(name, description, vegetarian, price);
        menuItems.add(menu);
    }

    public Iterator CreateIterator() {
        return new CakeHouseMenuIterator(menuItems);
    }
 /*   public List getMenuItems(){
        return menuItems;
    }*/

}
