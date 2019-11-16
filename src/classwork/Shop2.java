package classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop2 implements ShopInter {
    private Map<Item, Integer> mapOfItems = new HashMap<>();

    public void putInShop(Item item, Integer countOfItem) {
        Integer integer = mapOfItems.get(item);
        if (integer == null) {
            integer = 0;
        }
        mapOfItems.put(item, countOfItem + integer);
    }

    public Map<Item, Integer> getMapOfItems() {
        return mapOfItems;
    }

    public Map<Item,Integer> getCheck(List<Integer> listIds) {
        for (int i = 0; i < listIds.size(); i++) {
            if (mapOfItems.get())
        }
        return mapOfItems;
    }

    /*public int getTotalPrice(List<Integer> listIds) {
        int sum = 0;
        for (int i = 0; i < mapOfItems.size(); i++) {
            for (int j = 0; j < listIds.size(); j++) {
                if (listIds.get(j) == mapOfItems.get(i).getId()) {
                    sum += mapOfItems.get(i).getPrice();
                }
            }
        }
        return sum;
    }

    public void printCheck (List<Integer> listIds) {
        Map map = getCheck(listIds);
        System.out.println(map);
        System.out.println("Total price: " + getTotalPrice(listIds));
    }*/
}
