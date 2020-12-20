package assignment1A;

public class ShortVideoMain {
	
	public static void main (String [] args) {
		
		Genre g = new Genre();
		Documentary d = new Documentary();
 		
		g.setTitle("Spongebob");
		g.setGenre("Cartoon");
		g.setDate("20-December-2020");
		
		d.setTitle("National Geography : World Climate");
		d.setGenre("Documentary");
		d.setDate("19-December-2020");
		
		System.out.println("Short Video");
		System.out.println("Name : " + g.getTitle());
		System.out.println("Genre : " + g.getGenre());
		System.out.println("Date Release : " + g.getDate());
		
		System.out.println("\nName : " + d.getTitle());
		System.out.println("Genre : " + d.getGenre());
		System.out.println("Date Release : " + d.getDate());
	}
}
