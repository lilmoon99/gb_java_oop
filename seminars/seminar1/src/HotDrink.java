public class HotDrink extends Product {

    private int temperature;
    private double value;


    /**
     *
     * @param name Name of hot drink
     * @param price Price for a cup
     * @param value Value of a cup
     * @param temperature Temperature of drink
     */
    public HotDrink(String name, int price, double value, int temperature) {
        super(name, price);
        this.value = value;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString() + " Value: " + value +
                " Temperature: " + temperature;
    }
}
