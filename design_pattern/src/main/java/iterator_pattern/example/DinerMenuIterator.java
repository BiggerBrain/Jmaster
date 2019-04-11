package iterator_pattern.example;

import java.util.Iterator;

/**
 * Created by dell on 2017/11/13.
 */
public class DinerMenuIterator implements Iterator {
    Menu[] menuItems;
    int position = 0;

    public DinerMenuIterator(Menu[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    //将数组的长度进行加1
    @Override
    public Object next() {
        Menu menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

    //删除最后一个元素
    @Override
    public void remove() {
        if (position <= 0) {
            try {
                throw new IllegalAccessException("you can't remove a null array");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if (menuItems[position - 1] != null) {
            // 把数组元素后面的向前移一位
            for (int i = position - 1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            // 因数组长度不可变，将最后一位元素置为null
            menuItems[menuItems.length - 1] = null;
        }
    }
}
