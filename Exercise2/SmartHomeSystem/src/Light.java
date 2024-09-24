public class Light extends Device {
    private boolean isOn;

    public Light(int id) {
        super(id, "light");
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light " + id + " turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light " + id + " turned off.");
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}
