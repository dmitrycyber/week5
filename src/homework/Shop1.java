package homework;

import java.util.ArrayList;
import java.util.List;


public class Shop1 implements Shop {
    private List<Item> listOfItems = new ArrayList<>();

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    void putInShop(Item item) {
        if (item == null) {
            return;
        }
        listOfItems.add(item);
    }

    public Check getCheck(List<Integer> listIds) {
        Check check = new Check();
        Integer idOfBuyingItem;
        Integer idOfItemInShop;
        Item itemInShop;
        for (int i = 0; i < listOfItems.size(); i++) {
            itemInShop = listOfItems.get(i);
            idOfItemInShop = itemInShop.getId();
            int count = 0;
            for (int j = 0; j < listIds.size(); j++) {
                idOfBuyingItem = listIds.get(j);
                if (idOfBuyingItem.equals(idOfItemInShop)) {
                    count++;
                    check.getAddedItems().put(itemInShop, count);
                    check.setPriceOfAddedItems(check.getPriceOfAddedItems() + itemInShop.getPrice());
                }
            }
        }
        return check;
    }
}

