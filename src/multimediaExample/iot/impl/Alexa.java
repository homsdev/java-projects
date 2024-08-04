package multimediaExample.iot.impl;

import multimediaExample.IConnectable;
import multimediaExample.MultimediaDevice;
import multimediaExample.iot.IoTDevice;

public class Alexa extends IoTDevice {

    @Override
    public void connectDeviceToNetwork(IConnectable... devices) {
        System.out.println("Alexa is connecting to devices");
        super.connectDeviceToNetwork(devices);
    }

    public void connectDeviceToNetwork(String networkName, IConnectable... devices) {
        setNetwork(networkName);
        System.out.println("Alexa is connecting to devices");
        super.connectDeviceToNetwork(devices);
    }

    public void login(final String account, final String password) {
        System.out.println("Sign in...");
        if (password.equals("1234")) {
            System.out.printf("Welcome %s ", account);
        } else {
            System.out.println("Bad credentials");
        }
    }

    public final void logout() {
        System.out.println("Login out from account");
    }

}
