
import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Map<String,Integer> car = new HashMap<>();
        car.put("Lexus", 2009);
        car.put("BMW", 2020);
        car.put("Honda",2000);
        System.out.println(car.keySet());
        System.out.println(car.values());
        System.out.println(car);



    }
}
