package ShopItems;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(int boughtPrice, int sellingPrice, String make, String colour, FamilyType family, int noOfStrings) {
        super(boughtPrice, sellingPrice, make, colour, family);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play(String sound) {
        return "Guitar sounds like " + sound;
    }
}
