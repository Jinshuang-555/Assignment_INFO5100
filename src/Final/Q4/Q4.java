package Final.Q4;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Q4 {
    public static void main(String[] args) {
        Genre g1 = new Genre();
        g1.addMovie(new Movie("A", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime()));
        g1.addMovie(new Movie("B", new GregorianCalendar(2012, Calendar.FEBRUARY, 11).getTime()));
        g1.addMovie(new Movie("C", new GregorianCalendar(2002, Calendar.FEBRUARY, 11).getTime()));
        g1.addMovie(new Movie("D", new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime()));

        Genre g2 = new Genre();
        g2.addMovie(new Movie("a", new GregorianCalendar(1994, Calendar.FEBRUARY, 11).getTime()));
        g2.addMovie(new Movie("b", new GregorianCalendar(1992, Calendar.FEBRUARY, 11).getTime()));
        g2.addMovie(new Movie("c", new GregorianCalendar(2015, Calendar.FEBRUARY, 11).getTime()));
        g2.addMovie(new Movie("d", new GregorianCalendar(2020, Calendar.FEBRUARY, 11).getTime()));

        Netflix netflix = new Netflix();
        netflix.addGenre(g1);
        netflix.addGenre(g2);

        List<Movie> movies = new ArrayList<>();
        movies.addAll(g1.movies);
        movies.addAll(g2.movies);

        /**
         * For all movies released before 2000, add the string "(Classic)" to the title of the movie using
         * flatMap.
         */

        netflix.genres.stream().flatMap(genre -> genre.movies.stream())
                .forEach(movie -> {
                    String title = movie.getTitle();
                    if (movie.getDate().compareTo(new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime())<0) {
                        title = "(Classic)" + title;
                        System.out.println(title);
                    }
                    movie.setTitle(title);
                });
        /**
         * Get the latest 3 movies released using .limit() method of stream.
         */
        System.out.println("===========Latest 3 movies============");
        Collections.sort(movies, (a,b) -> {
            if ((a.getDate().getTime() < b.getDate().getTime())) { return 1; }
            if ((a.getDate().getTime() > b.getDate().getTime())) { return -1; }
            return 0;
        });
        movies
                .stream()
                .limit(3)
                .forEach(movie -> System.out.println(movie.getTitle()));

        /**
         * Create a predicate for release date before 2000 and a predicate for release date before 1990
         * and then Chain the predicates for finding movies between 1990 and 2000.
         */
        Predicate<Movie> before2000 = i -> (i.getDate().compareTo(new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime())<0);
        Predicate<Movie> after1990 = i -> (i.getDate().compareTo(new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime())>0);
        movies.stream()
                .filter(before2000)
                .filter(after1990)
                .forEach(movie -> System.out.println(movie.getTitle()));
        /**
         * Write a method which that will add release year in the title of the movie and return the title and
         * then use this method for all the movies
         */
        for (Movie movie : movies) {
            turnTile(movie);
        }
        // for testing the function
        Movie movie = new Movie("A", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime());
        System.out.println(turnTile(movie));

        /**
         *  Sorting on one of the feature(Ex: Released year or title) which will use comparator.
         */
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }
    /**
     * Write a method which that will add release year in the title of the movie and return the title and
     * then use this method for all the movies
     */
    public static String turnTile (Movie movie) {
        String title = movie.title;
        Date date = movie.getDate();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yy");
        String year = yearFormat.format(Date.parse(String.valueOf(date)));
        title = year + title;
        movie.setTitle(title);
        return title;
    }
}
