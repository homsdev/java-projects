package multimediaExample.bluetooth.Impl;

import multimediaExample.MultimediaDevice;
import multimediaExample.bluetooth.BluetoothConnection;

public class LaptopBluetoothConnection extends BluetoothConnection {

    public LaptopBluetoothConnection(String masterDevice, String slaveDevice) {
        super(masterDevice, slaveDevice);
    }

    @Override
    public void pairDevice(MultimediaDevice device) {
        final MultimediaDevice d1 = device;
        System.out.printf("Device %s is connecting with %s", getSlaveDevice(), getMasterDevice());
        d1.connect();
        System.out.println("New device is connected");
    }
}
