package homework;

import java.util.Map;

public class Check {
    private Map<Item, Integer> addedItems;
    private Integer priceOfAddedItems;

    public Check (Map<Item, Integer> addedItems, Integer priceOfAddedItems) {
        this.addedItems = addedItems;
        this.priceOfAddedItems = priceOfAddedItems;

    }

    public Check addToCheck() {
        for (Map.Entry<Item, Integer> entry : addedItems.entrySet()) {
            priceOfAddedItems += entry.getKey().getPrice()*entry.getValue();
        }
        return new Check(addedItems, priceOfAddedItems);
    }

    public Map<Item, Integer> getAddedItems() {
        return addedItems;
    }

    public void setAddedItems(Map<Item, Integer> addedItems) {
        this.addedItems = addedItems;
    }

    public Integer getPriceOfAddedItems() {
        return priceOfAddedItems;
    }

    public void setPriceOfAddedItems(Integer priceOfAddedItems) {
        this.priceOfAddedItems = priceOfAddedItems;
    }
}
