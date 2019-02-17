package ShopItems;

    public class Trumpet extends Instrument {

        private String type;

        public Trumpet(int boughtPrice, int sellingPrice, String make, String colour, FamilyType family, String type) {
            super(boughtPrice, sellingPrice, make, colour, family);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String play(String sound) {
            return "Trumpet sounds like " + sound;
        }
    }

