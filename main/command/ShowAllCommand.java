package main.command;

import main.cache.DataCacheService;
import main.shop.Shop;

import java.io.IOException;


public class ShowAllCommand extends Command{
    DataCacheService dataCacheService;

    public ShowAllCommand(Shop shop, DataCacheService dataCacheService) {
        super(shop);
        this.dataCacheService = dataCacheService;
    }

    @Override
    public void startCommand() throws IOException {
        System.out.println(dataCacheService.showAllDisks());
    }
}
