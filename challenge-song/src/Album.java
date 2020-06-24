import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;

//arraylist of songs
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.artist = artist;
		this.name = name;
		this.songs = new ArrayList<Song>();	//initialize in constructor
	}

	//add a new song to an album
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	//find a song in an album
	 private Song findSong(String title) {
		 for(Song checkedSong: this.songs) {
			 if(checkedSong.getTitle().equalsIgnoreCase(title)) {
				 return checkedSong;
			 }
		 } return null;
	 } 
	//add a song to playlist by track number 
	 public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
		 int index = trackNumber-1 ;
		 if ( (index>=0) && (index <= this.songs.size())) { //track n=1 => index=0
			 playList.add(this.songs.get(index));
			 return true;
		 } 
		 System.out.println("This alnum does not hava a track "+trackNumber);
		 return false;
	 }
		//add a song to playlist by track name
	 public boolean addToPlaylist(String title, LinkedList<Song> playList) {
			//if(findSong(title) != null) {
		 	Song checkedSong = findSong(title);
		 	if(checkedSong != null) {
				playList.add(checkedSong);
				return true;
			}
	 System.out.println("This alnum does not hava a song called "+ title);
	 return false;

	 }
}
