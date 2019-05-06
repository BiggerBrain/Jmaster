/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.iterator;

/**
 * @author lishixiong
 * @version 1.0: BookShelfIterator.java, v 0.1 2019年05月06日 22:34 lishixiong Exp $
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        //return false;
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        //return null;
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}