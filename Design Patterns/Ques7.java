/*
*
* Ques.7 Implement Composite Design Pattern to maintaing the directories of employees on the basis of departments.
 *
* */

import java.util.ArrayList;
import java.util.List;

interface Directory{
    void directoryDetails();
}

class Engineer implements Directory{

    String name;
    String competency;

    public Engineer(String name, String competency) {
        this.name = name;
        this.competency = competency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    @Override
    public void directoryDetails() {
        System.out.println("Name: "+getName()+ " Competency: "+getCompetency());
    }
}

class HumanResource implements Directory{

    String name;
    String type;

    public HumanResource(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void directoryDetails() {
        System.out.println(name + " " + type);
    }
}

class DepartmantDirectory implements Directory {
    List<Directory> departmantDirectory = new ArrayList<Directory>();

    @Override
    public void directoryDetails() {
        System.out.println("Department Details");
        departmantDirectory.forEach(e -> e.directoryDetails());
    }
}

class EngineerDirectory implements Directory {

    List<Directory> engineerDirectory = new ArrayList<Directory>();
    @Override
    public void directoryDetails() {
        System.out.println("Engineer diretory");
        engineerDirectory.forEach(e->e.directoryDetails());
    }
}

class HumanResourceDirectory implements Directory {

    List<Directory> humanResourceDirectory=new ArrayList<Directory>();

    @Override
    public void directoryDetails() {
        System.out.println("Human Resource Directory Details");
        humanResourceDirectory.forEach(e->e.directoryDetails());
    }
}

public class Ques7 {

    public static void main(String args[]) {

        Engineer engineer=new Engineer("Ankit","JVM");
        Engineer engineer1=new Engineer("Sumit","Python");

        HumanResource humanResource=new HumanResource("Arzoo","H. R.");
        HumanResource humanResource1=new HumanResource("Another","Others");

        EngineerDirectory engineerDirectory=new EngineerDirectory();
        engineerDirectory.engineerDirectory.add(engineer);
        engineerDirectory.engineerDirectory.add(engineer1);

        HumanResourceDirectory humanResourceDirectory=new HumanResourceDirectory();
        humanResourceDirectory.humanResourceDirectory.add(humanResource);
        humanResourceDirectory.humanResourceDirectory.add(humanResource1);

        DepartmantDirectory departmantDirectory=new DepartmantDirectory();
        departmantDirectory.departmantDirectory.add(engineerDirectory);
        departmantDirectory.departmantDirectory.add(humanResourceDirectory);

        departmantDirectory.directoryDetails();


    }

}

