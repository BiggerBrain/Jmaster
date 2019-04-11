package iterator_pattern.example;

import java.util.Iterator;

/**
 * Created by dell on 2017/11/11.
 */
public class DinerMenu implements MenuIterator {
    static final int MAX_ITEMS = 4;
    int numberOfItem = 0;
    Menu[] menuItems = new Menu[4];

    public DinerMenu() {
        addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "vacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a sideof potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, whith saurkraut, relish, onions,topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        Menu menu = new Menu(name, description, vegetarian, price);
        if (numberOfItem >= MAX_ITEMS) {
            System.out.println("sorry, menu is full");
        } else {
            menuItems[numberOfItem] = menu;
            numberOfItem++;
        }
    }

    /*  public Menu [] getMenuItems(){
       return menuItems;
   }*/
    public Iterator CreateIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
