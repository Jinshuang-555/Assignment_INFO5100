package Final.Q4;

import java.util.Date;
import java.util.List;

public class Movie {
    /**
     *  Movie class has Title of movie, Release date, List of actors, Director
     */
   String title;
   Date date;
   List<String> actors;
   String director;

    public Movie(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
