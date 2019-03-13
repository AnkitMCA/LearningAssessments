import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Component
@Repository
@Controller

class Tea implements HotDrink {

    @Override
    public Restaurant prepareHotDrink() {
        System.out.println("........Tea.........");
        return null;
    }
}