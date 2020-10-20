package by.yakovitski.mytasks.lesson7.film;

public class FilmTest {
    public static void main(String[] args) {
        Film film = new Film(432_000, "horror", "Ridley Scott");
        Film.Info info = film.new Info();
        info.printIfo();
    }
}
