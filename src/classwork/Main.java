package classwork;

public class Main {
    public static void main(String[] args) {
        Keyboard k = new Keyboard(1, 14, "Logitec");
        Mouse m = new Mouse(2, 66, "Acer");
        Mouse m1 = new Mouse(2, 66, "Acer");

        Shop shop = new Shop();
        shop.putInShop(k);
        shop.putInShop(m);
        shop.putInShop(m1);

        shop.printCheck();

    }
}
