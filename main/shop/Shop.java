package main.shop;

import main.cache.DataCacheService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.strategies.BuyerRole;
import main.strategies.RoleStrategy;
import main.strategies.SellerRole;

public class Shop {

    //При выборе роли выполняется соответствующий метод через реализацию паттерна Стратегия
    public void init() throws IOException {
        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        DataCacheService dataCacheService = new DataCacheService();
        SupplyToShop supplyToShop = new SupplyToShop(dataCacheService);
        supplyToShop.supply();

        System.out.println("Добро пожаловать в магазин! Выберите кто вы: \n"
                            +"1 -- Продавец \n" +
                             "2 -- Покупатель");
        String roleChose = READER.readLine();
        if(roleChose.equals("1")){
            RoleStrategy role = new SellerRole(dataCacheService, this);
            role.execute();
        }else{
            RoleStrategy role = new BuyerRole(dataCacheService, this);
            role.execute();
        }

    }
}
