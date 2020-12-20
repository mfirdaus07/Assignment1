package assignment1A;

public class ShortVideoMain {
	
	public static void main (String [] args) {
		
		Genre g = new Genre();
 		
		g.setTitle("Spongebob");
		g.setGenre("Cartoon");
		g.setDate("20-December-2020");
		
		System.out.println("Short Video");
		System.out.println("Name : " + g.getTitle());
		System.out.println("Genre : " + g.getGenre());
		System.out.println("Date Release : " + g.getDate());
	}
}
