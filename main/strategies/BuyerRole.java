package main.strategies;

import main.command.BuyCommand;
import main.command.Command;
import main.command.ShowAllCommand;
import main.shop.Disk;
import main.cache.DataCacheService;
import main.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Действия для покупателя
public class BuyerRole implements RoleStrategy{
    DataCacheService dataCacheService;
    BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    Shop shop;

    public BuyerRole(DataCacheService dataCacheService, Shop shop) {
        this.dataCacheService = dataCacheService;
        this.shop = shop;
    }

    @Override
    public void execute() throws IOException {
        System.out.println("Вы выбрали роль покупатель. Доступные функции для покупателя: \n" +
                "1 -- Посмотреть все диски на складе \n" +
                "2 -- Купить диск");
        String userAnswer = READER.readLine();
        if(userAnswer.equals("1"))
            showAllDiskOnStorage();
        else if(userAnswer.equals("2"))
            buySomeDisk();
    }
    public void showAllDiskOnStorage() throws IOException {
        Command command = new ShowAllCommand(shop, dataCacheService);
        command.startCommand();
        execute();
    }
    public void buySomeDisk() throws  IOException {
        Command command = new BuyCommand(shop, dataCacheService);
        command.startCommand();
        execute();
    }
}
