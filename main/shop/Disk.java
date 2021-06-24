package main.shop;

import java.util.*;

//Реализация класса диска
public class Disk {
    int amount;
    List<MusicTrack> tracksOnDisk = new ArrayList<>();
    String title;

    public Disk() {
    }

    public Disk(int amount, List<MusicTrack> tracksOnDisk, String title) {
        this.amount = amount;
        this.tracksOnDisk = tracksOnDisk;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Диск номер: \n" +
                "Название: " + title + "\n" +
                "Количество на складе: " + amount + "\n" +
                "Трэки на диске: " + tracksOnDisk.toString();
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public List<MusicTrack> getTracksOnDisk() {
        return tracksOnDisk;
    }

    public void setTracksOnDisk(List<MusicTrack> tracksOnDisk) {
        this.tracksOnDisk = tracksOnDisk;
    }
}
