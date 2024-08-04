package multimediaExample.speakers;

import multimediaExample.MultimediaDevice;

public class Speaker extends MultimediaDevice {

    private int volumeLevel;
    protected int MAX_VOLUME;
    protected int MIN_VOLUME;

    {
        MAX_VOLUME = 20;
        MIN_VOLUME = 10;
    }

    public Speaker() {
        super("Speaker", "2");
        volumeLevel = 0;
    }


    @Override
    public void connect() {
        System.out.println("Speaker connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Speaker disconnected");
    }

    @Override
    public void play() {
        System.out.println("Speaker playing");
    }

    @Override
    public void pause() {
        System.out.println("Speaker paused");
    }

    @Override
    public void stop() {
        System.out.println("Speaker stopped");
    }

    @Override
    public void volumeUp() {
        if (volumeLevel == MAX_VOLUME) {
            System.out.println("MAX VOLUME");
        } else {
            volumeLevel++;
            System.out.printf("Volume increased for speaker:%d\n",volumeLevel);
        }
    }

    @Override
    public void volumeDown() {
        if (volumeLevel == MIN_VOLUME) {
            System.out.println("MIN VOLUME");
        } else {
            volumeLevel--;
            System.out.println("Volume increased for speaker");
        }
    }
}
