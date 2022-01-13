//package small_Projects.oop_Projects.musicPlayer_Intermidiate;
//
//import java.util.*;
//
////https://www.youtube.com/watch?v=49eeLxc6xE4&t=1s
//public class Main {
//
//    private static ArrayList<Album> albums = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//
//
//        Album album = new Album("Album1","AC/DC");
//        album.addSong("TNT", 4.5);
//        album.addSong("Highway to Hell", 3.5);
//        album.addSong("ThunderStruck", 5.0);
//        album.addSong("Nowhay", 4.4);
//        albums.add(album);
//
//        album = new Album("Album2", "Eminem");
//        album.addSong("Rap god", 4.7);
//        album.addSong("Just satay low", 5.7);
//        album.addSong("Where you are", 2.9);
//        albums.add(album);
//
//        LinkedList<Song> playList1 = new LinkedList<>();
//        albums.get(0).addToPlayList("TNT", playList1);
//        albums.get(0).addToPlayList("Highway to Hell", playList1);
//        albums.get(1).addToPlayList("Rap god", playList1);
//        albums.get(1).addToPlayList("Just satay low", playList1);
//
//
//        play(playList1);
//    }
//
//    private static void play(LinkedList<Song> playList){
//        Scanner sc = new Scanner(System.in);
//        boolean quit = false;
//        boolean forward = true;
//        ListIterator<Song> listIterator = playList.listIterator();
//
//        if (playList.size()==0){
//            System.out.println("This play list have no song.");
//        }else {
//            System.out.println("Now playing "+ listIterator.next().toString()); // converting toString so to print
//            printMenu();
//        }
//
//        while (!quit){
//            int action = sc.nextInt();
//            sc.nextLine();
//
//            switch (action){
//
//            }
//        }
//
//    }
//
//    private static void printMenu(){
//        System.out.println("Available options\n press");
//        System.out.println("0 - to quit\n"+
//                "1 - play next song\n"+
//                "2 - play previous song\n"+
//                "3 - replay the current song\n"+
//                "4 - list all the songs\n"+
//                "5 - print all available options\n"+
//                "6 - delete current song");
//    }
//
//    private static void printList(LinkedList<Song> playList){
//        Iterator<Song> iterator = playList.listIterator();
//        System.out.println("-----------------------------");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("-----------------------------");
//    }
//
//
//
//}
