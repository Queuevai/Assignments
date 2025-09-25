package Assignment5.InterfaceDefaultMethod;


public class MusicPlayerTest {
    public static void main(String[] args) {

        System.out.println("--- MP3 Player ---");
        MP3Player mp3Player = new MP3Player();
        mp3Player.play("song.mp3");
        mp3Player.stop();
        System.out.println();

        System.out.println("--- WAV Player ---");
        WAVPlayer wavPlayer = new WAVPlayer();
        wavPlayer.play("audio.wav");
        wavPlayer.stop();
        System.out.println();

        MusicPlayer genericPlayer = new MP3Player();
        System.out.println("--- Generic Player (MP3) ---");
        genericPlayer.play("another_song.mp3");
        genericPlayer.stop();
    }
}
