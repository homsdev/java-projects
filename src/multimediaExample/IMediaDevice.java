package multimediaExample;


public interface IMediaDevice {
    void play();

    void pause();

    void stop();

    void volumeUp();

    void volumeDown();

    /**
     * Generates a random MAC address
     * @return Random MAC address
     */
    default String getMACAddress() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int randomValue = (int) (Math.random() * 256);
            String hexPair = String.format("%02X", randomValue);
            sb.append(hexPair);
            if (i < 5) {
                sb.append(":");
            }
        }
        return sb.toString();
    }
}
