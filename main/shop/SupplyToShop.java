package main.shop;


import main.cache.DataCacheService;

import java.util.ArrayList;


// Вспомогательный класс для первичного завоза в магазин
public class SupplyToShop {
    DataCacheService dataCacheService;

    public SupplyToShop(DataCacheService dataCacheService) {
        this.dataCacheService = dataCacheService;
    }

    public void supply(){
        ArrayList<MusicTrack> tracksVivaldi = new ArrayList<>();
        tracksVivaldi.add(new MusicTrack("Зима","Классика","Вивальди", 1725));
        tracksVivaldi.add(new MusicTrack("Весна","Классика","Вивальди", 1705));
        dataCacheService.addNewDisk(new Disk(9,tracksVivaldi,"Времена года"));

        ArrayList<MusicTrack> tracks50cent = new ArrayList<>();
        tracks50cent.add(new MusicTrack("Candy shop","Рэп","50 cent", 2003));
        tracks50cent.add(new MusicTrack("In da club","Рэп","50 cent", 2003));
        dataCacheService.addNewDisk(new Disk(9,tracks50cent,"Времена года"));
    }
}
