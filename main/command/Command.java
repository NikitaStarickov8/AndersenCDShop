package main.command;

import main.cache.DataCacheService;
import main.shop.Shop;

import java.io.IOException;

//Абстрактная базовая команда
public abstract class Command {
    Shop shop;

    public Command(Shop shop) {
        this.shop = shop;
    }

    public abstract void startCommand() throws IOException;
}
