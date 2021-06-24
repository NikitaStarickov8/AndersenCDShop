package main.command;

import main.shop.Disk;
import main.shop.MusicTrack;
import main.cache.DataCacheService;
import main.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AddCommand extends Command {
    DataCacheService dataCacheService;

    public AddCommand(DataCacheService dataCacheService, Shop shop) {
        super(shop);
        this.dataCacheService = dataCacheService;
    }

    @Override
    public void startCommand() throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        Disk disk = new Disk();
        MusicTrack track = new MusicTrack();
        List<MusicTrack> trackArrayList = disk.getTracksOnDisk();
        System.out.println("Введите название диска:");
        String titleDisk = READER.readLine();
        disk.setTitle(titleDisk);
        System.out.println("Введите количество дисков на складе:");
        String amountDist = READER.readLine();
        disk.setAmount(Integer.parseInt(amountDist));
        while (true) {
            System.out.println("Введите название трека, который будет записан на диск:");
            String trackTitle = READER.readLine();
            track.setTitle(trackTitle);
            System.out.println("Введите группу, исполняющую трэк:");
            String artistName = READER.readLine();
            track.setArtistName(artistName);
            System.out.println("Введите жанр трэка");
            String genre = READER.readLine();
            track.setGenre(genre);
            System.out.println("Введите год выпуска:");
            String year = READER.readLine();
            track.setYearOfProduct(Integer.parseInt(year));
            trackArrayList.add(track);
            System.out.println("Трэк успешно добавлен! Хотите добавить ещё один трэк? Введите Y/N");
            String answer = READER.readLine();
            if(answer.equalsIgnoreCase("N"))
                break;
        }
        disk.setTracksOnDisk(trackArrayList);
        dataCacheService.addNewDisk(disk);
        System.out.println("Диск успешно добавлен!");
    }
}
