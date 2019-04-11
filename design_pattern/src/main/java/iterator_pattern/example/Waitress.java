package iterator_pattern.example;

import java.util.Iterator;

/**
 * Created by dell on 2017/11/13.
 */
public class Waitress {
    MenuIterator dinerMenu;
    MenuIterator cakeHouseMenu;

    public Waitress(MenuIterator dinerMenu, MenuIterator cakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.cakeHouseMenu = cakeHouseMenu;
    }

    public void printMenu() {
        Iterator dinerMenuIterator = dinerMenu.CreateIterator();
        Iterator cakeHouseMenuIterator = cakeHouseMenu.CreateIterator();
        System.out.println("dinerMenu");
        printMenu(dinerMenuIterator);
        System.out.println("cakeHouseMenu");
        printMenu(cakeHouseMenuIterator);
    }

    private void printMenu(Iterator menuIterator) {
        while (menuIterator.hasNext()) {
            Menu meuItem = (Menu) menuIterator.next();
            System.out.print(meuItem.getName() + "--\t");
            System.out.print(meuItem.getPrice() + "--\t");
            System.out.print(meuItem.getDescription() + "--\t");
            System.out.println();
        }
    }
}
