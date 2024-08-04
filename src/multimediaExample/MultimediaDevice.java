package multimediaExample;

public abstract class MultimediaDevice implements IMediaDevice, IConnectable{
    private String deviceName;
    private String deviceId;

    public MultimediaDevice(String deviceName, String deviceId) {
        this.deviceName = deviceName;
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

}
