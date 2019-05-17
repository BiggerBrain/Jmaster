package chapter03.one.two;

import java.util.HashSet;
import java.util.Set;

class Name2 {
    private String first;
    private String last;

    public Name2(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o.getClass() == Name2.class) {
            Name2 n = (Name2) o;
            return n.first.equals(first);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return first.hashCode();
    }

    @Override
    public String toString() {
        return "Name2{" +
            "first='" + first + '\'' +
            ", last='" + last + '\'' +
            '}';
    }
}

public class HashSetTest2 {

    public static void main(String[] args) {
        Set<Name2> s = new HashSet<>();

        s.add(new Name2("abc", "123"));
        s.add(new Name2("abc", "456"));
        System.out.println(s);
        System.out.println(s.contains(new Name2("abc", "123")));
        System.out.println(s.contains(new Name2("abc", "789")));
    }

}
