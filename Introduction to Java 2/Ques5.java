/*

Ques.5 WAP to show object cloning in java using cloneable and copy constructor both.

*/

class Name implements Cloneable{

    private String stname;

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class CopyConstructorDemo{

    private int id;

    public CopyConstructorDemo(int id) {
        this.id = id;
    }

    CopyConstructorDemo(CopyConstructorDemo ccd){
        id = ccd.id;
    }

    @Override
    public String toString() {
        return ""+id;
    }
}


public class Ques5 {

    public static void main(String[] args) {

        System.out.println("Cloneable Interface Demo");

        try {
            Name obj1 = new Name();
            obj1.setStname("Ankit");
            Name obj2 = (Name) obj1.clone();
            System.out.println("Name in obj1 : "+obj1.getStname());
            System.out.println("Name in obj2 : "+obj2.getStname());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\nCopy Constructor Demo");

        CopyConstructorDemo ccd = new CopyConstructorDemo(123);
        CopyConstructorDemo ccd2 = new CopyConstructorDemo(ccd);
        CopyConstructorDemo ccd3 = ccd2;
        System.out.println("Id in ccd1 : "+ccd);
        System.out.println("Id in ccd2 : "+ccd2);

    }
}
