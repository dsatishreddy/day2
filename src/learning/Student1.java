package learning;

public class Student1 {
    int rollNo;
    String name;

    Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student1 other = (Student1) obj;
        return this.rollNo == other.rollNo;
    }

    @Override
    public int hashCode() {
        return rollNo;
    }
}
