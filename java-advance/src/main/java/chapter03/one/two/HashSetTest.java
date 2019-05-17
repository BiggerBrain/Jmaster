package chapter03.one.two;

import java.util.HashSet;
import java.util.Set;

class Name {
    private String first;
    private String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o.getClass() == Name.class) {
            Name n = (Name) o;
            return n.first.equals(first) && n.last.equals(last);
        }
        return false;
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        Set<Name> s = new HashSet<>();

        s.add(new Name("abc", "123"));
        System.out.println(s.contains(new Name("abc", "123")));
    }
}
