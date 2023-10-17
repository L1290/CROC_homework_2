/**
 * Класс предствляющий звуковоспроизводящее устройство
 */
public class SoundReproducingDevice {
    /**
     * Тип носителя, принимаемый устройством
     */
    String requiredMediumType;
    /**
     * Тип устройства
     */
    String type;

    public SoundReproducingDevice(String requiredMediumType, String type) {
        this.requiredMediumType = requiredMediumType;
        this.type = type;
    }

    /**
     * Метод для проигрывания композиции.
     * Выводит информацию о том, что за устройство воспроизводит песню, ее исполнителя и название.
     * В случае, если устройство не может воспроизвести музыку с выбранного носителя, или выбранная песня отсутствует на носителе, выводит соответсвующее сообщение.
     * @param song Песня для проигрывания
     * @param medium Носитель с которого должна воспроизводиться песня
     */
    public void play(Song song, MusicMedium medium){
        if(medium.hasSong(song)==false){
            System.out.println("Песня "+song.name+" отсутствует на носителе "+medium.getType());
        } else {
            if (medium.getType() != this.requiredMediumType) {
                System.out.println("Невозможно воспроизведение с носителя " + medium.getType() + " на устройстве " + this.type);
            } else {
                System.out.println(this.type + ": Сейчас играет: " + song.getName() + " От: " + song.getAuthor());
            }
        }
    }
}
