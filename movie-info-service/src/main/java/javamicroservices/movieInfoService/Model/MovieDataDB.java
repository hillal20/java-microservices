package javamicroservices.movieInfoService.Model;

public class MovieDataDB {

    private int id;
    private String title;
    private String release_date;
    private String overview;
    private boolean adult;


    public MovieDataDB(int id, String title, String release_date,String overview, boolean adult) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.adult = adult;
        this.overview = overview;
    }

    public MovieDataDB() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public void setOverview(String  overview) {
        this.overview = overview;
    }
    public String  getOverview() {
       return  overview;
    }
    @Override
    public String toString() {
        return "MovieDataDB{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", release_date='" + release_date + '\'' +
                ", adult=" + adult +
                '}';
    }
}
