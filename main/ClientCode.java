package main;

import main.shop.Shop;

import java.io.IOException;

public class ClientCode {
    public static void main(String[] args) throws IOException {
        Shop shop = new Shop();
        shop.init();
    }
}
