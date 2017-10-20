package Assignment3Part2.TDD;

import org.junit.Test;

import junit.framework.TestCase;

public class TestBook extends TestCase {
	public Book book;
	
	String author, title, genre;
	int copyAmt;
	
	protected void setUp() throws Exception {
		book = new Book();
		author = "Disney";
		title = "Shrek";
		genre = "Comedy";
		copyAmt = 4;
	}
	
	@Test
	public void testGetAuthor() {
		String authors = "Disney";
		assertEquals(authors, book.getAuthor("Disney"));
	}
	
	@Test
	public void testGetTitle() {
		String titles = "Shrek";
		assertEquals(titles, book.getTitle("Shrek"));
	}
	
	@Test
	public void testGetGenre() {
		String genre = "Comedy";
		assertEquals(genre, book.getGenre("Comedy"));
	}
	
	@Test
	public void testGetAmount() {
		int copyAmt = 4;
		assertEquals(copyAmt, book.getAmount(4));
	}
		
	
	protected void tearDown() throws Exception {
		book = null;
		author = "";
		title = "";
		genre = "";
		copyAmt = 0;
	}
}
