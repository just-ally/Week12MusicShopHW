package ShopItems;

import Behaviours.IPlay;

public abstract class Instrument extends Item implements IPlay {

    private String make;
    private String colour;
    private FamilyType family;

    public Instrument(int boughtPrice, int sellingPrice, String make, String colour, FamilyType family) {
        super(boughtPrice, sellingPrice);
        this.make = make;
        this.colour = colour;
        this.family = family;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public FamilyType getFamily() {
        return family;
    }
}
