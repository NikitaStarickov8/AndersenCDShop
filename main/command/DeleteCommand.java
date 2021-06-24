package main.command;

import main.cache.DataCacheService;
import main.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteCommand extends Command{
    DataCacheService dataCacheService;

    public DeleteCommand(DataCacheService dataCacheService,Shop shop) {
        super(shop);
        this.dataCacheService = dataCacheService;
    }

    @Override
    public void startCommand() throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dataCacheService.showAllDisks());
        System.out.println("Выберите диск, который хотите удалить");
        String userAnswer = READER.readLine();
        dataCacheService.getOneDisk(Integer.parseInt(userAnswer));
        dataCacheService.deleteDisk(dataCacheService.getOneDisk(Integer.parseInt(userAnswer)));
        System.out.println("Диск успешно удален!");
    }
}
