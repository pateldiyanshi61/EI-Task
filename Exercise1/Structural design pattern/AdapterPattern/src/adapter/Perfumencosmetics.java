package adapter;

public class Perfumencosmetics implements Specialproducts {
    @Override
    public void getwinenspirits(String itemname) {
        // do nothing
    }

    @Override
    public void getperfumencosmetics(String itemname) {
        System.out.println("Perfume and Cosmetics item: " + itemname);
    }

    @Override
    public void getwatchesnjewlery(String itemname) {
        // do nothing
    }
}
