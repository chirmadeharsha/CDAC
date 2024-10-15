import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortPersons {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 22));
        people.add(new Person("Charlie", 25));
        people.add(new Person("David", 30));

        people.sort(Comparator.comparingInt((Person p) -> p.age)
                              .thenComparing(p -> p.name));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
