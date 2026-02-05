package day3;
class Person implements Comparable<Person> {

    int id;
    String name;
    int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age; // sort by age
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
