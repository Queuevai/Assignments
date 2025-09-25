package Assignment5.InterfaceDefaultMethod;


class WAVPlayer implements MusicPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("WAV playback gracefully stopped.");
    }
}
