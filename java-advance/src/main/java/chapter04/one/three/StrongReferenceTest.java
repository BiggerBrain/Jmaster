package chapter04.one.three;

public class StrongReferenceTest {

    public static void main(String[] args) {
        Person[] people = new Person[10000];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("名子" + i, (i + 1) * 4 % 100);
        }
        System.out.println(people[2]);
        System.out.println(people[4]);
        // 通知系统进行垃圾回收
        System.gc();
        System.runFinalization();
        // StrongReference数组里不受任何影响
        System.out.println(people[4]);
    }
}
