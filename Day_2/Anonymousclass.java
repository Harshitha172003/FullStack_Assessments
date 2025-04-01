package Day2_Day3;

import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

List<Student> students = Arrays.asList(
    new Student("Alice", 85),
    new Student("Bob", 90),
    new Student("Charlie", 78)
);

Collections.sort(students, new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;
    }
});
