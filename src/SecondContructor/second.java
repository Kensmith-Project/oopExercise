package SecondContructor;
import Movie.Movie;

import java.util.ArrayList;
import java.util.List;


public class second {

    public static void main(String[] args) {
        Movie film = new Movie("Casino Royale","Eon Productions","PG 13");
        Movie film2 = new Movie("Tom and Jerry","Disney productions");
        Movie film3 = new Movie("PeakyBlinders","Washington Production");




        System.out.println(film.getPG(new ArrayList<Movie>(List.of(film,film2,film3))));


    }
}
