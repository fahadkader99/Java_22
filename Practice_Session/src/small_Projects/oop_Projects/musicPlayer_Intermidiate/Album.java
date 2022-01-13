//package small_Projects.oop_Projects.musicPlayer_Intermidiate;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
////https://www.youtube.com/watch?v=49eeLxc6xE4&t=1s
//public class Album {
//    private String name;
//    private String artist;
//    private ArrayList<Song> songs;
//
//    public Album(String name, String artist) {
//        this.name = name;
//        this.artist = artist;
//        this.songs = new ArrayList<Song>();
//    }
//
//    public Album() {
//        // good practice having an empty constructor
//    }
//
//    public Song findSong(String title) {
//        for (Song checkedSong : songs) {
//            if (checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            } else return null;
//        }
//    }
//
//    public boolean addSong(String title, double duration) {
//        if (findSong(title) == null) {
//            songs.add(new Song(title, duration));
//            System.out.println(title + " successfully added to the list.");
//            return true;
//        } else {
//            System.out.println("Song with the name " + title + " already exists in the list");
//            return false;
//        }
//    }
//
//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {   // linkedList will have previous and next song
//        int index = trackNumber - 1;
//        if (index > 0 && index <= this.songs.size()) {
//            playList.add(this.songs.get(index));
//            return true;
//        }
//        System.out.println("This album do not have track with the track number: " + trackNumber);
//        return false;
//    }
//
//    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//        for (Song checkedSong : this.songs) {
//            if (checkedSong.getTitle().equals(title)) {
//                playList.add(checkedSong);
//                return true;
//            }
//        }
//        System.out.println(title + " there is no such song in the album..!");
//    }
//
//}
