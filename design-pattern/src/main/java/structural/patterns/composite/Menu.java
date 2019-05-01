package structural.patterns.composite;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lishixiong on 2017/11/13.
 */
@Log4j2
public class Menu extends MenuComponent {
    ArrayList menuConponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuConponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuConponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return (MenuComponent) menuConponents.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    //递归打印
    @Override
    public void print() {
        log.info("-----menu------");
        log.info(getName());
        log.info(getDescription());
        log.info("-----menu------");
        Iterator iterator = menuConponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
