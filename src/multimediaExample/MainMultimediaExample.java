package multimediaExample;

import multimediaExample.bluetooth.Impl.LaptopBluetoothConnection;
import multimediaExample.iot.IoTDevice;
import multimediaExample.iot.impl.Alexa;
import multimediaExample.speakers.LGSpeaker;
import multimediaExample.speakers.Speaker;
import multimediaExample.televisions.Television;

import java.util.Arrays;

public class MainMultimediaExample{

    final public Alexa alexa;

    public MainMultimediaExample(Alexa alexa) {
        this.alexa = alexa;
    }

    public static void connectTVDevices(IConnectable... devices) {
        System.out.println("Connecting devices");
        for (IConnectable connectable : devices
        ) {
            int size;
            if(connectable instanceof Television){
                size = ((Television) connectable).getScreenSize();
            }else{
                System.out.println("Skipping... Device is not compatible");
                continue;
            }
            System.out.printf("TV %d'': ",size);
            connectable.connect();
        }
    }

    public static void connectAlexaDevice(MultimediaDevice[] devices){
        final Alexa alexa = new Alexa();
        alexa.login("homs","1234");
        alexa.connectDeviceToNetwork("Skynet-2022",devices);
        alexa.disconnectDevicesFromNetwork(devices);
        alexa.logout();
        final Alexa alexa1;
        alexa1 = new Alexa();
    }

    public static IConnectable[] installDevices(){
        System.out.printf("Setting up devices...\n");
        IConnectable[] devices = new IConnectable[]{
                new Television(32),
                new Television(24),
                new Television(12),
                new Television(64),
                new Speaker(),
        };
        System.out.print("\n");
        return devices;
    }

    public static void connectToBluetooth(MultimediaDevice device){
        LaptopBluetoothConnection laptopBluetoothConnection = new LaptopBluetoothConnection("ASUS-ROG 2451",device.getDeviceId());
        laptopBluetoothConnection.pairDevice(device);
    }

    public static void main(String[] args) {

        IConnectable[] devices = installDevices();
        MultimediaDevice[] multimediaDevices = new MultimediaDevice[devices.length];

        for (int i = 0; i < devices.length; i++) {
            multimediaDevices[i] = (MultimediaDevice) devices[i];
        }
        
    }
}
