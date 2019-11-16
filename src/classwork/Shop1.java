package classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop1 implements ShopInter {
    private List<Item> listOfItems = new ArrayList<>();

    void putInShop(Item item) {
        listOfItems.add(item);
    }

    public Map getCheck(List<Integer> listIds) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < listOfItems.size(); i++) {
            int count = 0;
            for (int j = 0; j < listIds.size(); j++) {
                if (listIds.get(j) == listOfItems.get(i).getId()) {
                    count++;
                    map.put(listOfItems.get(i).getName(), count);
                }
            }
        }
        return map;
    }

    public int getTotalPrice(List<Integer> listIds) {
        int sum = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            for (int j = 0; j < listIds.size(); j++) {
                if (listIds.get(j) == listOfItems.get(i).getId()) {
                    sum += listOfItems.get(i).getPrice();
                }
            }
        }
        return sum;
    }

    public void printCheck (List<Integer> listIds) {
        Map<String, Integer> map= getCheck(listIds);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("================");
        System.out.println("Total price: " + getTotalPrice(listIds));
    }
}
