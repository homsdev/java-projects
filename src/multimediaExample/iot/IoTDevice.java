package multimediaExample.iot;

import multimediaExample.IConnectable;

public class IoTDevice {

    private String network;

    public final void setNetwork(String network) {
        this.network = network;
    }

    protected void connectDeviceToNetwork(IConnectable... devices){
        System.out.printf("Connecting devices to network: %s\n",network);
        for (IConnectable device:
             devices) {
            device.connect();
        }
    }

    public final void disconnectDevicesFromNetwork(IConnectable... devices){
        System.out.printf("Disconnecting devices from network: %s\n",network);
        for (IConnectable device:
                devices) {
            device.disconnect();
        }
    }

}
