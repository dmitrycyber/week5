package homework;

import java.util.HashMap;
import java.util.Map;

public class Check {
    private Map<Item, Integer> addedItems = new HashMap<>();
    private Integer priceOfAddedItems = 0;

    public void addItemsToCheck(Item item){
        if (item == null) {
            return;
        }
        Integer integer = addedItems.get(item);
        if (integer == null) {
            integer = 1;
            addedItems.put(item, integer);
        }
        else {
            addedItems.put(item, addedItems.get(item) + 1);
        }
        priceOfAddedItems += item.getPrice();
    }

    @Override
    public String toString() {
        return "Check: \n" +
                addedItems +
                "\n================\n" +
                "Total price: " + priceOfAddedItems;
    }
}
