import ShopItems.Item;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Item> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<Item>();
    }

    public String getName() {
        return name;
    }

    public int countStock() {
        return this.stock.size();
    }

    public ArrayList<Item> getStock() {
        return this.stock;
    }

    public void addStock(Item item) {
        this.stock.add(item);
    }

    public void removeStock(Item item) {
        int index = this.stock.indexOf(item);
        this.stock.remove(index);
    }

    public int calculatePotentialProfit() {
        int potentialProfit = 0;
        for (Item item : this.stock) {
            potentialProfit += item.calculateMarkup();
        }
        return potentialProfit;
    }
}
