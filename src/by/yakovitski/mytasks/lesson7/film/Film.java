package by.yakovitski.mytasks.lesson7.film;

public class Film {
    private  int duration;
    private String genre;
    private String director;

    public Film(int duration, String genre, String director) {
        this.duration = duration;
        this.genre = genre;
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public class Info {
        public void printIfo(){
            System.out.println("Длительность: " + getDuration() + " сек., жанр: " + getGenre() + ", режиссер: " + getDirector());
        }
    }
}