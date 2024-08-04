package multimediaExample.televisions;

import multimediaExample.MultimediaDevice;

public class Television extends MultimediaDevice {

    private int screenSize;

    public Television(int screenSize) {
        super("Television", "1");
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    @Override
    public void connect() {
        System.out.println("Connecting TV Device");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting TV Device");
    }

    @Override
    public void play() {
        System.out.println("Playing TV device");
    }

    @Override
    public void pause() {
        System.out.println("Pausing TV device");
    }

    @Override
    public void stop() {
        System.out.println("Stopping TV device");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turning up volume for TV device");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turning down volume for TV device");
    }


}
