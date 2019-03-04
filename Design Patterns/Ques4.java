/*
*
* Ques.4 Implement Builder pattern to create a student object with more than 6 fields.
 *
* */

class Student {
    private int rollNum;
    private String name;
    private String father;
    private int age;
    private int classname;
    private String section;

    public Student(StudentBuilder studentBuilder) {
        rollNum=studentBuilder.getRollNum();
        name=studentBuilder.getName();
        father=studentBuilder.getFather();
        age=studentBuilder.getAge();
        classname=studentBuilder.getClassname();
        section=studentBuilder.getSection();
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassname() {
        return classname;
    }

    public void setClassname(int classname) {
        this.classname = classname;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", age=" + age +
                ", classname=" + classname +
                ", section='" + section + '\'' +
                '}';
    }
}

class StudentBuilder {
    private int rollNum;
    private String name;
    private String father;
    private int age;
    private int classname;
    private String section;

    public StudentBuilder(String name,int rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }

    public Student build() {
        return new Student(this);
    }

    public int getRollNum() {
        return rollNum;
    }

    public StudentBuilder setRollNum(int rollNum) {
        this.rollNum = rollNum;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getFather() {
        return father;
    }

    public StudentBuilder hasFather(String father) {
        this.father = father;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder hasAge(int age) {
        this.age = age;
        return this;
    }

    public int getClassname() {
        return classname;
    }

    public StudentBuilder hasClassname(int classname) {
        this.classname = classname;
        return this;
    }

    public String getSection() {
        return section;
    }

    public StudentBuilder hasSection(String section) {
        this.section = section;
        return this;
    }
}

public class Ques4 {

    public static void main(String args[]) {

        Student student= new StudentBuilder("Sumit Thakur",24)
                .hasAge(18)
                .hasClassname(12)
                .hasFather(" ")
                .hasSection("C").build();
        System.out.println(student);
    }
}
