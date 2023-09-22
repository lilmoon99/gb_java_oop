import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<BottleOfWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleOfWater("Шишкин лес",50,1));
        listProduct.add(new BottleOfWater("OOPseminar",7,2));
        listProduct.add(new BottleOfWater("OOPlec",7,1));
        listProduct.add(new BottleOfWater("DZ",5,4));
        listProduct.add(new BottleOfWater("JAVA",20,100));
        listProduct.add(new BottleOfWater("Test",12,5));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);

        System.out.println(vendingMachine.getProduct("OOPseminar"));
        Stream <BottleOfWater>stream = vendingMachine.getProductList().stream();
        stream.forEach(System.out::println);
    }
}