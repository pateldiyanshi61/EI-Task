package adapter;

public class Productsinstore implements Diorstore {
    private DiorstoreAdapter diorstoreAdapter;

    @Override
    public void getproducts(String producttype, String itemname) {
        if (producttype.equalsIgnoreCase("fashionnleathergoods")) {
            System.out.println("Fashion and Leather Goods item: " + itemname);
        } else if (producttype.equalsIgnoreCase("winenspirits") ||
                producttype.equalsIgnoreCase("watchesnjewlery") ||
                producttype.equalsIgnoreCase("perfumencosmetics")) {
            diorstoreAdapter = new DiorstoreAdapter(producttype);
            diorstoreAdapter.getproducts(producttype, itemname);
        } else {
            System.out.println("Product type '" + producttype + "' is not available.");
        }
    }
}
