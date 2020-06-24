import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * 
 * Create a program that implements a playlist for songs
 * Create a song class having title and duration for a song
 * The program will have an album class containing a list of songs
 * The albums will be stored in an arraylist
 * Songs from different albums can be added to the playlist and will appear in the list in the order they are added
 * Once the songs have been added to the playlist, create a menu of options to : 
 * -Quit, Skip, forward to the next song, skip backwards to a previous song,. Replay the current song.
 * List the songs in the playlist
 * A song must exist in an album before it can be added to the playlist (so you can only play songs that you own)
 * Hint : To rely a song, consider what happened when we went back and forth from a city before we started tracking the direction we were going
 * As an optional extra, provide an option to remove the current song from the playlist
 * (hint: listiterator.remove() )
 * 
 */
public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args) {
		Album album = new Album("Strombringer","Deep purple");
		album.addSong("Strombringer", 4.6);
		album.addSong("Song2", 4.6);
		album.addSong("Song3", 4.22);
		album.addSong("Song4", 3.21);
		album.addSong("Song5", 4.27);
		album.addSong("Song6", 4.2);
		album.addSong("Song7", 4.0);
		album.addSong("Song8", 4.62);
		albums.add(album);
		
		album = new Album("For those about to rock","AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("Song02", 3.6);
		album.addSong("Song03", 3.46);
		album.addSong("Song04", 3.56);
		album.addSong("Song05", 4.16);
		album.addSong("Song06", 4.0);
		album.addSong("Song07", 4.6);
		album.addSong("Song08", 5.6);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlaylist("Song4", playList);
		albums.get(0).addToPlaylist("Song3", playList);
		albums.get(0).addToPlaylist("Song2", playList);
		albums.get(0).addToPlaylist(6, playList);
		//albums.get(0).addToPlaylist(9, playList);
		albums.get(1).addToPlaylist(3, playList);
		albums.get(1).addToPlaylist(2, playList);
		albums.get(1).addToPlaylist(24, playList); //there is no track 24
		
		play(playList);

	}

	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No song in playList");
			return;
		}	else {
			System.out.println("Now playing "+ listIterator.next().toString());  //toString is a method in the Song class
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("PlayList complete");
				quit = true;
				break;
				
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing : "+listIterator.next().toString());
				} else { 
					System.out.println("We have reached the end of the playList");
					forward = false;
				}
				break;
			case 2:
				if(forward ) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				break;
				
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now REplaying : "+listIterator.previous().toString());
						forward = false;
					} else { 
						System.out.println("We are at the start of the playList");
						}
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now REplaying : "+listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We have reached the end of the list");
					}
				}	
				break;
				
			case 4:
				printList(playList);
				break;
				
			case 5:
				printMenu();
				break;
				
			case 6: //if we delete a song from playlist, the next song automatically starts playing
				if(playList.size() > 0) { //if there are still some entries available in the playList 
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing "+listIterator.next());
					} else if(listIterator.hasPrevious()) {
						System.out.println("Now playing "+listIterator.previous());
					}
				} break;
			}
		}
		
	}
	
	
	
	private static void printMenu() {
		System.out.println("Available actions: \npress");
		System.out.println(" 0 - to quit\n" +
						   " 1 - to play next song\n" +
						   " 2 - to play previous song\n" +
						   " 3 - to replay the current song\n" +
						   " 4 - list songs in the playList\n" +
						   " 5 - print available actions\n" +
						   " 6 - remove current song from playList.");
				
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("====================================="); //we d'ont need to go forward AND backward se no need to use listIterator
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=====================================");

	}

	
}