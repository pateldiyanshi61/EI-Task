package adapter;

public class Watchesnjewlery implements Specialproducts {
    @Override
    public void getwinenspirits(String itemname) {
        // do nothing
    }

    @Override
    public void getperfumencosmetics(String itemname) {
        // do nothing
    }

    @Override
    public void getwatchesnjewlery(String itemname) {
        System.out.println("Watches and Jewelry item: " + itemname);
    }
}
