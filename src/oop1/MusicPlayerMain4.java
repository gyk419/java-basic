package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.playerStatus();
        mp.on();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeDown();
        mp.playerStatus();
        mp.off();
    }
}
