
public class Movie_Class_Q1 {

    // Attributes
    private String title;
    private String director;
    private int releaseYear;
    private double rating;

    public Movie_Class_Q1(String title, String director, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;

    }

    public void Display() {
        System.out.println("Title : " + title);
        System.out.println("Director: " + director);
        System.out.println("ReleaseYear : " + releaseYear);
        System.out.println("Rating : " + rating);
    }

    public static void main(String[] args) {
        Movie_Class_Q1 movie = new Movie_Class_Q1("Gadar", "RakeshRoshan", 1997, 9.5);
        movie.Display();
    }

}
