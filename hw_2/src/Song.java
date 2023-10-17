/**
 * Класс представляющий песню
 */
public class Song {
    String name;
    String author;

    /**
     * Конструктор
     * @param name Название песни
     * @param author Имя исполнителя
     */
    public Song(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
