package homework;

import java.util.HashMap;
import java.util.Map;

public class Check {
    private Map<Item, Integer> addedItems = new HashMap<>();
    private Integer priceOfAddedItems = 0;

    public Map<Item, Integer> getAddedItems() {
        return addedItems;
    }

    public Integer getPriceOfAddedItems() {
        return priceOfAddedItems;
    }

    public void setPriceOfAddedItems(Integer priceOfAddedItems) {
        this.priceOfAddedItems = priceOfAddedItems;
    }

    @Override
    public String toString() {
        return "Check: \n" +
                addedItems +
                "\n================\n" +
                "Total price: " + priceOfAddedItems;
    }
}
