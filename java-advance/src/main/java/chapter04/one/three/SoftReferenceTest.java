package chapter04.one.three;


import java.lang.ref.SoftReference;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

public class SoftReferenceTest {
    public static void main(String[] args) {
//        SoftReference<Person>[] people = new SoftReference[100];
        SoftReference<Person>[] people = new SoftReference[10000];

        for (int i = 0; i < people.length; i++) {
            people[i] = new SoftReference<>(new Person("名字" + i, (i + 1) * 4 % 100));
        }
        System.out.println(people[2].get());
        System.out.println(people[4].get());

        // 通知系统进行垃圾回收
        System.gc();
        System.runFinalization();
        // 垃圾回收机制运行之后，SoftReference数组里的元素保持不变
        System.out.println(people[2].get());
        System.out.println(people[4].get());
    }
}
