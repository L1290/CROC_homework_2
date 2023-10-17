/**
 * Класс представляющий носитель музыкальных композиций
 */
public class MusicMedium {
    /**
     * Массив содержащий песни, хранящиеся на носителе
     */
    Song[] songs;
    /**
     * Тип носителя
     */
    String type;

    public MusicMedium(Song[] songs, String type) {
        this.songs = songs;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * Метод, проверяющий, содержится ли песня на носителе
     * @param song Песня, для которой будет осуществлена проверка
     * @return {@code True}, если песня содержится на носителе. {@code False} в противном случае
     */
    public boolean hasSong(Song song){
        for(int i=0;i<songs.length;i++){
            if((songs[i].name).equals(song.name)){
                return true;
            }
        }
        return false;
    }
}
