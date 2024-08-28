package iterator.pattern.before;

import java.util.ArrayList;
import java.util.List;

class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public List getSongs() {
        return songs;
    }

    // Client code directly depends on ArrayList
    public void printAllSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }
}

public class MusicLibraryApp {

    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong("Song 1");
        musicLibrary.addSong("Song 2");
        musicLibrary.addSong("Song 3");

        musicLibrary.printAllSongs();
    }
}
