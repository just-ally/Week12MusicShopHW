package ShopItems;

public abstract class Item {

    private int boughtPrice;
    private int sellingPrice;

    public Item(int boughtPrice, int sellingPrice) {
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int calculateMarkup() {
        return sellingPrice - boughtPrice;
    }
}
