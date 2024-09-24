package adapter;

public class Winenspirits implements Specialproducts {
    @Override
    public void getwinenspirits(String itemname) {
        System.out.println("Wine and Spirits item: " + itemname);
    }

    @Override
    public void getperfumencosmetics(String itemname) {
        // do nothing
    }

    @Override
    public void getwatchesnjewlery(String itemname) {
        // do nothing
    }
}
