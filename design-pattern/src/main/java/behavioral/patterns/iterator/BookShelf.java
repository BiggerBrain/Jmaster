/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package behavioral.patterns.iterator;

/**
 * @author lishixiong
 * @version 1.0: BookShelf.java, v 0.1 2019年05月06日 22:35 lishixiong Exp $
 */
public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];

    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        //return null;
        return new BookShelfIterator(this);
    }
}