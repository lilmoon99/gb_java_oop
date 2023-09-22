import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    List<BottleOfWater> productList;

    public BottleOfWaterVendingMachine(List<BottleOfWater> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = productList;
    }


    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public BottleOfWater getProduct(String name,int volume){
        for (BottleOfWater bottleOfWater: productList){
            if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                return bottleOfWater;
            }
        }
        return null;
    }

    public void addBottleOfWater(BottleOfWater bottle){
        this.productList.add(bottle);
    }
}
