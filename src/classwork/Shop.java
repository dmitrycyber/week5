package classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private List<Item> list = new ArrayList<>();


    public void putInShop (Item item) {
        list.add(item);
    }

    public List<Item> getList() {
        return list;
    }

    public Map getCheck() {
        Map<Item, Integer> map = new HashMap();
        int count;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getClass().equals(list.get(i).getClass())) {
                    count++;
                }
                map.put(list.get(i), count);
            }
        }
        return map;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getPrice();
        }
        return sum;
    }

    public void printCheck () {

        Map map = getCheck();
        System.out.println(map);
        System.out.println(getTotalPrice());
    }
}
