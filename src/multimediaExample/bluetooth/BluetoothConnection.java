package multimediaExample.bluetooth;

import multimediaExample.MultimediaDevice;

public abstract class BluetoothConnection {

    private final String masterDevice;
    private final String slaveDevice;

    public BluetoothConnection(String masterDevice, String slaveDevice) {
        this.masterDevice = masterDevice;
        this.slaveDevice = slaveDevice;
    }

    public String getMasterDevice() {
        return masterDevice;
    }

    public String getSlaveDevice() {
        return slaveDevice;
    }

    public abstract void pairDevice(MultimediaDevice device);

}
