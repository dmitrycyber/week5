package homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop2 implements Shop {
    private Map<Item, Integer> mapOfItems = new HashMap<>();
    private Map<Integer, Item> idsOfItems = new HashMap<>();
    //private Check check;

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
        Check check = new Check();
        Integer countOfItemsInCheck;
        Integer countOfItemsInShop;
        for (int i = 0; i < listIds.size(); i++) {
            Item buyingItem = idsOfItems.get(listIds.get(i));
            countOfItemsInCheck = check.getAddedItems().get(buyingItem);
            countOfItemsInShop = mapOfItems.get(buyingItem);
            if (countOfItemsInCheck == null) {
                countOfItemsInCheck = 0;
            }
            check.getAddedItems().put(buyingItem, countOfItemsInCheck + 1);
            check.setPriceOfAddedItems(check.getPriceOfAddedItems() + buyingItem.getPrice());
            if (countOfItemsInShop > 1) {
                mapOfItems.put(buyingItem, countOfItemsInShop - 1);
            }
            else {
                mapOfItems.remove(buyingItem);
            }
        }
        return check;
    }

    public Map<Integer, Item> getIdsOfItems() {
        return idsOfItems;
    }

}
