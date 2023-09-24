import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HomeWorkMain {
    public static void main(String[] args) {
        HotDrink coffee1 = new HotDrink("Cappuccino", 100, 0.3, 68);
        HotDrink coffee2 = new HotDrink("Latte", 110, 0.3, 67);
        HotDrink coffee3 = new HotDrink("Espresso", 75, 0.075, 80);

        List<HotDrink> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(coffee1);
        hotDrinksList.add(coffee2);
        hotDrinksList.add(coffee3);
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(hotDrinksList);
        HotDrink coffee4 = new HotDrink("Mokko", 150, 0.3, 65);
        hotDrinkVendingMachine.addHotDrink(coffee4);
//        Stream<HotDrink> drinkStream = hotDrinkVendingMachine.getHotDrinks().stream();
//        drinkStream.forEach(System.out::println);

        System.out.println(hotDrinkVendingMachine.getProduct("Mokko"));
        System.out.println(hotDrinkVendingMachine.getProduct("Latte",0.4));
        System.out.println(hotDrinkVendingMachine.getProduct("Espresso",0.075,80));

    }
}
