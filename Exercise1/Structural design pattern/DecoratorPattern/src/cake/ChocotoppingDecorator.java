package cake;

public class ChocotoppingDecorator extends CakeDecorator {
    public ChocotoppingDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public void bake() {
        decoratedCake.bake();
        addChocoLayer();
    }

    private void addChocoLayer() {
        System.out.println("Cake Topping Flavor: Chocolate");
    }
}
