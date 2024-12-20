/**
 * Main
 */
class Movie
{   
    public static int movieCount = 0;
    
    private String title;
    private int year;
    private double score;

    public Movie(String title, int year, double score)
    {
        this.title = title;
        this.year = year;
        this.setScore(score);

        Movie.movieCount += 1;
    }

    @Override
    public String toString()
    {
        return String.format("%s, %d, %.1f", this.title, this.year, this.score);
    }

    public String getTitle()//getter
    {
        return this.title;
    }

    public void setScore(double newScore)//setter
    {
        this.score=newScore;

        if(newScore < 0.0)
        {
            this.score = 0.0;
        }

        if (score > 10.0) 
        {
            this.score = 10.0;
        }
    }
}

public class Main {

    public static void main(String[] args) 
    {   
        System.out.println(Movie.movieCount);

        Movie movie1 = new Movie("The Terminator", 1984, 8.1);
        //System.out.println(movie1);
        System.out.println(Movie.movieCount);

        Movie movie2 = new Movie("Star Wars V", 1980, 8.7);
        //System.out.println(movie2);
        System.out.println(Movie.movieCount);

        Movie movie3 = new  Movie("Bloodshot", 2020, 5.7);
        //System.out.println(movie3);
        System.out.println(Movie.movieCount);
    }
}