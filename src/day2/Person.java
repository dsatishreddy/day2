package day2;

import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // equals method
    @Override
    public boolean equals(Object obj) {

        // same reference
        if (this == obj)
            return true;

        // null or different class
        if (obj == null || getClass() != obj.getClass())
            return false;

        // type cast
        Person other = (Person) obj;

        // business logic comparison
        return this.id == other.id;
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
