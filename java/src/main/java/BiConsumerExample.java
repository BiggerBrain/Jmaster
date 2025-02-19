import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Person, Integer> printDetails = (name, age) -> {
            System.out.println("Name: " + name.name);
            System.out.println("Age: " + age);
            name.name = "lsx";

        };

        BiConsumer<Person, Integer> printGreeting = (name, age) -> {
            System.out.println("Hello, " + name.name + "! You are " + age + " years old.");
        };

        BiConsumer<Person, Integer> combinedConsumer = printDetails.andThen(printGreeting);

        combinedConsumer.accept(new Person("Bob"), 25);
    }

    static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
        }
    }
}