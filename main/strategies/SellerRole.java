package main.strategies;

import main.command.AddCommand;
import main.command.Command;
import main.command.DeleteCommand;
import main.command.ShowAllCommand;
import main.shop.MusicTrack;
import main.cache.DataCacheService;
import main.shop.Disk;
import main.shop.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Действия для продавца
public class SellerRole implements RoleStrategy{
    DataCacheService dataCacheService;
    BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    Shop shop;


    public SellerRole(DataCacheService dataCacheService, Shop shop) {
        this.dataCacheService = dataCacheService;
        this.shop = shop;
    }

    @Override
    public void execute() throws IOException {
        System.out.println("Вы выбрали роль продавец. Доступные функции для продавца: \n" +
                "1 -- Посмотреть все диски на складе \n" +
                "2 -- Добавить новый диск на склад \n" +
                "3 -- Удалить диск");
        String userAnswer = READER.readLine();
        if(userAnswer.equals("1")){
            showAllDiskOnStorage();
        }else if(userAnswer.equals("2")){
            addNewDiskToStorage();
        }else{
            deleteSomeDisk();
        }
    }

    public void showAllDiskOnStorage() throws IOException {
        Command command = new ShowAllCommand(shop, dataCacheService);
        command.startCommand();
        execute();
    }
    public void addNewDiskToStorage() throws IOException {
        Command command =new AddCommand(dataCacheService,shop);
        command.startCommand();
        execute();
    }
    public void deleteSomeDisk() throws IOException {
        Command command = new DeleteCommand(dataCacheService, shop);
        command.startCommand();
        execute();
    }
}
