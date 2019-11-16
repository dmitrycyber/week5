package homework;

import java.util.List;
import java.util.Map;

public interface ShopInter {
    Map getCheck(List<Integer> listIds);
    int getTotalPrice(List<Integer> listIds);
    void printCheck (List<Integer> listIds);
}
