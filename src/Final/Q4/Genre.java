package Final.Q4;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    List<Movie> movies = new ArrayList<>();

    public void addMovie (Movie movie) {
        this.movies.add(movie);
    }
}