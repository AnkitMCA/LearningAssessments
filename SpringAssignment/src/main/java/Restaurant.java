import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Component
@Repository
@Controller

public class Restaurant {

    HotDrink hotDrink;

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    //@Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public Restaurant(){

    }

}

