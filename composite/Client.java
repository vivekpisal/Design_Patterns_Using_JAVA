package composite;

public class Client {
	public static void main(String []args) {
		Directory moviesDirectory = new Directory("Movies");
		Directory hindiMovies = new Directory("Hindi Movies");
		hindiMovies.addFile(new File("Border"));
		hindiMovies.addFile(new File("Taqdeer"));
		Directory englishMovies = new Directory("English Movies");
		englishMovies.addFile(new File("Spider-Man: Across the Spider-Verse"));
		englishMovies.addFile(new File("Extraction 2"));
		moviesDirectory.addFile(hindiMovies);
		moviesDirectory.addFile(englishMovies);
		moviesDirectory.ls();
	}
}
