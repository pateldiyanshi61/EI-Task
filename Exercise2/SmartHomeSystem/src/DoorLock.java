public class DoorLock extends Device {
    private boolean isLocked;

    public DoorLock(int id) {
        super(id, "door");
        this.isLocked = true;
    }

    public void lock() {
        isLocked = true;
        System.out.println("Door " + id + " locked.");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Door " + id + " unlocked.");
    }

    @Override
    public void turnOn() {
        unlock();
    }

    @Override
    public void turnOff() {
        lock();
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }
}
