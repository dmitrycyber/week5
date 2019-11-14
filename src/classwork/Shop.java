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

    public List<Integer> getListWithIdItem (){
        List<Integer> listIds = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listIds.add(list.get(i).getId());
        }
        return listIds;
    }


    public Map getCheck(List<Integer> listIds) {
        Map<Item, Integer> map = new HashMap();
        int count;
        for (int i = 0; i < listIds.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getId()) {
                    count++;
                }
            }
            map.put(list.get(i), count);
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
