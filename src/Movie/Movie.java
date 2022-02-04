package Movie;

import java.util.ArrayList;

public class Movie {


    private String title;
    private String studio;
    public String rating;

    public Movie(String title,String studio,String rating){
        this.title= title;
        this.studio= studio;
        this.rating= rating;
        System.out.println("Constructor 1 fired");
    }

    public Movie (String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
        System.out.println("Constructor 2 fired");
    }

    public ArrayList<String> getPG(ArrayList<Movie> arr) {

        ArrayList<String> newarr= new ArrayList<>();

        for(int i=0;i<arr.size();i++){
          if(arr.get(i).rating =="PG"){
              newarr.add(arr.get(i).title);
          }
        };
        return  newarr;
    };



//    public static Movie secondConstructor(String title, String studio, String rating){
//        return new Movie(title, studio,rating);

//    }











    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
