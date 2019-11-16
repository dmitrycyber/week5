package classwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Keyboard k = new Keyboard(1, 14, "Logitec");
        Mouse m1 = new Mouse(2, 66, "Acer");
        Mouse m2 = new Mouse(3, 88, "A4Tech");

        System.out.println("-----------TASK1------------");

        Shop1 shop = new Shop1();
        shop.putInShop(k);
        shop.putInShop(m1);
        shop.putInShop(m2);
        List<Integer> listOfIdsPurchasedItems1= new ArrayList<>();
        listOfIdsPurchasedItems1.add(1);
        listOfIdsPurchasedItems1.add(1);
        listOfIdsPurchasedItems1.add(3);
        shop.printCheck(listOfIdsPurchasedItems1);

        System.out.println("\n" +"-----------TASK2------------");

        Shop2 shop2 = new Shop2();
        shop2.putInShop(k, 4);
        shop2.putInShop(k, 4);
        shop2.putInShop(m1, 4);
        shop2.putInShop(m2, 3);

        List<Integer> listOfIdsPurchasedItems2= new ArrayList<>();
        listOfIdsPurchasedItems2.add(1);
        listOfIdsPurchasedItems2.add(2);
        listOfIdsPurchasedItems2.add(2);
        listOfIdsPurchasedItems2.add(2);
        listOfIdsPurchasedItems2.add(3);
        listOfIdsPurchasedItems2.add(3);
        listOfIdsPurchasedItems2.add(3);
        shop2.printCheck(listOfIdsPurchasedItems2);






    }
}
