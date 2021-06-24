package main.cache;
import main.shop.Disk;
import main.shop.MusicTrack;

//Интерфейс кэша для замены базы данных
public interface DataCache {
    void addNewDisk(Disk disk);
    String showAllDisks();
    void deleteDisk(Disk disk);
    void addNewTrackToDisk(Disk d, MusicTrack track);
    Disk getOneDisk(int i);
}
