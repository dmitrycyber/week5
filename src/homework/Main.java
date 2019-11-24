package homework;

import com.sun.javafx.webkit.theme.ScrollBarThemeImpl;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("-----------TASK1------------");
        FileReader fileReader = new FileReader("123.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String productString = "";
        Item item;
        Shop1 shop1 = new Shop1();

        while (productString != null) {
            productString = bufferedReader.readLine();
            if (productString == null) {
                break;
            }
            String[] split = productString.split(",");
            item = new Item(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
            shop1.putInShop(item);
        }
        System.out.println(shop1.getListOfItems());

        /*List<Integer> listOfIdsPurchasedItems1 = new ArrayList<>();
        listOfIdsPurchasedItems1.add(1);
        listOfIdsPurchasedItems1.add(1);
        Check check1 = shop1.getCheck(listOfIdsPurchasedItems1);
        System.out.println(check1);
*/
        /*System.out.println("\n" +"-----------TASK2------------");

        Shop2 shop2 = new Shop2();
        shop2.putInShop(keyboard1, 4);
        shop2.putInShop(keyboard1, 4);
        shop2.putInShop(mouse1, 4);
        shop2.putInShop(mouse2, 3);

        List<Integer> listOfIdsPurchasedItems2= new ArrayList<>();
        listOfIdsPurchasedItems2.add(1);
        listOfIdsPurchasedItems2.add(2);
        listOfIdsPurchasedItems2.add(2);
        listOfIdsPurchasedItems2.add(3);
        listOfIdsPurchasedItems2.add(3);
        listOfIdsPurchasedItems2.add(3);
        Check check2 = shop2.getCheck(listOfIdsPurchasedItems2);
        System.out.println(check2);
    }*/
}
}
