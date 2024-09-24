package adapter;

public class DiorstoreAdapter implements Diorstore {
    private Specialproducts specialproducts;

    public DiorstoreAdapter(String producttype) {
        if (producttype.equalsIgnoreCase("winenspirits")) {
            specialproducts = new Winenspirits();
        } else if (producttype.equalsIgnoreCase("perfumencosmetics")) {
            specialproducts = new Perfumencosmetics();
        } else if (producttype.equalsIgnoreCase("watchesnjewlery")) {
            specialproducts = new Watchesnjewlery();
        }
    }

    @Override
    public void getproducts(String producttype, String itemname) {
        if (producttype.equalsIgnoreCase("winenspirits")) {
            specialproducts.getwinenspirits(itemname);
        } else if (producttype.equalsIgnoreCase("perfumencosmetics")) {
            specialproducts.getperfumencosmetics(itemname);
        } else if (producttype.equalsIgnoreCase("watchesnjewlery")) {
            specialproducts.getwatchesnjewlery(itemname);
        }
    }
}
