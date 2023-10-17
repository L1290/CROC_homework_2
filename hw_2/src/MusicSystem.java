/**
 * Программа для проверки работы класса {@code SoundReproducingDevice}
 */
public class MusicSystem {
    public static void main(String[] args) {

        //Создаем песни
        Song song1 = new Song("К Элизе", "Бетховен");
        Song song2 = new Song("No.1 Минорный вальс", "Эстер Абрами");
        Song song3 = new Song("Канон ре мажор", "Кевин МакЛауд");
        Song song4 = new Song("Мариаж д'Армур", "Шопен");
        Song song5 = new Song("Лунная соната", "Бетховен");

        //Создаем носители и добавляем в них песни
        MusicMedium record = new MusicMedium(new Song[]{song1,song2,song3},"Record");
        MusicMedium cd = new MusicMedium(new Song[]{song4,song5},"CD");
        MusicMedium dvd = new MusicMedium(new Song[]{song1,song2,song3,song5},"DVD");

        //Создаем звуковоспроизводящие устройства
        SoundReproducingDevice recordPlayer = new SoundReproducingDevice("Record","Виниловый проигрыватель");
        SoundReproducingDevice cdPlayer = new SoundReproducingDevice("CD","Проигрыватель CD");
        SoundReproducingDevice pmp = new SoundReproducingDevice("DVD","Плеер");

        //Проигрываем музыку с разных устройств и носителей
        recordPlayer.play(song1,record);
        cdPlayer.play(song3,cd);
        pmp.play(song2,dvd);
        pmp.play(song5,cd);
    }
}
