package Assignment3Part2.TDD;

public class Book implements Author, Title, Genre, Amount{

	public String getAuthor(String author) {
		return author;
	}

	public int getAmount(int amount) {
		return amount;
	}

	public String getGenre(String genre) {
		return genre;
	}

	public String getTitle(String title) {
		return title;
	}
}
