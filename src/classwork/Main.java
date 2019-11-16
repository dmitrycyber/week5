package classwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Keyboard k = new Keyboard(1, 14, "Logitec");
        Mouse m1 = new Mouse(2, 66, "Acer");
        Mouse m2 = new Mouse(3, 88, "A4Tech");


        Shop2 shop2 = new Shop2();
        shop2.putInShop(k, 4);
        shop2.putInShop(k, 4);
        shop2.putInShop(m1, 4);
        System.out.println(shop2.getMapOfItems());

        List<Integer> listOfIdsPurchasedItems= new ArrayList<>();
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(2);
        listOfIdsPurchasedItems.add(2);
        listOfIdsPurchasedItems.add(2);
        listOfIdsPurchasedItems.add(2);


        shop2.getCheck(listOfIdsPurchasedItems);
        System.out.println(shop2.getMapOfItems());




        /*Shop1 shop = new Shop1();
        shop.putInShop(k);
        shop.putInShop(m);
        shop.putInShop(m1);
        shop.putInShop(m2);

        List<Integer> listOfIdsPurchasedItems= new ArrayList<>();
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(1);
        listOfIdsPurchasedItems.add(3);

        shop.printCheck(listOfIdsPurchasedItems);*/

    }
}
