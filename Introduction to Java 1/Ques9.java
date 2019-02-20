/*

Ques.9 Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices).

*/

enum Houses {
    ONEBHK(1000), TWOBHK(2000), THREEBHK(3000), FOURBHK(4000);

    private int price;

    Houses(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class Ques9 {

    public static void main(String[] args) {
        System.out.println("Each House Price:");
        for (Houses hp : Houses.values()) {
            System.out.println(hp + " costs " + hp.getPrice() + " Rupees.");
        }
    }
}
