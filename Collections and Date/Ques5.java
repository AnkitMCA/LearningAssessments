/*

Ques.5 Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age.

*/

import java.util.*;

class Student {

    String name;
    Double score;
    Double age;

    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}' + "\n";
    }
}

public class Ques5 {

    public static void main(String args[]) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adi", 78.5, 20.0));
        studentList.add(new Student("Sanju", 69.3, 21.0));
        studentList.add(new Student("Aman", 72.9, 18.0));
        studentList.add(new Student("Manu", 69.3, 22.0));
        studentList.add(new Student("Sumit", 78.5, 19.0));

        System.out.println("Original List : \n" + studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score.equals(o2.score)) {
                    return o1.name.compareTo(o2.name);
                } else {
                    return o1.score.compareTo(o2.score);
                }
            }
        });
        System.out.println("Sorted List : ");
        ListIterator listIterator = studentList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
    }
}
