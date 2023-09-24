import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    private List<HotDrink> hotDrinks;

    /**
     *
     * @param hotDrinks constructor receives list with hot drinks
     */
    public HotDrinkVendingMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public void addHotDrink(HotDrink hd){
        this.hotDrinks.add(hd);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    /**
     *
     * @param name Hot drink searched in vending machine
     * @return product if it exists in vending machine, null if not exists
     */
    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinks) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     *
     * @param name Hot drink searched in vending machine
     * @param value Value of searched hot drink
     * @return product if it exists in vending machine, null if not exists
     */
    public HotDrink getProduct(String name,double value){
        for(HotDrink product: hotDrinks){
            if (product.getName().equals(name) && product.getValue() == value){
                return product;
            }
        }
        return null;
    }

    /**
     *
     * @param name Hot drink searched in vending machine
     * @param value Value of searched hot drink
     * @param temperature Temperature of searched drink
     * @return product if it exists in vending machine, null if not exists
     */
    public HotDrink getProduct(String name,double value,int temperature){
        for(HotDrink product: hotDrinks){
            if (product.getName().equals(name) && product.getValue() == value && product.getTemperature() == temperature){
                return product;
            }
        }
        return null;
    }
}
