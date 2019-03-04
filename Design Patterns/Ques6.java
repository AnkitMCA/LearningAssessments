/*
*
* Ques.6 Implement Decorator pattern to decorate the Pizza with topings.
 *
* */
interface Pizza{
    String info();
}

class TopingsPizza implements Pizza {
    private Pizza pizza;
    private String info;

    public TopingsPizza(Pizza pizza){
        this.pizza=pizza;
        info="Topings";
    }
    @Override
    public String info() {
        return pizza.info()+" "+info;
    }
}

class NeapolitanPizza implements Pizza {

    private String info;
    public NeapolitanPizza(){
        info="Neapolitan Pizza";
    }
    @Override
    public String info() {
        return info;
    }
}

class ChicagoPizza implements Pizza {

    private String info;
    public ChicagoPizza() {
        this.info = "Chicago Pizza";
    }
    @Override
    public String info() {
        return info;
    }
}

public class Ques6 {

    public static void main(String args[]) {

        Pizza pizza=new NeapolitanPizza();
        System.out.println(pizza.info());

        TopingsPizza topingsPizza=new TopingsPizza(pizza);
        System.out.println(topingsPizza.info());
    }
}
