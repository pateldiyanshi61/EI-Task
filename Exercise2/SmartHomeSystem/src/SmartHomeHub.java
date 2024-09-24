import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<Device> devices;

    public SmartHomeHub() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Added " + device.getType() + " with ID: " + device.getId());
    }

    public void removeDevice(int id) {
        devices.removeIf(device -> device.getId() == id);
        System.out.println("Removed device with ID: " + id);
    }

    public void turnOnDevice(int id) {
        devices.stream()
                .filter(device -> device.getId() == id)
                .findFirst()
                .ifPresent(Device::turnOn);
    }

    public void turnOffDevice(int id) {
        devices.stream()
                .filter(device -> device.getId() == id)
                .findFirst()
                .ifPresent(Device::turnOff);
    }

    public void reportStatus() {
        devices.forEach(device -> System.out.println(device.getStatus()));
    }

    // Method to get a device by ID
    public Device getDeviceById(int id) {
        return devices.stream().filter(device -> device.getId() == id).findFirst().orElse(null);
    }
}
