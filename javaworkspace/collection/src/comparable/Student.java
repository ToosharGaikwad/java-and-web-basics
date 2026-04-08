package comparable;

import java.util.*;

public class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.name.length(), s.name.length());
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(List.of(
                new Student("tuar", 62),
                new Student("ijygoi", 6),
                new Student("annjjhka", 33)
        ));

       
        Collections.sort(list);
        System.out.println("Comparable: " + list);

       
        Comparator<Student> com = (s1, s2) -> Integer.compare(s1.age, s2.age);

        Collections.sort(list, com);
        System.out.println("Comparator: " + list);
    }
}