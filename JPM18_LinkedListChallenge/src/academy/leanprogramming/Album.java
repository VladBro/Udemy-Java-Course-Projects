package academy.leanprogramming;

import java.util.ArrayList;

public class Album {
    ArrayList<Song> albumSongs;

    public Album() {
        this.albumSongs = new ArrayList<Song>();
    }

    public void addSong(String title, String duration){
        albumSongs.add(new Song(title, duration));
    }//Tim Buchalka made this method boolean instead of void, so it'd return false if there's already song with such name

    public Song getSong(int id){
        return albumSongs.get(id);
    }

    //Tim Buchalka suggests to create in this class a method to add song from the album to chosen playlist
    //either using an index or a name of a song
}
