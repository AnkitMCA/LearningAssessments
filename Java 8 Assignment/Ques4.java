/*
 *
 * Ques.4 Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference.
 *
 * */

interface ConstructorReferDemo {
    Employee getConstructor(String name, int age, String city);
}

class Employee {
    String name;
    int age;
    String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Ques4 {
    public static void main(String args[]) {
        ConstructorReferDemo constructorReferDemo = Employee::new;
        System.out.println(constructorReferDemo.getConstructor("Ankit", 21, "Delhi"));
        System.out.println(constructorReferDemo.getConstructor("Sumit", 18, "Ghaziabad"));
    }
}
