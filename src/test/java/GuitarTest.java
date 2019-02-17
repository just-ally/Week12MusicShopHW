import ShopItems.FamilyType;
import ShopItems.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(100,250,"Fender", "green", FamilyType.STRING, 6);
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(100, guitar.getBoughtPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(250, guitar.getSellingPrice());
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasColour() {
        assertEquals("green", guitar.getColour());
    }

    @Test
    public void hasFamilyType() {
        assertEquals(FamilyType.STRING, guitar.getFamily());
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar sounds like strumming", guitar.play("strumming"));
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150, guitar.calculateMarkup());
    }
}
