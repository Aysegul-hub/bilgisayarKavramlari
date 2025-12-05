import java.util.ArrayList;

public class Playlist {

    private String name ;
    private ArrayList<String> song;

    public Playlist ( String name){
        this.name = name;
        this.song = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addSong(String songName){
        song.add(songName);
        System.out.println(songName + " added to playlist");
    }
    public void removeSong(String songName){
        if ( song.remove(songName)){
            System.out.println(songName + " removed from the playlist...");
        }else {
            System.out.println(songName + " not found in the playlist...");
        }

    }
    public void printSongs(){
        if ( song.isEmpty()){
            System.out.println("Playlist is empty.");
            return;

        }
        System.out.println("Song in " + name + ": ");
        for ( String s : song) {
            System.out.println("- " + s);

        }
    }
    public int getSongCount(){
        return song.size();
    }



}
