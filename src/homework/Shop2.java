package homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop2 implements Shop {
    private Map<Item, Integer> mapOfItems = new HashMap<>();
    private Map<Integer, Item> idsOfItems = new HashMap<>();
    private Check check;

    void putInShop(Item item, Integer countOfItem) {
        if (item == null || countOfItem == null) {
            return;
        }
        Integer integer = mapOfItems.get(item);
        if (integer == null) {
            integer = 0;
        }
        mapOfItems.put(item, countOfItem + integer);
        idsOfItems.put(item.getId(), item);
    }

    public Map<Item, Integer> getMapOfItems (){
        return mapOfItems;
    }

    public Check getCheck(List<Integer> listIds) {
        Map<Item, Integer> checkMap = new HashMap<>();
        Integer count;
        for (int i = 0; i < listIds.size(); i++) {
            count = 0;
            for (int j = 0; j < listIds.size(); j++) {
                if (listIds.get(i).equals(listIds.get(j))) {
                    count ++;
                }
            }
            if (count < mapOfItems.get(idsOfItems.get((listIds.get(i))))) {
                checkMap.put(idsOfItems.get(listIds.get(i)), count);
            }
            else {
                checkMap.put(idsOfItems.get(listIds.get(i)), mapOfItems.get(idsOfItems.get((listIds.get(i)))));
            }
        }
        check = new Check(checkMap, 0);
        check.addToCheck();
        deleteBuyingItemsFromShop(check);
        return check;
    }

    public void deleteBuyingItemsFromShop(Check check){
        Map<Item, Integer> mapOfAddedItemsToCheck = check.getAddedItems();
        for (Map.Entry<Item, Integer> entry : mapOfAddedItemsToCheck.entrySet()) {
            if (mapOfItems.get(entry.getKey()) > entry.getValue()) {
                mapOfItems.put(entry.getKey(), mapOfItems.get(entry.getKey()) - entry.getValue());
            }
            else {
                mapOfItems.remove(entry.getKey());
            }
        }
    }

    public void printCheck() {
        Map<Item, Integer> map = check.getAddedItems();
        for (Map.Entry<Item, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("================");
        System.out.println("Total price: " + check.getPriceOfAddedItems());
    }

    public void setMapOfItems(Map<Item, Integer> mapOfItems) {
        this.mapOfItems = mapOfItems;
    }

    public Map<Integer, Item> getIdsOfItems() {
        return idsOfItems;
    }

    public void setIdsOfItems(Map<Integer, Item> idsOfItems) {
        this.idsOfItems = idsOfItems;
    }
}
