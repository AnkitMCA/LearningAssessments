/*
*
* Ques.1 Implement Singleton Design Pattern on a dummy class.
 *
* */

class SingletonDesignedClass {

    static public SingletonDesignedClass obj;

    int id;
    String name;
    private SingletonDesignedClass() {
        id=234;
        name="Sumit";
    }

    public static SingletonDesignedClass getInstance(){
        if (obj==null) {
            obj=new SingletonDesignedClass();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "SingletonDesignedClass{" +
                "ID = " + id +
                ", Name = " + name +
                '}';
    }
}

public class Ques1 {
    public static void main(String args[]) {
        SingletonDesignedClass obj1 = SingletonDesignedClass.getInstance();
        SingletonDesignedClass obj2 = SingletonDesignedClass.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
