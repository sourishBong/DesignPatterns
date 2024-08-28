package iterator.pattern.after;

import java.util.ArrayList;
import java.util.List;

// Iterator interface
interface SongIterator {
    boolean hasNext();
    String next();
}

// Iterable interface
interface SongIterable {
    SongIterator createIterator();
}

// Concrete Iterator implementation
class MusicLibraryIterator implements SongIterator {
    private List songs;
    private int index;

    public MusicLibraryIterator(List songs) {
        this.songs = songs;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return (String) songs.get(index++);
        }
        return null;
    }
}

// Aggregate class
class MusicLibrary implements SongIterable {
    private List songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    // Returns the iterator for the collection
    public SongIterator createIterator() {
        return new MusicLibraryIterator(songs);
    }
}

public class MusicLibraryApp {

    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong("Song 1");
        musicLibrary.addSong("Song 2");
        musicLibrary.addSong("Song 3");

        // Client code now uses the iterator without exposing the collection details
        SongIterator iterator = musicLibrary.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
