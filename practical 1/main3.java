public class main3 {
    public static void main(String[] args) {
        OnlineShoppingPortal p = new OnlineShoppingPortal();
        p.checkout(2000);
        p.checkout(100);
        p.checkout(100,"GET10");
        p.checkout(1000, "GET10");
    }
}
