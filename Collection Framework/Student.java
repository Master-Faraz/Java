import java.util.*;

public class Student implements Comparable<Student> {
    public String name;
    public int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student {" + "name : " + name + " Roll : " + roll + " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student s = (Student) o;
        return roll == s.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }

    @Override
    public int compareTo(Student that) {
        return this.roll - that.roll;
    }

}
