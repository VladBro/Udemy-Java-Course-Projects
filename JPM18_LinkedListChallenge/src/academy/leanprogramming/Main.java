package academy.leanprogramming;

import java.util.*;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    static ArrayList<Album> myAlbums = new ArrayList<Album>();
    static LinkedList<Song> playlist = new LinkedList<Song>();

    public static void main(String[] args) {
        //creating some albums, adding songs to them
        Album greenAlbum = new Album();
        greenAlbum.addSong("First green song", "1:55");
        greenAlbum.addSong("Second green song", "3:55");
        greenAlbum.addSong("Third green song", "2:35");
        greenAlbum.addSong("Last green song", "3:41");

        Album redAlbum = new Album();
        redAlbum.addSong("First red song", "1:55");
        redAlbum.addSong("Second red song", "3:55");
        redAlbum.addSong("Last red song", "3:41");

        myAlbums.add(greenAlbum);
        myAlbums.add(redAlbum);

        //adding songs from albums to the playlist
        playlist.add(myAlbums.get(0).getSong(1));
        playlist.add(myAlbums.get(1).getSong(0));
        playlist.add(myAlbums.get(1).getSong(2));
        playlist.add(myAlbums.get(0).getSong(3));

        boolean playerOn = true;
        int option;
        ListIterator<Song> playerIterator = playlist.listIterator();

        //player menu
        printMenu();
        while(playerOn){
            option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    printMenu();
                    break;
                case 2:
                    printListOfSongs();
                    break;
                case 3:
                    nextSong(playerIterator);
                    break;
                case 4:
                    prevSong(playerIterator);
                    break;
                case 5:
                    replaySong(playerIterator);
                    break;
                case 6:
                    removeCurrentSong(playerIterator);
                    break;
                case 0:
                    playerOn = false;
                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }

    public static void printMenu(){
        System.out.println("Hello! Input one of the numbers to choose option:" +
                "\n 1 - print the menu again." +
                "\n 2 - print the list of songs" +
                "\n 3 - play next song" +
                "\n 4 - play previous song" +
                "\n 5 - replay current song" +
                "\n 6 - remove current song" +
                "\n 0 - turn off the player");
    }

    public static boolean printListOfSongs(){
        Iterator<Song> songIterator = playlist.iterator();

        if(songIterator.hasNext()) {
            while (songIterator.hasNext()) {
                System.out.println(songIterator.next().getTitle());
            }
            return true;
        }else{
            return false;
        }
    }

    public static boolean nextSong(ListIterator<Song> playerIterator){
        if(playerIterator.hasNext()){
            System.out.println("Now playing: " + playerIterator.next().getTitle());
            return true;
        }else{
            System.out.println("There's no next song");
            return false;
        }
    }

    public static boolean prevSong(ListIterator<Song> playerIterator){
        playerIterator.previous();
        if(playerIterator.hasPrevious()){
            System.out.println("Now playing: " + playerIterator.previous().getTitle());
            playerIterator.next();
            return true;
        }else{
            System.out.println("Current song is the first song");
            playerIterator.next();
            return false;
        }
    }

    public static void replaySong(ListIterator<Song> playerIterator){
        //just prints the current song title, but one should be aware how "current" works in LinkedList
        System.out.println("Now playing again: " + playerIterator.previous().getTitle());
        playerIterator.next();
    }

    public static void removeCurrentSong(ListIterator<Song> playerIterator){
        //same warning as previous + use listIterator.remove
        if(playerIterator.hasPrevious()){
            playlist.remove(playerIterator);
        }else{
            System.out.println("First start playing the first song");
        }
    }
}



