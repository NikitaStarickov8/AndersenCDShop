package main.command;

import main.cache.DataCacheService;
import main.shop.Disk;
import main.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyCommand extends Command{
    DataCacheService dataCacheService;

    public BuyCommand(Shop shop, DataCacheService dataCacheService) {
        super(shop);
        this.dataCacheService = dataCacheService;
    }

    @Override
    public void startCommand() throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dataCacheService.showAllDisks());
        System.out.println("Выберите диск, который хотите купить");
        String userAnswer = READER.readLine();
        Disk disk = dataCacheService.getOneDisk(Integer.parseInt(userAnswer));
        int i = disk.getAmount();
        int j = i-1;
        disk.setAmount(j);
        System.out.println("Диск успешно куплен! Приятного прослушивания!");
    }
}
