package classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private List<Item> listOfItems = new ArrayList<>();


    public void putInShop (Item item) {
        listOfItems.add(item);
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public List<Integer> getListWithIdItem (){
        List<Integer> listIds = new ArrayList<>();
        for (int i = 0; i < listOfItems.size(); i++) {
            listIds.add(listOfItems.get(i).getId());
        }
        return listIds;
    }


    public Map getCheck(List<Integer> listIds) {
        Map<String, Integer> map = new HashMap();
        int count;
        int index;
        for (int i = 0; i < listIds.size(); i++) {
            count = 0;
            index = 0;
            for (int j = 0; j < listOfItems.size(); j++) {
                if (listIds.get(i) == listOfItems.get(j).getId()) {
                    count++;
                    index = j;
                }
            }
            map.put(listOfItems.get(index).getName(), count);
        }
        return map;
    }

    public int getTotalPrice() {
        int sum = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            sum += listOfItems.get(i).getPrice();
        }
        return sum;
    }

    public void printCheck () {
        Map map = getCheck();
        System.out.println(map);
        System.out.println(getTotalPrice());
    }
}
