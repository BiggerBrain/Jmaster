package common.classes;

import java.util.ArrayList;
import java.util.List;

public class NestedInteger {

    private List<NestedInteger> list;
    private Integer             integer;

    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
    }

    public NestedInteger(Integer integer) {
        this.integer = integer;
    }

    public NestedInteger() {
        this.list = new ArrayList();
    }

    public static String printNi(NestedInteger thisNi, StringBuilder sb) {
        if (thisNi.isInteger()) {
            sb.append(thisNi.integer);
            sb.append(",");
        }
        sb.append("[");
        for (NestedInteger ni : thisNi.list) {
            if (ni.isInteger()) {
                sb.append(ni.integer);
                sb.append(",");
            } else {
                printNi(ni, sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void add(NestedInteger nestedInteger) {
        if (this.list != null) {
            this.list.add(nestedInteger);
        } else {
            this.list = new ArrayList();
            this.list.add(nestedInteger);
        }
    }

    public boolean isInteger() {
        return integer != null;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(int num) {
        this.integer = num;
    }

    public List<NestedInteger> getList() {
        return list;
    }

}
