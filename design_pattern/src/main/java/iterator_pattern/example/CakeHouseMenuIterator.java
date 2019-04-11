package iterator_pattern.example;

import java.util.Iterator;
import java.util.List;

/**
 * Created by dell on 2017/11/13.
 */
public class CakeHouseMenuIterator implements Iterator {
    List<Menu> menuItems;
    int index;

    public CakeHouseMenuIterator(List<Menu> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (index < menuItems.size() && menuItems.get(index) != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Object object = menuItems.get(index);
        index++;
        return object;
    }
    // 用父类的默认的remove就可以了
  /*  @Override
    public void remove() {

    }*/
}
