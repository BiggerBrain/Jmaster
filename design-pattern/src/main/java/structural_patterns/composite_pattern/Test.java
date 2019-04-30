package structural_patterns.composite_pattern;

/**
 * Created by dell on 2017/11/13.
 */
public class Test {
    public static void main(String[] args) {
        MenuComponent packHouseMenu = new Menu("packHouse menu", "break fast");
        MenuComponent dinerMenu = new Menu("diner menu", "lunch");
        MenuComponent cafeMenu = new Menu("cafe menu", "diner");
        MenuComponent dessertMenu = new Menu("dessert menu", "dessert of course");
        MenuComponent allMenu = new Menu("all menu", "all menu component");
        allMenu.add(packHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("BLT", "vacon with lettuce & tomato on whole wheat", false, 2.99));
        dessertMenu.add(cafeMenu);
        cafeMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a sideof potato salad", false, 3.29));
        cafeMenu.add(packHouseMenu);
        packHouseMenu.add(new MenuItem("Hotdog", "A hot dog, whith saurkraut, relish, onions,topped with cheese", false, 3.05));
        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
