package cake;

public abstract class CakeDecorator implements Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake decoratedCake) {
        this.decoratedCake = decoratedCake;
    }

    @Override
    public void bake() {
        decoratedCake.bake();
    }
}
