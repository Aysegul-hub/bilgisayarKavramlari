public class Main4 {
    public static void main(String[] args){

        Playlist pl = new Playlist("My Favorite Songs");

        pl.addSong("New Rules");
        pl.addSong("Blinding Lights");
        pl.addSong("Tutamıyorum Zamanı");

        pl.printSongs();
        pl.getSongCount();
        pl.removeSong("New Rules");

        System.out.println("The list are updating... " );

        System.out.println("Total songs of my playlist : " + pl.getSongCount());
        pl.printSongs();
        System.out.println("Songs in the playlist after update: " );
    }
}
