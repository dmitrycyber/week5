package homework;

import com.sun.javafx.webkit.theme.ScrollBarThemeImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/homework/123.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String productString = bufferedReader.readLine();

        String[] split = productString.split(",");

        Item item = new Item(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]));
        System.out.println(item);






        /*Keyboard keyboard1 = new Keyboard(1, 14, "Logitec");
        Mouse mouse1 = new Mouse(2, 66, "Acer");
        Mouse mouse2 = new Mouse(3, 88, "A4Tech");

        System.out.println("-----------TASK1------------");

        Shop1 shop1 = new Shop1();
        shop1.putInShop(keyboard1);
        shop1.putInShop(mouse1);
        shop1.putInShop(mouse2);
        List<Integer> listOfIdsPurchasedItems1 = new ArrayList<>();
        listOfIdsPurchasedItems1.add(1);
        listOfIdsPurchasedItems1.add(1);
        listOfIdsPurchasedItems1.add(3);
        listOfIdsPurchasedItems1.add(3);
        listOfIdsPurchasedItems1.add(3);
        Check check1 = shop1.getCheck(listOfIdsPurchasedItems1);
        System.out.println(check1);

        System.out.println("\n" +"-----------TASK2------------");

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
        System.out.println(check2);*/
    }
}
