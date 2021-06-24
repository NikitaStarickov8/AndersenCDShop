package main.cache;

import main.shop.Disk;
import main.shop.MusicTrack;
import java.util.*;

//Реализация кэша
public class DataCacheService implements DataCache{
    List<Disk> allDisksOnStorage = new ArrayList<>();


    @Override
    public void addNewDisk(Disk disk) {
        allDisksOnStorage.add(disk);
    }

    @Override
    public String showAllDisks() {
        return allDisksOnStorage.toString();
    }

    @Override
    public void deleteDisk(Disk disk) {
        allDisksOnStorage.remove(disk);
    }

    @Override
    public void addNewTrackToDisk(Disk d,MusicTrack track) {
        List<MusicTrack> tracks = d.getTracksOnDisk();
        tracks.add(track);
    }

    @Override
    public Disk getOneDisk(int i) {
        return allDisksOnStorage.get(i);
    }


}
