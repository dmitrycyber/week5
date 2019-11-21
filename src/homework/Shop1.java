package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop1 implements Shop {
    private List<Item> listOfItems = new ArrayList<>();
    private Check check;

    void putInShop(Item item) {
        if (item == null) {
            return;
        }
        listOfItems.add(item);
    }

    public Check getCheck(List<Integer> listIds) {
        Map<Item, Integer> map = new HashMap();
        for (int i = 0; i < listOfItems.size(); i++) {
            int count = 0;
            for (int j = 0; j < listIds.size(); j++) {
                if (listIds.get(j) == listOfItems.get(i).getId()) {
                    count++;
                    map.put(listOfItems.get(i), count);
                }
            }
        }
        check = new Check(map, 0);
        check.addToCheck();
        return check;
    }

    public void printCheck() {
        Map<Item, Integer> map = check.getAddedItems();
        for (Map.Entry<Item, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("================");
        System.out.println("Total price: " + check.getPriceOfAddedItems());
    }
}
