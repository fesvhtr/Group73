package entity;

import util.FileOperator;
import java.util.List;


public class DeviceManager {
    private List<Device> devices;
    private static DeviceManager singletonInstance;

    private DeviceManager() {
        devices = FileOperator.loadData("Devices.json", Device.class);
    }

    //实现单例模式
    public static DeviceManager getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new DeviceManager();
        }
        return singletonInstance;
    }

    public void addDevice(Device device) {
        devices.add(device);
        FileOperator.writeData(device, "Devices.json");
    }

    public void delDevice(Device device) {
        devices.remove(device);
        FileOperator.writeData(devices, "Devices.json");
    }

    public List<Device> getDevices() {
        return devices;
    }
}
