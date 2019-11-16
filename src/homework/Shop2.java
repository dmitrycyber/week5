package homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop2 implements ShopInter {
    private Map<Item, Integer> mapOfItems = new HashMap<>();

    void putInShop(Item item, Integer countOfItem) {
        Integer integer = mapOfItems.get(item);
        if (integer == null) {
            integer = 0;
        }
        mapOfItems.put(item, countOfItem + integer);
    }

    private Map<Item,Integer> deleteItemsFromMap(List<Integer> listIds) {
        boolean isEnoughItems = true;
        Item item = new Keyboard(1, 3, "123");
        for (int i = 0; i < listIds.size(); i++) {
            for (Map.Entry<Item, Integer> entry : mapOfItems.entrySet()) {
                if (listIds.get(i) == entry.getKey().getId() && entry.getValue() > 1) {
                    isEnoughItems = true;
                    entry.setValue(entry.getValue()-1);
                }
                else if (listIds.get(i) == entry.getKey().getId() && entry.getValue() == 1) {
                    isEnoughItems = false;
                    item = entry.getKey();
                }
            }
            if (!isEnoughItems) {
                mapOfItems.remove(item);
            }
        }
        return mapOfItems;
    }

    public Map<String, Integer> getCheck(List<Integer> listIds) {
        Map<String, Integer> checkMap = new HashMap<>();
        for (Map.Entry<Item, Integer> entry : mapOfItems.entrySet()) {
            int count = 0;
            for (int i = 0; i < listIds.size(); i++) {
                if (listIds.get(i) == entry.getKey().getId()) {
                    count++;
                    checkMap.put(entry.getKey().getName(), count);
                }
            }
        }
        return checkMap;
    }

    public int getTotalPrice(List<Integer> listIds) {
        int sum = 0;
        for (int i = 0; i < listIds.size(); i++) {
            for (Map.Entry<Item, Integer> entry : mapOfItems.entrySet()) {
                if (listIds.get(i) == entry.getKey().getId()) {
                    sum += entry.getKey().getPrice();
                }
            }
        }
        return sum;
    }

    public void printCheck (List<Integer> listIds) {
        for (Map.Entry<String, Integer> entry : getCheck(listIds).entrySet()) {
            System.out.println(entry);
        }
        System.out.println("================");
        System.out.println("Total price: " + getTotalPrice(listIds));
    }
}
